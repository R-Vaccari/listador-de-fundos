package com.rvapp.listadordefundos;

import android.os.Handler;
import android.os.Looper;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rvapp.listadordefundos.entidades.Fundo;

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

    static class NetworkRunnable implements Runnable {
        private Handler mainHandler = new Handler(Looper.getMainLooper());
        private WeakReference<FundoViewModel> weakReference;

        public NetworkRunnable(FundoViewModel viewModel) {
            weakReference = new WeakReference<>(viewModel);
        }

        @Override
        public void run() {
            FundoViewModel viewModel = weakReference.get();
            ObjectMapper objectMapper = new ObjectMapper()
                    .enable(JsonParser.Feature.IGNORE_UNDEFINED);
            try {
                List<Fundo> fundos = objectMapper.readValue(new URL("https://s3.amazonaws.com/orama-media/json/fund_detail_full.json?serializ%20er=fund_detail_full"), new TypeReference<List<Fundo>>() {
                    @Override
                    public Type getType() {
                        return super.getType();
                    }
                });
                mainHandler.post(() -> viewModel.postToLiveData(fundos));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
