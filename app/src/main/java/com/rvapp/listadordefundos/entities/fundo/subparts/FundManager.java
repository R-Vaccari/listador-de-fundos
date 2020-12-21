package com.rvapp.listadordefundos.entities.fundo.subparts;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FundManager implements Parcelable {
    private String description;
    private int id;
    private String fullName;
    private String logo;
    private String slug;
    private String name;

    public FundManager() {
    }

    protected FundManager(Parcel in) {
        description = in.readString();
        id = in.readInt();
        fullName = in.readString();
        logo = in.readString();
        slug = in.readString();
        name = in.readString();
    }

    public static final Creator<FundManager> CREATOR = new Creator<FundManager>() {
        @Override
        public FundManager createFromParcel(Parcel in) {
            return new FundManager(in);
        }

        @Override
        public FundManager[] newArray(int size) {
            return new FundManager[size];
        }
    };

    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    @JsonProperty("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLogo() {
        return logo;
    }

    @JsonProperty("logo")
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(description);
        dest.writeInt(id);
        dest.writeString(fullName);
        dest.writeString(logo);
        dest.writeString(slug);
        dest.writeString(name);
    }
}
