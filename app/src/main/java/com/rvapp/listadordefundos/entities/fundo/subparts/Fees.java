package com.rvapp.listadordefundos.entities.fundo.subparts;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fees implements Parcelable {
    private String maximumAdministrationFee;
    private String anticipatedRetrievalFeeValue;
    private String administrationFee;
    private String anticipatedRetrievalFee;
    private String performanceFee;
    private boolean hasAnticipatedRetrieval;

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

    @JsonProperty("maximum_administration_fee")
    public void setMaximumAdministrationFee(String maximumAdministrationFee) {
        this.maximumAdministrationFee = maximumAdministrationFee;
    }

    public String getAnticipatedRetrievalFeeValue() {
        return anticipatedRetrievalFeeValue;
    }

    @JsonProperty("anticipated_retrieval_fee_value")
    public void setAnticipatedRetrievalFeeValue(String anticipatedRetrievalFeeValue) {
        this.anticipatedRetrievalFeeValue = anticipatedRetrievalFeeValue;
    }

    public String getAdministrationFee() {
        return administrationFee;
    }

    @JsonProperty("administration_fee")
    public void setAdministrationFee(String administrationFee) {
        this.administrationFee = administrationFee;
    }

    public String getAnticipatedRetrievalFee() {
        return anticipatedRetrievalFee;
    }

    @JsonProperty("anticipated_retrieval_fee")
    public void setAnticipatedRetrievalFee(String anticipatedRetrievalFee) {
        this.anticipatedRetrievalFee = anticipatedRetrievalFee;
    }

    public String getPerformanceFee() {
        return performanceFee;
    }

    @JsonProperty("performance_fee")
    public void setPerformanceFee(String performanceFee) {
        this.performanceFee = performanceFee;
    }

    public boolean isHasAnticipatedRetrieval() {
        return hasAnticipatedRetrieval;
    }

    @JsonProperty("has_anticipated_retrieval")
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
