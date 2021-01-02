package com.rvapp.listadordefundos.model;

import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rvapp.listadordefundos.model.entities.Fundo;
import com.rvapp.listadordefundos.viewmodel.FundoViewModel;

import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class FundoProvider {
    private final FundoViewModel viewModel;
    private final ObjectMapper objectMapper;

    public FundoProvider(FundoViewModel viewModel) {
        this.viewModel = viewModel;
        objectMapper = new ObjectMapper();
    }

    public void load()  {
        NetworkRunnable runnable = new NetworkRunnable(viewModel, objectMapper);
        Thread networkThread = new Thread(runnable);
        networkThread.start();
    }

    public void loadCacheFile(@Nullable String category) {
        CacheRunnable runnable = new CacheRunnable(viewModel, objectMapper, category);
        Thread cacheThread = new Thread(runnable);
        cacheThread.start();
    }

    static class CacheRunnable implements Runnable {
        private final Handler mainHandler = new Handler(Looper.getMainLooper());
        private final WeakReference<FundoViewModel> fundoViewModelWeakReference;
        private final WeakReference<ObjectMapper> objectMapperWeakReference;
        private final String category;

        public CacheRunnable(FundoViewModel viewModel, ObjectMapper objectMapper, String category) {
            fundoViewModelWeakReference = new WeakReference<>(viewModel);
            objectMapperWeakReference = new WeakReference<>(objectMapper);
            this.category = category;
        }

        @Override
        public void run() {
            FundoViewModel viewModel = fundoViewModelWeakReference.get();
            ObjectMapper objectMapper = objectMapperWeakReference.get();
            if (new File(viewModel.getApplication().getFilesDir().getAbsolutePath() + "/fundos.json").exists()) {
                try {
                    File json = new File(viewModel.getApplication().getFilesDir().getAbsolutePath() + "/fundos.json");
                    List<Fundo> fundos = objectMapper.readValue(json, new TypeReference<List<Fundo>>() {
                        @Override
                        public Type getType() { return super.getType(); }
                    });

                    if (category != null) {
                        List<Fundo> filtrados = new ArrayList<>();
                        for (Fundo fundo : fundos) {
                            if (fundo.getSpecification().getFundType().equals(category)) filtrados.add(fundo);
                        }
                        if (filtrados.size() != 0) mainHandler.post(() -> viewModel.postToLiveData(filtrados));
                    } else mainHandler.post(() -> viewModel.postToLiveData(fundos));
                } catch (IOException e) {
                    mainHandler.post(() -> Toast.makeText(viewModel.getApplication(), "Houve um erro durante a recuperação do cache!", Toast.LENGTH_LONG).show());
                }
            }
        }
    }

    static class NetworkRunnable implements Runnable {
        private final Handler mainHandler = new Handler(Looper.getMainLooper());
        private final WeakReference<FundoViewModel> fundoViewModelWeakReference;
        private final WeakReference<ObjectMapper> objectMapperWeakReference;

        public NetworkRunnable(FundoViewModel viewModel, ObjectMapper objectMapper) {
            fundoViewModelWeakReference = new WeakReference<>(viewModel);
            objectMapperWeakReference = new WeakReference<>(objectMapper);
        }

        @Override
        public void run() {
            FundoViewModel viewModel = fundoViewModelWeakReference.get();
            ObjectMapper objectMapper = objectMapperWeakReference.get();
            try {
                List<Fundo> fundos = objectMapper.readValue(new URL("https://s3.amazonaws.com/orama-media/json/fund_detail_full.json?serializ%20er=fund_detail_full"), new TypeReference<List<Fundo>>() {
                    @Override
                    public Type getType() {
                        return super.getType();
                    }
                });
                mainHandler.post(() -> viewModel.postToLiveData(fundos));
                objectMapper.writeValue(new File(viewModel.getApplication().getFilesDir().getAbsolutePath() + "/fundos.json"), fundos);
            } catch (IOException e) {
                mainHandler.post(() -> Toast.makeText(viewModel.getApplication(), "Houve um erro durante a sincronização!", Toast.LENGTH_LONG).show());
            }
        }
    }
}
