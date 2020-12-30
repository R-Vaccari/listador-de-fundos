package com.rvapp.listadordefundos.model.entities.fundo.subparts;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Operability implements Parcelable {
    @JsonProperty("has_operations_on_thursdays") private boolean hasOperationsOnThursdays;
    @JsonProperty("retrieval_liquidation_days_type") private String retrievalLiquidationDaysType;
    @JsonProperty("application_quotation_days_type") private String applicationQuotationDaysType;
    @JsonProperty("retrieval_quotation_days") private int retrievalQuotationDays;
    @JsonProperty("anticipated_retrieval_quotation_days_type") private String anticipatedRetrievalQuotationDaysType;
    @JsonProperty("anticipated_retrieval_quotation_days_str") private String anticipatedRetrievalQuotationDaysStr;
    @JsonProperty("retrieval_quotation_days_type") private String retrievalQuotationDaysType;
    @JsonProperty("anticipated_retrieval_quotation_days") private int anticipatedRetrievalQuotationDays;
    @JsonProperty("has_operations_on_wednesdays") private boolean hasOperationsOnWednesdays;
    @JsonProperty("minimum_balance_permanence") private String minimumBalancePermanence;
    @JsonProperty("has_operations_on_mondays") private boolean hasOperationsOnMondays;
    @JsonProperty("has_grace_period") private boolean hasGracePeriod;
    @JsonProperty("application_time_limit") private String applicationTimeLimit;
    @JsonProperty("retrieval_time_limit") private String retrievalTimeLimit;
    @JsonProperty("has_operations_on_fridays") private boolean hasOperationsOnFridays;
    @JsonProperty("anticipate_retrieval_liquidation_days") private int anticipateRetrievalLiquidationDays;
    @JsonProperty("minimum_initial_application_amount") private String minimumInitialApplicationAmount;
    @JsonProperty("anticipate_retrieval_liquidation_days_type") private String anticipateRetrievalLiquidationDaysType;
    @JsonProperty("retrieval_special_type") private String retrievalSpecialType;
    @JsonProperty("anticipate_retrieval_liquidation_days_str") private String anticipateRetrievalLiquidationDaysStr;
    @JsonProperty("application_quotation_days_str") private String applicationQuotationDaysStr;
    @JsonProperty("grace_period_in_days_str") private String gracePeriodInDaysStr;
    @JsonProperty("retrieval_quotation_days_str") private String retrievalQuotationDaysStr;
    @JsonProperty("grace_period_in_days") private int gracePeriodInDays;
    @JsonProperty("retrieval_liquidation_days_str") private String retrievalLiquidationDaysStr;
    @JsonProperty("minimum_subsequent_retrieval_amount") private String minimumSubsequentRetrievalAmount;
    @JsonProperty("retrieval_direct") private boolean retrievalDirect;
    @JsonProperty("retrieval_liquidation_days") private int retrievalLiquidationDays;
    @JsonProperty("application_quotation_days") private int applicationQuotationDays;
    @JsonProperty("max_balance_permanence") private String maxBalancePermanence;
    @JsonProperty("maximum_initial_application_amount") private String maximumInitialApplicationAmount;
    @JsonProperty("has_operations_on_tuesdays") private boolean hasOperationsOnTuesdays;
    @JsonProperty("minimum_subsequent_application_amount") private String minimumSubsequentApplicationAmount;

    public Operability() {
    }

    public boolean isHasOperationsOnThursdays() {
        return hasOperationsOnThursdays;
    }

    public void setHasOperationsOnThursdays(boolean hasOperationsOnThursdays) {
        this.hasOperationsOnThursdays = hasOperationsOnThursdays;
    }

    public String getRetrievalLiquidationDaysType() {
        return retrievalLiquidationDaysType;
    }

    public void setRetrievalLiquidationDaysType(String retrievalLiquidationDaysType) {
        this.retrievalLiquidationDaysType = retrievalLiquidationDaysType;
    }

    public String getApplicationQuotationDaysType() {
        return applicationQuotationDaysType;
    }

    public void setApplicationQuotationDaysType(String applicationQuotationDaysType) {
        this.applicationQuotationDaysType = applicationQuotationDaysType;
    }

    public int getRetrievalQuotationDays() {
        return retrievalQuotationDays;
    }


    public void setRetrievalQuotationDays(int retrievalQuotationDays) {
        this.retrievalQuotationDays = retrievalQuotationDays;
    }

    public String getAnticipatedRetrievalQuotationDaysType() {
        return anticipatedRetrievalQuotationDaysType;
    }

    public void setAnticipatedRetrievalQuotationDaysType(String anticipatedRetrievalQuotationDaysType) {
        this.anticipatedRetrievalQuotationDaysType = anticipatedRetrievalQuotationDaysType;
    }

    public String getAnticipatedRetrievalQuotationDaysStr() {
        return anticipatedRetrievalQuotationDaysStr;
    }

    public void setAnticipatedRetrievalQuotationDaysStr(String anticipatedRetrievalQuotationDaysStr) {
        this.anticipatedRetrievalQuotationDaysStr = anticipatedRetrievalQuotationDaysStr;
    }

    public String getRetrievalQuotationDaysType() {
        return retrievalQuotationDaysType;
    }

    public void setRetrievalQuotationDaysType(String retrievalQuotationDaysType) {
        this.retrievalQuotationDaysType = retrievalQuotationDaysType;
    }

    public int getAnticipatedRetrievalQuotationDays() {
        return anticipatedRetrievalQuotationDays;
    }

    public void setAnticipatedRetrievalQuotationDays(int anticipatedRetrievalQuotationDays) {
        this.anticipatedRetrievalQuotationDays = anticipatedRetrievalQuotationDays;
    }

    public boolean isHasOperationsOnWednesdays() {
        return hasOperationsOnWednesdays;
    }

    public void setHasOperationsOnWednesdays(boolean hasOperationsOnWednesdays) {
        this.hasOperationsOnWednesdays = hasOperationsOnWednesdays;
    }

    public String getMinimumBalancePermanence() {
        return minimumBalancePermanence;
    }

    public void setMinimumBalancePermanence(String minimumBalancePermanence) {
        this.minimumBalancePermanence = minimumBalancePermanence;
    }

    public boolean isHasOperationsOnMondays() {
        return hasOperationsOnMondays;
    }

    public void setHasOperationsOnMondays(boolean hasOperationsOnMondays) {
        this.hasOperationsOnMondays = hasOperationsOnMondays;
    }

    public boolean isHasGracePeriod() {
        return hasGracePeriod;
    }

    public void setHasGracePeriod(boolean hasGracePeriod) {
        this.hasGracePeriod = hasGracePeriod;
    }

    public String getApplicationTimeLimit() {
        return applicationTimeLimit;
    }

    public void setApplicationTimeLimit(String applicationTimeLimit) {
        this.applicationTimeLimit = applicationTimeLimit;
    }

    public String getRetrievalTimeLimit() {
        return retrievalTimeLimit;
    }

    public void setRetrievalTimeLimit(String retrievalTimeLimit) {
        this.retrievalTimeLimit = retrievalTimeLimit;
    }

    public boolean isHasOperationsOnFridays() {
        return hasOperationsOnFridays;
    }


    public void setHasOperationsOnFridays(boolean hasOperationsOnFridays) {
        this.hasOperationsOnFridays = hasOperationsOnFridays;
    }

    public int getAnticipateRetrievalLiquidationDays() {
        return anticipateRetrievalLiquidationDays;
    }

    public void setAnticipateRetrievalLiquidationDays(int anticipateRetrievalLiquidationDays) {
        this.anticipateRetrievalLiquidationDays = anticipateRetrievalLiquidationDays;
    }

    public String getMinimumInitialApplicationAmount() {
        return minimumInitialApplicationAmount;
    }


    public void setMinimumInitialApplicationAmount(String minimumInitialApplicationAmount) {
        this.minimumInitialApplicationAmount = minimumInitialApplicationAmount;
    }

    public String getAnticipateRetrievalLiquidationDaysType() {
        return anticipateRetrievalLiquidationDaysType;
    }


    public void setAnticipateRetrievalLiquidationDaysType(String anticipateRetrievalLiquidationDaysType) {
        this.anticipateRetrievalLiquidationDaysType = anticipateRetrievalLiquidationDaysType;
    }

    public String getRetrievalSpecialType() {
        return retrievalSpecialType;
    }


    public void setRetrievalSpecialType(String retrievalSpecialType) {
        this.retrievalSpecialType = retrievalSpecialType;
    }

    public String getAnticipateRetrievalLiquidationDaysStr() {
        return anticipateRetrievalLiquidationDaysStr;
    }


    public void setAnticipateRetrievalLiquidationDaysStr(String anticipateRetrievalLiquidationDaysStr) {
        this.anticipateRetrievalLiquidationDaysStr = anticipateRetrievalLiquidationDaysStr;
    }

    public String getApplicationQuotationDaysStr() {
        return applicationQuotationDaysStr;
    }


    public void setApplicationQuotationDaysStr(String applicationQuotationDaysStr) {
        this.applicationQuotationDaysStr = applicationQuotationDaysStr;
    }

    public String getGracePeriodInDaysStr() {
        return gracePeriodInDaysStr;
    }


    public void setGracePeriodInDaysStr(String gracePeriodInDaysStr) {
        this.gracePeriodInDaysStr = gracePeriodInDaysStr;
    }

    public String getRetrievalQuotationDaysStr() {
        return retrievalQuotationDaysStr;
    }

    public void setRetrievalQuotationDaysStr(String retrievalQuotationDaysStr) {
        this.retrievalQuotationDaysStr = retrievalQuotationDaysStr;
    }

    public int getGracePeriodInDays() {
        return gracePeriodInDays;
    }


    public void setGracePeriodInDays(int gracePeriodInDays) {
        this.gracePeriodInDays = gracePeriodInDays;
    }

    public String getRetrievalLiquidationDaysStr() {
        return retrievalLiquidationDaysStr;
    }


    public void setRetrievalLiquidationDaysStr(String retrievalLiquidationDaysStr) {
        this.retrievalLiquidationDaysStr = retrievalLiquidationDaysStr;
    }

    public String getMinimumSubsequentRetrievalAmount() {
        return minimumSubsequentRetrievalAmount;
    }


    public void setMinimumSubsequentRetrievalAmount(String minimumSubsequentRetrievalAmount) {
        this.minimumSubsequentRetrievalAmount = minimumSubsequentRetrievalAmount;
    }

    public boolean isRetrievalDirect() {
        return retrievalDirect;
    }


    public void setRetrievalDirect(boolean retrievalDirect) {
        this.retrievalDirect = retrievalDirect;
    }

    public int getRetrievalLiquidationDays() {
        return retrievalLiquidationDays;
    }

    public void setRetrievalLiquidationDays(int retrievalLiquidationDays) {
        this.retrievalLiquidationDays = retrievalLiquidationDays;
    }

    public int getApplicationQuotationDays() {
        return applicationQuotationDays;
    }


    public void setApplicationQuotationDays(int applicationQuotationDays) {
        this.applicationQuotationDays = applicationQuotationDays;
    }

    public String getMaxBalancePermanence() {
        return maxBalancePermanence;
    }


    public void setMaxBalancePermanence(String maxBalancePermanence) {
        this.maxBalancePermanence = maxBalancePermanence;
    }

    public String getMaximumInitialApplicationAmount() {
        return maximumInitialApplicationAmount;
    }


    public void setMaximumInitialApplicationAmount(String maximumInitialApplicationAmount) {
        this.maximumInitialApplicationAmount = maximumInitialApplicationAmount;
    }

    public boolean isHasOperationsOnTuesdays() {
        return hasOperationsOnTuesdays;
    }


    public void setHasOperationsOnTuesdays(boolean hasOperationsOnTuesdays) {
        this.hasOperationsOnTuesdays = hasOperationsOnTuesdays;
    }

    public String getMinimumSubsequentApplicationAmount() {
        return minimumSubsequentApplicationAmount;
    }

    public void setMinimumSubsequentApplicationAmount(String minimumSubsequentApplicationAmount) {
        this.minimumSubsequentApplicationAmount = minimumSubsequentApplicationAmount;
    }

    protected Operability(Parcel in) {
        hasOperationsOnThursdays = in.readByte() != 0;
        retrievalLiquidationDaysType = in.readString();
        applicationQuotationDaysType = in.readString();
        retrievalQuotationDays = in.readInt();
        anticipatedRetrievalQuotationDaysType = in.readString();
        anticipatedRetrievalQuotationDaysStr = in.readString();
        retrievalQuotationDaysType = in.readString();
        anticipatedRetrievalQuotationDays = in.readInt();
        hasOperationsOnWednesdays = in.readByte() != 0;
        minimumBalancePermanence = in.readString();
        hasOperationsOnMondays = in.readByte() != 0;
        hasGracePeriod = in.readByte() != 0;
        applicationTimeLimit = in.readString();
        retrievalTimeLimit = in.readString();
        hasOperationsOnFridays = in.readByte() != 0;
        anticipateRetrievalLiquidationDays = in.readInt();
        minimumInitialApplicationAmount = in.readString();
        anticipateRetrievalLiquidationDaysType = in.readString();
        retrievalSpecialType = in.readString();
        anticipateRetrievalLiquidationDaysStr = in.readString();
        applicationQuotationDaysStr = in.readString();
        gracePeriodInDaysStr = in.readString();
        retrievalQuotationDaysStr = in.readString();
        gracePeriodInDays = in.readInt();
        retrievalLiquidationDaysStr = in.readString();
        minimumSubsequentRetrievalAmount = in.readString();
        retrievalDirect = in.readByte() != 0;
        retrievalLiquidationDays = in.readInt();
        applicationQuotationDays = in.readInt();
        maxBalancePermanence = in.readString();
        maximumInitialApplicationAmount = in.readString();
        hasOperationsOnTuesdays = in.readByte() != 0;
        minimumSubsequentApplicationAmount = in.readString();
    }

    public static final Creator<Operability> CREATOR = new Creator<Operability>() {
        @Override
        public Operability createFromParcel(Parcel in) {
            return new Operability(in);
        }

        @Override
        public Operability[] newArray(int size) {
            return new Operability[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte((byte) (hasOperationsOnThursdays ? 1 : 0));
        dest.writeString(retrievalLiquidationDaysType);
        dest.writeString(applicationQuotationDaysType);
        dest.writeInt(retrievalQuotationDays);
        dest.writeString(anticipatedRetrievalQuotationDaysType);
        dest.writeString(anticipatedRetrievalQuotationDaysStr);
        dest.writeString(retrievalQuotationDaysType);
        dest.writeInt(anticipatedRetrievalQuotationDays);
        dest.writeByte((byte) (hasOperationsOnWednesdays ? 1 : 0));
        dest.writeString(minimumBalancePermanence);
        dest.writeByte((byte) (hasOperationsOnMondays ? 1 : 0));
        dest.writeByte((byte) (hasGracePeriod ? 1 : 0));
        dest.writeString(applicationTimeLimit);
        dest.writeString(retrievalTimeLimit);
        dest.writeByte((byte) (hasOperationsOnFridays ? 1 : 0));
        dest.writeInt(anticipateRetrievalLiquidationDays);
        dest.writeString(minimumInitialApplicationAmount);
        dest.writeString(anticipateRetrievalLiquidationDaysType);
        dest.writeString(retrievalSpecialType);
        dest.writeString(anticipateRetrievalLiquidationDaysStr);
        dest.writeString(applicationQuotationDaysStr);
        dest.writeString(gracePeriodInDaysStr);
        dest.writeString(retrievalQuotationDaysStr);
        dest.writeInt(gracePeriodInDays);
        dest.writeString(retrievalLiquidationDaysStr);
        dest.writeString(minimumSubsequentRetrievalAmount);
        dest.writeByte((byte) (retrievalDirect ? 1 : 0));
        dest.writeInt(retrievalLiquidationDays);
        dest.writeInt(applicationQuotationDays);
        dest.writeString(maxBalancePermanence);
        dest.writeString(maximumInitialApplicationAmount);
        dest.writeByte((byte) (hasOperationsOnTuesdays ? 1 : 0));
        dest.writeString(minimumSubsequentApplicationAmount);
    }
}
