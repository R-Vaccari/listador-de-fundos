package com.rvapp.listadordefundos;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private FundoViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new FundoViewModel(getApplication());

        RecyclerView recyclerView = findViewById(R.id.main_recyclerView);
        configureRecycler(recyclerView);
    }

    private void configureRecycler(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        FundoAdapter adapter = new FundoAdapter(viewModel.getFundos().getValue());
        adapter.setHasStableIds(true);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}