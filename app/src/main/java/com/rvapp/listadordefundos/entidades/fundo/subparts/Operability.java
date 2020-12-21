package com.rvapp.listadordefundos.entidades.fundo.subparts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Operability {
    private boolean hasOperationsOnThursdays;
    private String retrievalLiquidationDaysType;
    private String applicationQuotationDaysType;
    private int retrievalQuotationDays;
    private String anticipatedRetrievalQuotationDaysType;
    private String anticipatedRetrievalQuotationDaysStr;
    private String retrievalQuotationDaysType;
    private int anticipatedRetrievalQuotationDays;
    private boolean hasOperationsOnWednesdays;
    private String minimumBalancePermanence;
    private boolean hasOperationsOnMondays;
    private boolean hasGracePeriod;
    private String applicationTimeLimit;
    private String retrievalTimeLimit;
    private boolean hasOperationsOnFridays;
    private int anticipateRetrievalLiquidationDays;
    private String minimumInitialApplicationAmount;
    private String anticipateRetrievalLiquidationDaysType;
    private String retrievalSpecialType;
    private String anticipateRetrievalLiquidationDaysStr;
    private String applicationQuotationDaysStr;
    private String gracePeriodInDaysStr;
    private String retrievalQuotationDaysStr;
    private int gracePeriodInDays;
    private String retrievalLiquidationDaysStr;
    private String minimumSubsequentRetrievalAmount;
    private boolean retrievalDirect;
    private int retrievalLiquidationDays;
    private int applicationQuotationDays;
    private String maxBalancePermanence;
    private String maximumInitialApplicationAmount;
    private boolean hasOperationsOnTuesdays;
    private String minimumSubsequentApplicationAmount;

    public boolean isHasOperationsOnThursdays() {
        return hasOperationsOnThursdays;
    }

    @JsonProperty("has_operations_on_thursdays")
    public void setHasOperationsOnThursdays(boolean hasOperationsOnThursdays) {
        this.hasOperationsOnThursdays = hasOperationsOnThursdays;
    }

    public String getRetrievalLiquidationDaysType() {
        return retrievalLiquidationDaysType;
    }

    @JsonProperty("retrieval_liquidation_days_type")
    public void setRetrievalLiquidationDaysType(String retrievalLiquidationDaysType) {
        this.retrievalLiquidationDaysType = retrievalLiquidationDaysType;
    }

    public String getApplicationQuotationDaysType() {
        return applicationQuotationDaysType;
    }

    @JsonProperty("application_quotation_days_type")
    public void setApplicationQuotationDaysType(String applicationQuotationDaysType) {
        this.applicationQuotationDaysType = applicationQuotationDaysType;
    }

    public int getRetrievalQuotationDays() {
        return retrievalQuotationDays;
    }

    @JsonProperty("retrieval_quotation_days")
    public void setRetrievalQuotationDays(int retrievalQuotationDays) {
        this.retrievalQuotationDays = retrievalQuotationDays;
    }

    public String getAnticipatedRetrievalQuotationDaysType() {
        return anticipatedRetrievalQuotationDaysType;
    }

    @JsonProperty("anticipated_retrieval_quotation_days_type")
    public void setAnticipatedRetrievalQuotationDaysType(String anticipatedRetrievalQuotationDaysType) {
        this.anticipatedRetrievalQuotationDaysType = anticipatedRetrievalQuotationDaysType;
    }

    public String getAnticipatedRetrievalQuotationDaysStr() {
        return anticipatedRetrievalQuotationDaysStr;
    }

    @JsonProperty("anticipated_retrieval_quotation_days_str")
    public void setAnticipatedRetrievalQuotationDaysStr(String anticipatedRetrievalQuotationDaysStr) {
        this.anticipatedRetrievalQuotationDaysStr = anticipatedRetrievalQuotationDaysStr;
    }

    public String getRetrievalQuotationDaysType() {
        return retrievalQuotationDaysType;
    }

    @JsonProperty("retrieval_quotation_days_type")
    public void setRetrievalQuotationDaysType(String retrievalQuotationDaysType) {
        this.retrievalQuotationDaysType = retrievalQuotationDaysType;
    }

    public int getAnticipatedRetrievalQuotationDays() {
        return anticipatedRetrievalQuotationDays;
    }

    @JsonProperty("anticipated_retrieval_quotation_days")
    public void setAnticipatedRetrievalQuotationDays(int anticipatedRetrievalQuotationDays) {
        this.anticipatedRetrievalQuotationDays = anticipatedRetrievalQuotationDays;
    }

    public boolean isHasOperationsOnWednesdays() {
        return hasOperationsOnWednesdays;
    }

    @JsonProperty("has_operations_on_wednesdays")
    public void setHasOperationsOnWednesdays(boolean hasOperationsOnWednesdays) {
        this.hasOperationsOnWednesdays = hasOperationsOnWednesdays;
    }

    public String getMinimumBalancePermanence() {
        return minimumBalancePermanence;
    }

    @JsonProperty("minimum_balance_permanence")
    public void setMinimumBalancePermanence(String minimumBalancePermanence) {
        this.minimumBalancePermanence = minimumBalancePermanence;
    }

    public boolean isHasOperationsOnMondays() {
        return hasOperationsOnMondays;
    }

    @JsonProperty("has_operations_on_mondays")
    public void setHasOperationsOnMondays(boolean hasOperationsOnMondays) {
        this.hasOperationsOnMondays = hasOperationsOnMondays;
    }

    public boolean isHasGracePeriod() {
        return hasGracePeriod;
    }

    @JsonProperty("has_grace_period")
    public void setHasGracePeriod(boolean hasGracePeriod) {
        this.hasGracePeriod = hasGracePeriod;
    }

    public String getApplicationTimeLimit() {
        return applicationTimeLimit;
    }

    @JsonProperty("application_time_limit")
    public void setApplicationTimeLimit(String applicationTimeLimit) {
        this.applicationTimeLimit = applicationTimeLimit;
    }

    public String getRetrievalTimeLimit() {
        return retrievalTimeLimit;
    }

    @JsonProperty("retrieval_time_limit")
    public void setRetrievalTimeLimit(String retrievalTimeLimit) {
        this.retrievalTimeLimit = retrievalTimeLimit;
    }

    public boolean isHasOperationsOnFridays() {
        return hasOperationsOnFridays;
    }

    @JsonProperty("has_operations_on_fridays")
    public void setHasOperationsOnFridays(boolean hasOperationsOnFridays) {
        this.hasOperationsOnFridays = hasOperationsOnFridays;
    }

    public int getAnticipateRetrievalLiquidationDays() {
        return anticipateRetrievalLiquidationDays;
    }

    @JsonProperty("anticipate_retrieval_liquidation_days")
    public void setAnticipateRetrievalLiquidationDays(int anticipateRetrievalLiquidationDays) {
        this.anticipateRetrievalLiquidationDays = anticipateRetrievalLiquidationDays;
    }

    public String getMinimumInitialApplicationAmount() {
        return minimumInitialApplicationAmount;
    }

    @JsonProperty("minimum_initial_application_amount")
    public void setMinimumInitialApplicationAmount(String minimumInitialApplicationAmount) {
        this.minimumInitialApplicationAmount = minimumInitialApplicationAmount;
    }

    public String getAnticipateRetrievalLiquidationDaysType() {
        return anticipateRetrievalLiquidationDaysType;
    }

    @JsonProperty("anticipate_retrieval_liquidation_days_type")
    public void setAnticipateRetrievalLiquidationDaysType(String anticipateRetrievalLiquidationDaysType) {
        this.anticipateRetrievalLiquidationDaysType = anticipateRetrievalLiquidationDaysType;
    }

    public String getRetrievalSpecialType() {
        return retrievalSpecialType;
    }

    @JsonProperty("retrieval_special_type")
    public void setRetrievalSpecialType(String retrievalSpecialType) {
        this.retrievalSpecialType = retrievalSpecialType;
    }

    public String getAnticipateRetrievalLiquidationDaysStr() {
        return anticipateRetrievalLiquidationDaysStr;
    }

    @JsonProperty("anticipate_retrieval_liquidation_days_str")
    public void setAnticipateRetrievalLiquidationDaysStr(String anticipateRetrievalLiquidationDaysStr) {
        this.anticipateRetrievalLiquidationDaysStr = anticipateRetrievalLiquidationDaysStr;
    }

    public String getApplicationQuotationDaysStr() {
        return applicationQuotationDaysStr;
    }

    @JsonProperty("application_quotation_days_str")
    public void setApplicationQuotationDaysStr(String applicationQuotationDaysStr) {
        this.applicationQuotationDaysStr = applicationQuotationDaysStr;
    }

    public String getGracePeriodInDaysStr() {
        return gracePeriodInDaysStr;
    }

    @JsonProperty("grace_period_in_days_str")
    public void setGracePeriodInDaysStr(String gracePeriodInDaysStr) {
        this.gracePeriodInDaysStr = gracePeriodInDaysStr;
    }

    public String getRetrievalQuotationDaysStr() {
        return retrievalQuotationDaysStr;
    }

    @JsonProperty("retrieval_quotation_days_str")
    public void setRetrievalQuotationDaysStr(String retrievalQuotationDaysStr) {
        this.retrievalQuotationDaysStr = retrievalQuotationDaysStr;
    }

    public int getGracePeriodInDays() {
        return gracePeriodInDays;
    }

    @JsonProperty("grace_period_in_days")
    public void setGracePeriodInDays(int gracePeriodInDays) {
        this.gracePeriodInDays = gracePeriodInDays;
    }

    public String getRetrievalLiquidationDaysStr() {
        return retrievalLiquidationDaysStr;
    }

    @JsonProperty("retrieval_liquidation_days_str")
    public void setRetrievalLiquidationDaysStr(String retrievalLiquidationDaysStr) {
        this.retrievalLiquidationDaysStr = retrievalLiquidationDaysStr;
    }

    public String getMinimumSubsequentRetrievalAmount() {
        return minimumSubsequentRetrievalAmount;
    }

    @JsonProperty("minimum_subsequent_retrieval_amount")
    public void setMinimumSubsequentRetrievalAmount(String minimumSubsequentRetrievalAmount) {
        this.minimumSubsequentRetrievalAmount = minimumSubsequentRetrievalAmount;
    }

    public boolean isRetrievalDirect() {
        return retrievalDirect;
    }

    @JsonProperty("retrieval_direct")
    public void setRetrievalDirect(boolean retrievalDirect) {
        this.retrievalDirect = retrievalDirect;
    }

    public int getRetrievalLiquidationDays() {
        return retrievalLiquidationDays;
    }

    @JsonProperty("retrieval_liquidation_days")
    public void setRetrievalLiquidationDays(int retrievalLiquidationDays) {
        this.retrievalLiquidationDays = retrievalLiquidationDays;
    }

    public int getApplicationQuotationDays() {
        return applicationQuotationDays;
    }

    @JsonProperty("application_quotation_days")
    public void setApplicationQuotationDays(int applicationQuotationDays) {
        this.applicationQuotationDays = applicationQuotationDays;
    }

    public String getMaxBalancePermanence() {
        return maxBalancePermanence;
    }

    @JsonProperty("max_balance_permanence")
    public void setMaxBalancePermanence(String maxBalancePermanence) {
        this.maxBalancePermanence = maxBalancePermanence;
    }

    public String getMaximumInitialApplicationAmount() {
        return maximumInitialApplicationAmount;
    }

    @JsonProperty("maximum_initial_application_amount")
    public void setMaximumInitialApplicationAmount(String maximumInitialApplicationAmount) {
        this.maximumInitialApplicationAmount = maximumInitialApplicationAmount;
    }

    public boolean isHasOperationsOnTuesdays() {
        return hasOperationsOnTuesdays;
    }

    @JsonProperty("has_operations_on_tuesdays")
    public void setHasOperationsOnTuesdays(boolean hasOperationsOnTuesdays) {
        this.hasOperationsOnTuesdays = hasOperationsOnTuesdays;
    }

    public String getMinimumSubsequentApplicationAmount() {
        return minimumSubsequentApplicationAmount;
    }

    @JsonProperty("minimum_subsequent_application_amount")
    public void setMinimumSubsequentApplicationAmount(String minimumSubsequentApplicationAmount) {
        this.minimumSubsequentApplicationAmount = minimumSubsequentApplicationAmount;
    }
}
