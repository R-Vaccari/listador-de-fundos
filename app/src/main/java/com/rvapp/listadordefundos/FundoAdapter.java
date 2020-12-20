package com.rvapp.listadordefundos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textview.MaterialTextView;
import com.rvapp.listadordefundos.entidades.Fundo;

import java.util.List;

public class FundoAdapter extends RecyclerView.Adapter<FundoAdapter.HolderFundo> {
    private List<Fundo> listFundos;

    public FundoAdapter(List<Fundo> listFundos) {
        this.listFundos = listFundos;
    }

    @NonNull
    @Override
    public HolderFundo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_fundo, parent, false);
        return new HolderFundo(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderFundo holder, int position) {
        Fundo fundo = listFundos.get(position);
        holder.textId.setText(String.valueOf(fundo.getId()));
    }

    @Override
    public int getItemCount() {
        return listFundos.size();
    }

    public static class HolderFundo extends RecyclerView.ViewHolder {
        public MaterialTextView textId;

        public HolderFundo(@NonNull View itemView) {
            super(itemView);
            textId = itemView.findViewById(R.id.card_fundo_text_id);
        }
    }
}
