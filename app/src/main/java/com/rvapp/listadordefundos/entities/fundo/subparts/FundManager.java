package com.rvapp.listadordefundos.entities.fundo.subparts;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FundManager implements Parcelable {
    @JsonProperty("description") private String description;
    @JsonProperty("id") private int id;
    @JsonProperty("full_name") private String fullName;
    @JsonProperty("logo") private String logo;
    @JsonProperty("slug") private String slug;
    @JsonProperty("name") private String name;

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


    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLogo() {
        return logo;
    }


    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getSlug() {
        return slug;
    }


    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }


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
