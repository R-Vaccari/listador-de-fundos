package com.rvapp.listadordefundos.entities.fundo.subparts.especification.subparts;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FundMainStrategy implements Parcelable {
    private String explanation;
    private int fundMacroStrategy;
    private int id;
    private String name;

    public FundMainStrategy() {
    }

    protected FundMainStrategy(Parcel in) {
        explanation = in.readString();
        fundMacroStrategy = in.readInt();
        id = in.readInt();
        name = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(explanation);
        dest.writeInt(fundMacroStrategy);
        dest.writeInt(id);
        dest.writeString(name);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<FundMainStrategy> CREATOR = new Creator<FundMainStrategy>() {
        @Override
        public FundMainStrategy createFromParcel(Parcel in) {
            return new FundMainStrategy(in);
        }

        @Override
        public FundMainStrategy[] newArray(int size) {
            return new FundMainStrategy[size];
        }
    };

    public String getExplanation() {
        return explanation;
    }

    @JsonProperty("explanation")
    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public int getFundMacroStrategy() {
        return fundMacroStrategy;
    }

    @JsonProperty("fund_macro_strategy")
    public void setFundMacroStrategy(int fundMacroStrategy) {
        this.fundMacroStrategy = fundMacroStrategy;
    }

    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }
}
