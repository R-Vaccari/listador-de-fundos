package com.rvapp.listadordefundos.entidades;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PerformanceAudio {
    private String referenceDate;
    private String soundCloudId;
    private String permalinkURL;
    private int id;
    private String title;

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
}
