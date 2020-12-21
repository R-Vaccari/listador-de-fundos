package com.rvapp.listadordefundos.entities.fundo.subparts;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rvapp.listadordefundos.entities.fundo.subparts.especification.subparts.FundMacroStrategy;
import com.rvapp.listadordefundos.entities.fundo.subparts.especification.subparts.FundMainStrategy;
import com.rvapp.listadordefundos.entities.fundo.subparts.especification.subparts.FundRiskProfile;
import com.rvapp.listadordefundos.entities.fundo.subparts.especification.subparts.FundSuitabilityProfile;

public class Specification implements Parcelable {
    private FundSuitabilityProfile fundSuitabilityProfile;
    private FundRiskProfile fundRiskProfile;
    private boolean isQualified;
    private String fundType;
    private String fundClass;
    private FundMacroStrategy fundMacroStrategy;
    private String fundClassAnbima;
    private FundMainStrategy fundMainStrategy;

    public Specification() {}

    protected Specification(Parcel in) {
        isQualified = in.readByte() != 0;
        fundType = in.readString();
        fundClass = in.readString();
        fundClassAnbima = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte((byte) (isQualified ? 1 : 0));
        dest.writeString(fundType);
        dest.writeString(fundClass);
        dest.writeString(fundClassAnbima);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Specification> CREATOR = new Creator<Specification>() {
        @Override
        public Specification createFromParcel(Parcel in) {
            return new Specification(in);
        }

        @Override
        public Specification[] newArray(int size) {
            return new Specification[size];
        }
    };

    public FundSuitabilityProfile getFundSuitabilityProfile() {
        return fundSuitabilityProfile;
    }

    @JsonProperty("fund_suitability_profile")
    public void setFundSuitabilityProfile(FundSuitabilityProfile fundSuitabilityProfile) {
        this.fundSuitabilityProfile = fundSuitabilityProfile;
    }

    public FundRiskProfile getFundRiskProfile() {
        return fundRiskProfile;
    }

    @JsonProperty("fund_risk_profile")
    public void setFundRiskProfile(FundRiskProfile fundRiskProfile) {
        this.fundRiskProfile = fundRiskProfile;
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


    public String getFundClass() {
        return fundClass;
    }

    @JsonProperty("fund_class")
    public void setFundClass(String fundClass) {
        this.fundClass = fundClass;
    }

    public FundMacroStrategy getFundMacroStrategy() {
        return fundMacroStrategy;
    }

    @JsonProperty("fund_macro_strategy")
    public void setFundMacroStrategy(FundMacroStrategy fundMacroStrategy) {
        this.fundMacroStrategy = fundMacroStrategy;
    }

    public String getFundClassAnbima() {
        return fundClassAnbima;
    }

    @JsonProperty("fund_class_anbima")
    public void setFundClassAnbima(String fundClassAnbima) {
        this.fundClassAnbima = fundClassAnbima;
    }

    public FundMainStrategy getFundMainStrategy() {
        return fundMainStrategy;
    }

    @JsonProperty("fund_main_strategy")
    public void setFundMainStrategy(FundMainStrategy fundMainStrategy) {
        this.fundMainStrategy = fundMainStrategy;
    }
}
