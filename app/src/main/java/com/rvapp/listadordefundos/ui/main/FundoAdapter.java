package com.rvapp.listadordefundos.ui.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textview.MaterialTextView;
import com.rvapp.listadordefundos.R;
import com.rvapp.listadordefundos.entities.Fundo;

import java.util.List;

public class FundoAdapter extends RecyclerView.Adapter<FundoAdapter.HolderFundo> {
    private List<Fundo> listFundos;
    private final Context context;
    private OnItemClickListener clickListener;

    public FundoAdapter(Context context) {
        this.context = context;
    }

    public void setListFundos(List<Fundo> listFundos) {
        this.listFundos = listFundos;
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setClickListener(OnItemClickListener clickListener) {
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public HolderFundo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_fundo, parent, false);
        return new HolderFundo(v, clickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderFundo holder, int position) {
        Fundo fundo = listFundos.get(position);
        colorLateralBar(fundo, holder.lateralBar);
        holder.textSimpleName.setText(fundo.getSimpleName());
        holder.textFundType.setText(fundo.getSpecification().getFundType());
        holder.textProfitability12m.setText(context.getText(R.string.card_rentabilidade_12m) + fundo.getProfitabilities().getM12().substring(0, 5) + "%");
        holder.textMinimumApplication.setText(context.getText(R.string.card_minimum_application) + "R$" + fundo.getOperability().getMinimumInitialApplicationAmount());

        if (fundo.isOramaStandard()) {
            holder.iconOramaStandard.setVisibility(View.VISIBLE);
            holder.textOramaStandard.setVisibility(View.VISIBLE);
        } else {
            holder.iconOramaStandard.setVisibility(View.GONE);
            holder.textOramaStandard.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        if (listFundos != null) return listFundos.size();
        else return 0;
    }

    public Fundo getFromPosition(int position) {
        return listFundos.get(position);
    }

    public void colorLateralBar(Fundo fundo, ImageView lateralBar) {
        switch (fundo.getSpecification().getFundSuitabilityProfile().getName()) {
            case "Conservador":
                lateralBar.setBackgroundColor(context.getResources().getColor(R.color.suitability_conservador));
                break;
            case "Moderado":
                lateralBar.setBackgroundColor(context.getResources().getColor(R.color.suitability_moderado));
                break;
            case "Arrojado":
                lateralBar.setBackgroundColor(context.getResources().getColor(R.color.suitability_arrojado));
                break;
        }
    }

    public static class HolderFundo extends RecyclerView.ViewHolder {
        public ImageView lateralBar;
        public MaterialTextView textSimpleName;
        public MaterialTextView textFundType;
        public MaterialTextView textProfitability12m;
        public MaterialTextView textMinimumApplication;
        public MaterialTextView textOramaStandard;
        public ImageView iconOramaStandard;

        public HolderFundo(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);
            lateralBar = itemView.findViewById(R.id.card_fundo_lateral_bar);
            textSimpleName = itemView.findViewById(R.id.card_fundo_text_simple_name);
            textFundType = itemView.findViewById(R.id.card_fundo_text_fund_type);
            textProfitability12m = itemView.findViewById(R.id.card_fundo_text_fund_profitability_12m);
            textMinimumApplication = itemView.findViewById(R.id.card_fundo_text_fund_minimum_application);
            textOramaStandard = itemView.findViewById(R.id.card_fundo_text_fund_orama_standard);
            iconOramaStandard = itemView.findViewById(R.id.card_fundo_icon_standard);
            itemView.setOnClickListener(v -> {
                if (listener != null) {
                    if (getAdapterPosition() != RecyclerView.NO_POSITION) listener.onItemClick(getAdapterPosition());
                }
            });
        }
    }
}
