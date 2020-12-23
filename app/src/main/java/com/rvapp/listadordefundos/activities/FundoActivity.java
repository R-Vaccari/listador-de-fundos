package com.rvapp.listadordefundos.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textview.MaterialTextView;
import com.rvapp.listadordefundos.R;
import com.rvapp.listadordefundos.entities.Fundo;

public class FundoActivity extends AppCompatActivity {
    private Fundo fundo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fundo);

        MaterialTextView textFullName = findViewById(R.id.fundo_fullName);
        MaterialTextView textDayProfit = findViewById(R.id.fundo_profitability_day_value);
        MaterialTextView textMonthProfit = findViewById(R.id.fundo_profitability_month_value);
        MaterialTextView text12mProfit = findViewById(R.id.fundo_profitability_12m_value);
        MaterialTextView textYearProfit = findViewById(R.id.fundo_profitability_year_value);

        Intent intent = getIntent();
        fundo = intent.getExtras().getParcelable("fundo");
        textFullName.setText(fundo.getFullName());
        textDayProfit.setText(fundo.getProfitabilities().getDay());
        textMonthProfit.setText(fundo.getProfitabilities().getMonth());
        text12mProfit.setText(fundo.getProfitabilities().getM12());
        textYearProfit.setText(fundo.getProfitabilities().getYear());
    }
}
