package com.rvapp.listadordefundos.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Specification {
    private boolean isQualified;
    private String fundType;

    public Specification() {}

    public Specification(boolean isQualified, String fundType) {
        this.isQualified = isQualified;
        this.fundType = fundType;
    }

    public boolean isQualified() {
        return isQualified;
    }

    @JsonProperty("is_qualified")
    public void setQualified(boolean qualified) {
        isQualified = qualified;
    }

    public String getFundType() {
        return fundType;
    }

    @JsonProperty("fund_type")
    public void setFundType(String fundType) {
        this.fundType = fundType;
    }
}
