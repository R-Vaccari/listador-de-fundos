package com.rvapp.listadordefundos.entities.fundo.subparts.especification.subparts;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FundRiskProfile implements Parcelable {
    @JsonProperty("score_range_order") private int scoreRangeOrder;
    @JsonProperty("name") private String name;

    public FundRiskProfile() {
    }

    protected FundRiskProfile(Parcel in) {
        scoreRangeOrder = in.readInt();
        name = in.readString();
    }

    public static final Creator<FundRiskProfile> CREATOR = new Creator<FundRiskProfile>() {
        @Override
        public FundRiskProfile createFromParcel(Parcel in) {
            return new FundRiskProfile(in);
        }

        @Override
        public FundRiskProfile[] newArray(int size) {
            return new FundRiskProfile[size];
        }
    };

    public int getScoreRangeOrder() {
        return scoreRangeOrder;
    }

    public void setScoreRangeOrder(int scoreRangeOrder) {
        this.scoreRangeOrder = scoreRangeOrder;
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
        dest.writeInt(scoreRangeOrder);
        dest.writeString(name);
    }
}
