package com.rvapp.listadordefundos.entidades.fundo.subparts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StrategyVideo {
    private String description;
    private String title;
    private String url;
    private String published;
    private int id;
    private boolean enabledForTvOrama;
    private String youtubeId;
    private String thumbnail;

    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public String getPublished() {
        return published;
    }

    @JsonProperty("published")
    public void setPublished(String published) {
        this.published = published;
    }

    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    public boolean isEnabledForTvOrama() {
        return enabledForTvOrama;
    }

    @JsonProperty("enabled_for_tvorama")
    public void setEnabledForTvOrama(boolean enabledForTvOrama) {
        this.enabledForTvOrama = enabledForTvOrama;
    }

    public String getYoutubeId() {
        return youtubeId;
    }

    @JsonProperty("youtube_id")
    public void setYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    @JsonProperty("thumbnail")
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
