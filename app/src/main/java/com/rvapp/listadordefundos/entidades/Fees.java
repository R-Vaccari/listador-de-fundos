package com.rvapp.listadordefundos.entidades;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fees {
    private String maximumAdministrationFee;
    private String anticipatedRetrievalFeeValue;
    private String administrationFee;
    private String anticipatedRetrievalFee;
    private String performanceFee;
    private boolean hasAnticipatedRetrieval;

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
}
