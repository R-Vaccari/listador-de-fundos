package com.rvapp.listadordefundos;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rvapp.listadordefundos.entidades.Fundo;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "PARSER TEST";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Thread(new NetworkRunnable()).start();
    }

    static class NetworkRunnable implements Runnable {
        final Handler mainHandler = new Handler(Looper.getMainLooper());

        @Override
        public void run() {
            ObjectMapper objectMapper = new ObjectMapper()
                    .enable(JsonParser.Feature.IGNORE_UNDEFINED);
            try {
                List<Fundo> fundos = objectMapper.readValue(new URL("https://s3.amazonaws.com/orama-media/json/fund_detail_full.json?serializ%20er=fund_detail_full"), new TypeReference<List<Fundo>>() {
                    @Override
                    public Type getType() {
                        return super.getType();
                    }
                });
                System.out.println(fundos);
            } catch (IOException e) {
                e.printStackTrace();
            }

            /*
            JsonFactory jsonFactory = new JsonFactory();
            try {
                JsonParser jsonParser = jsonFactory.createParser(new URL("https://s3.amazonaws.com/orama-media/json/fund_detail_full.json?serializ%20er=fund_detail_full"));
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    jsonParser.nextValue();
                    while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = jsonParser.getCurrentName();
                        if (fieldName.equals("id")) {
                            Fundo fundo = new Fundo(jsonParser.getIntValue());
                            System.out.println(fundo);
                        }
                        jsonParser.nextToken();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

             */
        }
    }
}