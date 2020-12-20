package com.rvapp.listadordefundos;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rvapp.listadordefundos.entidades.Fundo;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rcv = findViewById(R.id.main_recyclerView);

        FundoViewModel viewModel = new FundoViewModel(getApplication());
        List<Fundo> fundos = viewModel.getFundos().getValue();
        System.out.println(fundos);
    }
}