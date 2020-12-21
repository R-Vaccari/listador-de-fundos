package com.rvapp.listadordefundos.entities.fundo.subparts.especification.subparts;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FundSuitabilityProfile implements Parcelable {
    private int scoreRangeOrder;
    private String name;

    public FundSuitabilityProfile() {
    }

    protected FundSuitabilityProfile(Parcel in) {
        scoreRangeOrder = in.readInt();
        name = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(scoreRangeOrder);
        dest.writeString(name);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<FundSuitabilityProfile> CREATOR = new Creator<FundSuitabilityProfile>() {
        @Override
        public FundSuitabilityProfile createFromParcel(Parcel in) {
            return new FundSuitabilityProfile(in);
        }

        @Override
        public FundSuitabilityProfile[] newArray(int size) {
            return new FundSuitabilityProfile[size];
        }
    };

    public int getScoreRangeOrder() {
        return scoreRangeOrder;
    }

    @JsonProperty("score_range_order")
    public void setScoreRangeOrder(int scoreRangeOrder) {
        this.scoreRangeOrder = scoreRangeOrder;
    }

    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }
}
