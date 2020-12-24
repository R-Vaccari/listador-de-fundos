package com.rvapp.listadordefundos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textview.MaterialTextView;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.rvapp.listadordefundos.entities.fundo.subparts.PerformanceVideo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.HolderVideo> {
    private final List<PerformanceVideo> listVideos = new ArrayList<>();
    private OnItemClickListener clickListener;

    public void setListFundos(PerformanceVideo[] listVideos) {
        Collections.addAll(this.listVideos, listVideos);
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setClickListener(OnItemClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public PerformanceVideo getFromPosition(int position) {
        return listVideos.get(position);
    }

    @NonNull
    @Override
    public HolderVideo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_video, parent, false);
        return new HolderVideo(v, clickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderVideo holder, int position) {
        PerformanceVideo video = listVideos.get(position);
        ImageLoader imageLoader = ImageLoader.getInstance();
        imageLoader.displayImage(video.getThumbnail(), holder.thumbnail);
        holder.videoTitle.setText(video.getTitle());
    }

    @Override
    public int getItemCount() {
        if (listVideos != null) return listVideos.size();
        else return 0;
    }

    public static class HolderVideo extends RecyclerView.ViewHolder {
        public ImageView thumbnail;
        public MaterialTextView videoTitle;

        public HolderVideo(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);
            thumbnail = itemView.findViewById(R.id.card_video_thumbnail);
            videoTitle = itemView.findViewById(R.id.card_video_title);
            itemView.setOnClickListener(v -> {
                if (listener != null) {
                    if (getAdapterPosition() != RecyclerView.NO_POSITION) listener.onItemClick(getAdapterPosition());
                }
            });
        }
    }
}
