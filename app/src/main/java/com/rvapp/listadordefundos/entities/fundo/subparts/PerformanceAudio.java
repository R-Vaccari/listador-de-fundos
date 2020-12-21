package com.rvapp.listadordefundos.entities.fundo.subparts;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PerformanceAudio implements Parcelable {
    private String referenceDate;
    private String soundCloudId;
    private String permalinkURL;
    private int id;
    private String title;

    public PerformanceAudio() {
    }

    protected PerformanceAudio(Parcel in) {
        referenceDate = in.readString();
        soundCloudId = in.readString();
        permalinkURL = in.readString();
        id = in.readInt();
        title = in.readString();
    }

    public static final Creator<PerformanceAudio> CREATOR = new Creator<PerformanceAudio>() {
        @Override
        public PerformanceAudio createFromParcel(Parcel in) {
            return new PerformanceAudio(in);
        }

        @Override
        public PerformanceAudio[] newArray(int size) {
            return new PerformanceAudio[size];
        }
    };

    public String getReferenceDate() {
        return referenceDate;
    }

    @JsonProperty("reference_date")
    public void setReferenceDate(String referenceDate) {
        this.referenceDate = referenceDate;
    }

    public String getSoundCloudId() {
        return soundCloudId;
    }

    @JsonProperty("soundcloud_id")
    public void setSoundCloudId(String soundCloudId) {
        this.soundCloudId = soundCloudId;
    }

    public String getPermalinkURL() {
        return permalinkURL;
    }

    @JsonProperty("permalink_url")
    public void setPermalinkURL(String permalinkURL) {
        this.permalinkURL = permalinkURL;
    }

    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(referenceDate);
        dest.writeString(soundCloudId);
        dest.writeString(permalinkURL);
        dest.writeInt(id);
        dest.writeString(title);
    }
}
