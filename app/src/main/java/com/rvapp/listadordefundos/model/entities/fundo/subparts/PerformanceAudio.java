package com.rvapp.listadordefundos.model.entities.fundo.subparts;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PerformanceAudio implements Parcelable {
    @JsonProperty("reference_date") private String referenceDate;
    @JsonProperty("soundcloud_id") private String soundCloudId;
    @JsonProperty("permalink_url") private String permalinkURL;
    @JsonProperty("id") private int id;
    @JsonProperty("title") private String title;

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


    public void setReferenceDate(String referenceDate) {
        this.referenceDate = referenceDate;
    }

    public String getSoundCloudId() {
        return soundCloudId;
    }


    public void setSoundCloudId(String soundCloudId) {
        this.soundCloudId = soundCloudId;
    }

    public String getPermalinkURL() {
        return permalinkURL;
    }


    public void setPermalinkURL(String permalinkURL) {
        this.permalinkURL = permalinkURL;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }


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
