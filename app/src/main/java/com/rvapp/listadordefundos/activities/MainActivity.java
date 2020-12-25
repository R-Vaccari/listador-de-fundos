package com.rvapp.listadordefundos.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textview.MaterialTextView;
import com.rvapp.listadordefundos.ui.main.FundoAdapter;
import com.rvapp.listadordefundos.viewmodel.FundoViewModel;
import com.rvapp.listadordefundos.R;

public class MainActivity extends AppCompatActivity {
    private FundoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // TODO: filtros para fundos.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.main_recyclerView);
        ContentLoadingProgressBar progressBar = findViewById(R.id.main_progressBar);
        MaterialTextView progressText = findViewById(R.id.main_progressText);
        configureRecycler(recyclerView);

        FundoViewModel viewModel = new FundoViewModel(getApplication());
        viewModel.getFundos().observe(this, fundos -> {  // Recebe atualizações de cache e web.
            progressBar.hide();
            progressText.setVisibility(View.GONE);
            adapter.setListFundos(fundos);
            adapter.notifyDataSetChanged();
        });
    }

    private void configureRecycler(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new FundoAdapter(this);
        adapter.setClickListener(p -> {
            Intent intent = new Intent(this, FundoActivity.class);
            intent.putExtra("fundo", adapter.getFromPosition(p));
            startActivity(intent);
        });
        recyclerView.setAdapter(adapter);
    }
}