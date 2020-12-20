package com.rvapp.listadordefundos;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rvapp.listadordefundos.entidades.Fundo;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;

public class FundoProvider {
    private List<Fundo> fundos;

    public List<Fundo> getFundos()  {
        try {
            NetworkRunnable runnable = new NetworkRunnable();
            Thread networkThread = new Thread(runnable);
            networkThread.start();
            networkThread.join();
            fundos = runnable.getFundos();
            return fundos;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    static class NetworkRunnable implements Runnable {
        private List<Fundo> fundos;

        @Override
        public void run() {
            ObjectMapper objectMapper = new ObjectMapper()
                    .enable(JsonParser.Feature.IGNORE_UNDEFINED);
            try {
                fundos = objectMapper.readValue(new URL("https://s3.amazonaws.com/orama-media/json/fund_detail_full.json?serializ%20er=fund_detail_full"), new TypeReference<List<Fundo>>() {
                    @Override
                    public Type getType() {
                        return super.getType();
                    }
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public List<Fundo> getFundos() {
            return  fundos;
        }
    }
}
