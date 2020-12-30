package com.rvapp.listadordefundos.model.entities.fundo.subparts;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FundSituation implements Parcelable {
    @JsonProperty("code") private String code;
    @JsonProperty("name") private String name;

    public FundSituation() {
    }

    protected FundSituation(Parcel in) {
        code = in.readString();
        name = in.readString();
    }

    public static final Creator<FundSituation> CREATOR = new Creator<FundSituation>() {
        @Override
        public FundSituation createFromParcel(Parcel in) {
            return new FundSituation(in);
        }

        @Override
        public FundSituation[] newArray(int size) {
            return new FundSituation[size];
        }
    };

    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
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
        dest.writeString(code);
        dest.writeString(name);
    }
}
