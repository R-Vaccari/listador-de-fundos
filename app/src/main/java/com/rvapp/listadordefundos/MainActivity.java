package com.rvapp.listadordefundos;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rvapp.listadordefundos.entidades.Fundo;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private FundoViewModel viewModel;
    private FundoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.main_recyclerView);
        configureRecycler(recyclerView);

        viewModel = new FundoViewModel(getApplication());
        viewModel.getFundos().observe(this, new Observer<List<Fundo>>() {
            @Override
            public void onChanged(List<Fundo> fundos) {
                adapter.setListFundos(fundos);
                adapter.notifyDataSetChanged();
            }
        });
    }

    private void configureRecycler(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        adapter = new FundoAdapter();
        adapter.setHasStableIds(true);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}