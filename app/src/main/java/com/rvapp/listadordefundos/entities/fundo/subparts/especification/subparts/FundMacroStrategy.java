package com.rvapp.listadordefundos.entities.fundo.subparts.especification.subparts;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FundMacroStrategy implements Parcelable {
    @JsonProperty("explanation") private String explanation;
    @JsonProperty("id") private int id;
    @JsonProperty("name") private String name;

    public FundMacroStrategy() {
    }

    protected FundMacroStrategy(Parcel in) {
        explanation = in.readString();
        id = in.readInt();
        name = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(explanation);
        dest.writeInt(id);
        dest.writeString(name);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<FundMacroStrategy> CREATOR = new Creator<FundMacroStrategy>() {
        @Override
        public FundMacroStrategy createFromParcel(Parcel in) {
            return new FundMacroStrategy(in);
        }

        @Override
        public FundMacroStrategy[] newArray(int size) {
            return new FundMacroStrategy[size];
        }
    };

    public String getExplanation() {
        return explanation;
    }


    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}
