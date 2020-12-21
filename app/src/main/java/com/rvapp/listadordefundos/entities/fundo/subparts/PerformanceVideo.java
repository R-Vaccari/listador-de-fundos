package com.rvapp.listadordefundos.entities.fundo.subparts;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PerformanceVideo implements Parcelable {
    private String description;
    private String title;
    private String url;
    private String published;
    private int id;
    private boolean enabledForTvOrama;
    private String youtubeId;
    private String thumbnail;

    public PerformanceVideo() {
    }

    protected PerformanceVideo(Parcel in) {
        description = in.readString();
        title = in.readString();
        url = in.readString();
        published = in.readString();
        id = in.readInt();
        enabledForTvOrama = in.readByte() != 0;
        youtubeId = in.readString();
        thumbnail = in.readString();
    }

    public static final Creator<PerformanceVideo> CREATOR = new Creator<PerformanceVideo>() {
        @Override
        public PerformanceVideo createFromParcel(Parcel in) {
            return new PerformanceVideo(in);
        }

        @Override
        public PerformanceVideo[] newArray(int size) {
            return new PerformanceVideo[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(description);
        dest.writeString(title);
        dest.writeString(url);
        dest.writeString(published);
        dest.writeInt(id);
        dest.writeByte((byte) (enabledForTvOrama ? 1 : 0));
        dest.writeString(youtubeId);
        dest.writeString(thumbnail);
    }
}
