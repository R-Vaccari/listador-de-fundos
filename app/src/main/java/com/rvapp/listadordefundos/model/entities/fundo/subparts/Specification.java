package com.rvapp.listadordefundos.model.entities.fundo.subparts;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rvapp.listadordefundos.model.entities.fundo.subparts.especification.subparts.FundMacroStrategy;
import com.rvapp.listadordefundos.model.entities.fundo.subparts.especification.subparts.FundMainStrategy;
import com.rvapp.listadordefundos.model.entities.fundo.subparts.especification.subparts.FundRiskProfile;
import com.rvapp.listadordefundos.model.entities.fundo.subparts.especification.subparts.FundSuitabilityProfile;

public class Specification implements Parcelable {
    @JsonProperty("fund_suitability_profile") private FundSuitabilityProfile fundSuitabilityProfile;
    @JsonProperty("fund_risk_profile") private FundRiskProfile fundRiskProfile;
    @JsonProperty("is_qualified") private boolean isQualified;
    @JsonProperty("fund_type") private String fundType;
    @JsonProperty("fund_class") private String fundClass;
    @JsonProperty("fund_macro_strategy") private FundMacroStrategy fundMacroStrategy;
    @JsonProperty("fund_class_anbima") private String fundClassAnbima;
    @JsonProperty("fund_main_strategy") private FundMainStrategy fundMainStrategy;

    public Specification() {}

    protected Specification(Parcel in) {
        fundSuitabilityProfile = in.readParcelable(FundSuitabilityProfile.class.getClassLoader());
        fundRiskProfile = in.readParcelable(FundRiskProfile.class.getClassLoader());
        fundMacroStrategy = in.readParcelable(FundMacroStrategy.class.getClassLoader());
        fundMainStrategy = in.readParcelable(FundMainStrategy.class.getClassLoader());
        isQualified = in.readByte() != 0;
        fundType = in.readString();
        fundClass = in.readString();
        fundClassAnbima = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(fundSuitabilityProfile, flags);
        dest.writeParcelable(fundRiskProfile, flags);
        dest.writeParcelable(fundMacroStrategy, flags);
        dest.writeParcelable(fundMainStrategy, flags);
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


    public void setFundSuitabilityProfile(FundSuitabilityProfile fundSuitabilityProfile) {
        this.fundSuitabilityProfile = fundSuitabilityProfile;
    }

    public FundRiskProfile getFundRiskProfile() {
        return fundRiskProfile;
    }


    public void setFundRiskProfile(FundRiskProfile fundRiskProfile) {
        this.fundRiskProfile = fundRiskProfile;
    }

    public boolean isQualified() {
        return isQualified;
    }


    public void setQualified(boolean qualified) {
        isQualified = qualified;
    }

    public String getFundType() {
        return fundType;
    }


    public void setFundType(String fundType) {
        this.fundType = fundType;
    }


    public String getFundClass() {
        return fundClass;
    }


    public void setFundClass(String fundClass) {
        this.fundClass = fundClass;
    }

    public FundMacroStrategy getFundMacroStrategy() {
        return fundMacroStrategy;
    }


    public void setFundMacroStrategy(FundMacroStrategy fundMacroStrategy) {
        this.fundMacroStrategy = fundMacroStrategy;
    }

    public String getFundClassAnbima() {
        return fundClassAnbima;
    }


    public void setFundClassAnbima(String fundClassAnbima) {
        this.fundClassAnbima = fundClassAnbima;
    }

    public FundMainStrategy getFundMainStrategy() {
        return fundMainStrategy;
    }


    public void setFundMainStrategy(FundMainStrategy fundMainStrategy) {
        this.fundMainStrategy = fundMainStrategy;
    }
}
