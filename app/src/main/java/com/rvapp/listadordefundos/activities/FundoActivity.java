package com.rvapp.listadordefundos.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textview.MaterialTextView;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.rvapp.listadordefundos.R;
import com.rvapp.listadordefundos.VideoAdapter;
import com.rvapp.listadordefundos.entities.Fundo;
import com.rvapp.listadordefundos.entities.fundo.subparts.PerformanceVideo;

import java.util.ArrayList;
import java.util.List;

public class FundoActivity extends AppCompatActivity {
    private Fundo fundo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fundo);
        setMainViews();
        RecyclerView recyclerView = findViewById(R.id.fundo_profile_videos_recycler);
        configureRecycler(recyclerView);
    }

    private void configureRecycler(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        VideoAdapter adapter = new VideoAdapter();
        adapter.setListFundos(fundo.getPerformanceVideos());
        adapter.setClickListener(p -> {
            PerformanceVideo video = adapter.getFromPosition(p);
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(video.getUrl()));
            startActivity(intent);
        });
        recyclerView.setAdapter(adapter);
    }

    private void setMainViews() {
        MaterialTextView textFullName = findViewById(R.id.fundo_fullName);
        MaterialTextView textDayProfit = findViewById(R.id.fundo_profitability_day_value);
        MaterialTextView textMonthProfit = findViewById(R.id.fundo_profitability_month_value);
        MaterialTextView text12mProfit = findViewById(R.id.fundo_profitability_12m_value);
        MaterialTextView textYearProfit = findViewById(R.id.fundo_profitability_year_value);
        MaterialTextView textInvestorType = findViewById(R.id.fundo_profile_investor_type_value);
        MaterialTextView textFundRisk = findViewById(R.id.fundo_profile_fund_risk_value);
        MaterialTextView textQualified = findViewById(R.id.fundo_profile_fund_qualified_value);
        ImageView iconQualified = findViewById(R.id.fundo_profile_fund_qualified_icon);
        MaterialTextView textFundClass = findViewById(R.id.fundo_profile_fund_class_value);
        MaterialTextView textMinimumApplication = findViewById(R.id.fundo_profile_fund_minimum_application_value);
        MaterialTextView textMinimumSubApplication = findViewById(R.id.fundo_profile_fund_minimum_sub_application_value);
        MaterialTextView textAdmFee = findViewById(R.id.fundo_profile_fund_adm_fee_value);
        MaterialTextView textPerformanceFee = findViewById(R.id.fundo_profile_fund_performance_fee_value);
        MaterialTextView textMinimumPermanence = findViewById(R.id.fundo_profile_fund_minimum_permanence_value);
        MaterialTextView textRetrievalLiquidation = findViewById(R.id.fundo_profile_fund_liquidation_retrieval_value);
        MaterialTextView textTimeLimit = findViewById(R.id.fundo_profile_fund_time_limit_value);
        MaterialTextView textCNPJ = findViewById(R.id.fundo_profile_fund_cnpj_value);
        MaterialTextView textManagerName = findViewById(R.id.fundo_profile_manager_fullname_value);
        MaterialTextView textStrategyVideoTitle = findViewById(R.id.fundo_profile_strategy_video_title);
        ImageView strategyVideoThumbnail = findViewById(R.id.fundo_profile_strategy_video_thumbnail);

        Intent intent = getIntent();
        fundo = intent.getExtras().getParcelable("fundo");
        textFullName.setText(fundo.getFullName());
        textDayProfit.setText(fundo.getProfitabilities().getDay().substring(0, 6) + "%");
        textMonthProfit.setText(fundo.getProfitabilities().getMonth().substring(0, 6) + "%");
        text12mProfit.setText(fundo.getProfitabilities().getM12().substring(0, 6) + "%");
        textYearProfit.setText(fundo.getProfitabilities().getYear().substring(0, 6) + "%");
        textInvestorType.setText(fundo.getSpecification().getFundSuitabilityProfile().getName());
        textFundRisk.setText(String.valueOf(fundo.getSpecification().getFundRiskProfile().getScoreRangeOrder()));
        setQualifiedTextAndIcon(textQualified, iconQualified);
        textFundClass.setText(fundo.getSpecification().getFundClass());
        textMinimumApplication.setText(fundo.getOperability().getMinimumInitialApplicationAmount());
        textMinimumSubApplication.setText(fundo.getOperability().getMinimumSubsequentApplicationAmount());
        textAdmFee.setText(fundo.getFees().getAdministrationFee());
        textPerformanceFee.setText(fundo.getFees().getPerformanceFee());
        textMinimumPermanence.setText(fundo.getOperability().getMinimumBalancePermanence());
        textRetrievalLiquidation.setText(fundo.getOperability().getRetrievalLiquidationDaysStr());
        textTimeLimit.setText(fundo.getOperability().getRetrievalTimeLimit());
        textCNPJ.setText(fundo.getCnpj());
        textManagerName.setText(fundo.getFundManager().getFullName());

        setProfitColors(textDayProfit);
        setProfitColors(textMonthProfit);
        setProfitColors(text12mProfit);
        setProfitColors(textYearProfit);
        if (fundo.getPerformanceVideos().length == 0) {
            MaterialTextView textStrategyUnavailable = findViewById(R.id.fundo_profile_media_performance_unavailable);
            textStrategyUnavailable.setVisibility(View.VISIBLE);
        }
        if (fundo.getStrategyVideo() != null) setStrategyVideo(textStrategyVideoTitle, strategyVideoThumbnail);
        else {
            MaterialTextView textStrategyUnavailable = findViewById(R.id.fundo_profile_media_strategy_unavailable);
            textStrategyUnavailable.setVisibility(View.VISIBLE);
        }
    }

    private void setStrategyVideo(MaterialTextView textStrategyVideoTitle, ImageView strategyVideoThumbnail) {
        textStrategyVideoTitle.setText(fundo.getStrategyVideo().getTitle());
        ImageLoader imageLoader = ImageLoader.getInstance();
        imageLoader.displayImage(fundo.getStrategyVideo().getThumbnail(), strategyVideoThumbnail);
        strategyVideoThumbnail.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(fundo.getStrategyVideo().getUrl()));
            startActivity(intent);
        });
    }

    private void setProfitColors(MaterialTextView view) {
        if (view.getText().charAt(0) == '-') view.setTextColor(getResources().getColor(R.color.red));
        else view.setTextColor(getResources().getColor(R.color.green_medium));
    }

    private void setQualifiedTextAndIcon(MaterialTextView textQualified, ImageView iconQualified) {
        if (fundo.getSpecification().isQualified()) {
            textQualified.setText(R.string.sim);
            iconQualified.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_baseline_check_circle_24, getTheme()));
        } else {
            textQualified.setText(R.string.nao);
            iconQualified.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_baseline_check_circle_outline_24, getTheme()));
        }
    }
}
