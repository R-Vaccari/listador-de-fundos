package com.rvapp.listadordefundos.model.entities.fundo.subparts;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fees implements Parcelable {
    @JsonProperty("maximum_administration_fee") private String maximumAdministrationFee;
    @JsonProperty("anticipated_retrieval_fee_value") private String anticipatedRetrievalFeeValue;
    @JsonProperty("administration_fee") private String administrationFee;
    @JsonProperty("anticipated_retrieval_fee") private String anticipatedRetrievalFee;
    @JsonProperty("performance_fee") private String performanceFee;
    @JsonProperty("has_anticipated_retrieval") private boolean hasAnticipatedRetrieval;

    public Fees() {
    }

    protected Fees(Parcel in) {
        maximumAdministrationFee = in.readString();
        anticipatedRetrievalFeeValue = in.readString();
        administrationFee = in.readString();
        anticipatedRetrievalFee = in.readString();
        performanceFee = in.readString();
        hasAnticipatedRetrieval = in.readByte() != 0;
    }

    public static final Creator<Fees> CREATOR = new Creator<Fees>() {
        @Override
        public Fees createFromParcel(Parcel in) {
            return new Fees(in);
        }

        @Override
        public Fees[] newArray(int size) {
            return new Fees[size];
        }
    };

    public String getMaximumAdministrationFee() {
        return maximumAdministrationFee;
    }


    public void setMaximumAdministrationFee(String maximumAdministrationFee) {
        this.maximumAdministrationFee = maximumAdministrationFee;
    }

    public String getAnticipatedRetrievalFeeValue() {
        return anticipatedRetrievalFeeValue;
    }


    public void setAnticipatedRetrievalFeeValue(String anticipatedRetrievalFeeValue) {
        this.anticipatedRetrievalFeeValue = anticipatedRetrievalFeeValue;
    }

    public String getAdministrationFee() {
        return administrationFee;
    }


    public void setAdministrationFee(String administrationFee) {
        this.administrationFee = administrationFee;
    }

    public String getAnticipatedRetrievalFee() {
        return anticipatedRetrievalFee;
    }

    public void setAnticipatedRetrievalFee(String anticipatedRetrievalFee) {
        this.anticipatedRetrievalFee = anticipatedRetrievalFee;
    }

    public String getPerformanceFee() {
        return performanceFee;
    }


    public void setPerformanceFee(String performanceFee) {
        this.performanceFee = performanceFee;
    }

    public boolean isHasAnticipatedRetrieval() {
        return hasAnticipatedRetrieval;
    }


    public void setHasAnticipatedRetrieval(boolean hasAnticipatedRetrieval) {
        this.hasAnticipatedRetrieval = hasAnticipatedRetrieval;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(maximumAdministrationFee);
        dest.writeString(anticipatedRetrievalFeeValue);
        dest.writeString(administrationFee);
        dest.writeString(anticipatedRetrievalFee);
        dest.writeString(performanceFee);
        dest.writeByte((byte) (hasAnticipatedRetrieval ? 1 : 0));
    }
}
