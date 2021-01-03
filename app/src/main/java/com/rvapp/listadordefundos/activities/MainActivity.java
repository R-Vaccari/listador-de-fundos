package com.rvapp.listadordefundos.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textview.MaterialTextView;
import com.rvapp.listadordefundos.ui.main.FundoAdapter;
import com.rvapp.listadordefundos.ui.main.FundoFilter;
import com.rvapp.listadordefundos.viewmodel.FundoViewModel;
import com.rvapp.listadordefundos.R;

public class MainActivity extends AppCompatActivity {
    private FundoAdapter adapter;
    private FundoViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.main_recyclerView);
        ContentLoadingProgressBar progressBar = findViewById(R.id.main_progressBar);
        MaterialTextView progressText = findViewById(R.id.main_progressText);
        ChipGroup chipGroup = findViewById(R.id.main_chipgroup);
        chipGroup.setOnCheckedChangeListener((group, checkedId) -> {
            if (group.getCheckedChipId() != View.NO_ID) {
                Chip chip = findViewById(group.getCheckedChipId());
                viewModel.loadByCategory(chip.getText().toString());
            } else viewModel.loadCache();
        });
        configureRecycler(recyclerView);
        configureInputs();

        viewModel = new FundoViewModel(getApplication());
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

    private void configureInputs() {
        MaterialAutoCompleteTextView applicationAutoComplete = findViewById(R.id.main_filter_minimum_application_value);
        ArrayAdapter<CharSequence> aportesAdapter = ArrayAdapter.createFromResource(this, R.array.aportes, R.layout.support_simple_spinner_dropdown_item);
        applicationAutoComplete.setAdapter(aportesAdapter);
        applicationAutoComplete.setOnItemClickListener((parent, view, position, id) -> {
            FundoFilter filter = adapter.getFilter();
            if (position == 0) filter.setApplicationFilterEnabled(false);
            else {
                filter.setApplicationFilterEnabled(true);
                filter.setApplicationFilter(applicationAutoComplete.getText().toString().replace(".", ""));
            }
            adapter.notifyDataSetChanged();
        });


        MaterialAutoCompleteTextView profileAutoComplete = findViewById(R.id.main_filter_profile_value);
        ArrayAdapter<CharSequence> perfisAdapter = ArrayAdapter.createFromResource(this, R.array.perfis, R.layout.support_simple_spinner_dropdown_item);
        profileAutoComplete.setAdapter(perfisAdapter);
    }
}