package com.rvapp.listadordefundos;

import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rvapp.listadordefundos.entities.Fundo;

import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;

public class FundoProvider {
    private final FundoViewModel viewModel;

    public FundoProvider(FundoViewModel viewModel) {
        this.viewModel = viewModel;
    }

    public void load()  {
        NetworkRunnable runnable = new NetworkRunnable(viewModel);
        Thread networkThread = new Thread(runnable);
        networkThread.start();
    }

    public void loadCacheFile() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File json = new File(viewModel.getApplication().getFilesDir().getAbsolutePath() + "/fundos.json");
            List<Fundo> fundos = objectMapper.readValue(json, new TypeReference<List<Fundo>>() {
                @Override
                public Type getType() {
                    return super.getType();
                }
            });
            viewModel.postToLiveData(fundos);
        } catch (IOException e) {
            Toast.makeText(viewModel.getApplication(), "Houve um erro durante a recuperação do cache!", Toast.LENGTH_LONG).show();
        }
    }

    static class NetworkRunnable implements Runnable {
        private final Handler mainHandler = new Handler(Looper.getMainLooper());
        private final WeakReference<FundoViewModel> weakReference;

        public NetworkRunnable(FundoViewModel viewModel) {
            weakReference = new WeakReference<>(viewModel);
        }

        @Override
        public void run() {
            FundoViewModel viewModel = weakReference.get();
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                mainHandler.post(() -> Toast.makeText(viewModel.getApplication(), "Sincronizando...", Toast.LENGTH_LONG).show());
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
