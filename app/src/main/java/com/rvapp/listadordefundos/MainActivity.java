package com.rvapp.listadordefundos;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity {
    private FundoViewModel viewModel;
    private FundoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.main_recyclerView);
        ContentLoadingProgressBar progressBar = findViewById(R.id.main_progressBar);
        MaterialTextView progressText = findViewById(R.id.main_progressText);
        configureRecycler(recyclerView);

        viewModel = new FundoViewModel(getApplication());
        viewModel.getFundos().observe(this, fundos -> {
            progressBar.hide();
            progressText.setVisibility(View.GONE);
            adapter.setListFundos(fundos);
            adapter.notifyDataSetChanged();
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