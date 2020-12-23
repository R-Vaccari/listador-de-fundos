package com.rvapp.listadordefundos.entities;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rvapp.listadordefundos.entities.fundo.subparts.Benchmark;
import com.rvapp.listadordefundos.entities.fundo.subparts.Description;
import com.rvapp.listadordefundos.entities.fundo.subparts.Document;
import com.rvapp.listadordefundos.entities.fundo.subparts.Fees;
import com.rvapp.listadordefundos.entities.fundo.subparts.FundManager;
import com.rvapp.listadordefundos.entities.fundo.subparts.FundSituation;
import com.rvapp.listadordefundos.entities.fundo.subparts.Operability;
import com.rvapp.listadordefundos.entities.fundo.subparts.PerformanceAudio;
import com.rvapp.listadordefundos.entities.fundo.subparts.PerformanceVideo;
import com.rvapp.listadordefundos.entities.fundo.subparts.Profitabilities;
import com.rvapp.listadordefundos.entities.fundo.subparts.Specification;
import com.rvapp.listadordefundos.entities.fundo.subparts.StrategyVideo;

public class Fundo implements Parcelable {
    private int id;
    private String fullName;
    private Specification specification;
    private String initialDate;
    private Fees fees;
    private PerformanceAudio[] performanceAudios;
    private PerformanceVideo[] performanceVideos;
    private boolean isActive;
    private boolean isSimple;
    private String descriptionSEO;
    private String openingDate;
    private boolean isClosed;
    private String simpleName;
    private String targetFund;
    private Document[] documents;
    private String quotaDate;
    private String taxClassification;
    private String cnpj;
    private Description description;
    private Benchmark benchmark;
    private boolean oramaStandard;
    private String slug;
    private FundSituation fundSituation;
    private String volatility12m;
    private StrategyVideo strategyVideo;
    private String insuranceCompanyCode;
    private Profitabilities profitabilities;
    private String closedToCaptureExplanation;
    private String closingDate;
    private String netPatrimony12m;
    private boolean isClosedToCapture;
    private FundManager fundManager;
    private boolean esgSeal;
    private Operability operability;

    public Fundo() {
    }

    protected Fundo(Parcel in) {
        benchmark = in.readParcelable(Benchmark.class.getClassLoader());
        description = in.readParcelable(Description.class.getClassLoader());
        documents = in.createTypedArray(Document.CREATOR);
        fees = in.readParcelable(Fees.class.getClassLoader());
        fundManager = in.readParcelable(FundManager.class.getClassLoader());
        fundSituation = in.readParcelable(FundSituation.class.getClassLoader());
        operability = in.readParcelable(Operability.class.getClassLoader());
        performanceAudios =  in.createTypedArray(PerformanceAudio.CREATOR);
        performanceVideos =  in.createTypedArray(PerformanceVideo.CREATOR);
        profitabilities = in.readParcelable(Profitabilities.class.getClassLoader());
        specification = in.readParcelable(Specification.class.getClassLoader());
        strategyVideo = in.readParcelable(StrategyVideo.class.getClassLoader());
        id = in.readInt();
        fullName = in.readString();
        initialDate = in.readString();
        isActive = in.readByte() != 0;
        isSimple = in.readByte() != 0;
        descriptionSEO = in.readString();
        openingDate = in.readString();
        isClosed = in.readByte() != 0;
        simpleName = in.readString();
        targetFund = in.readString();
        quotaDate = in.readString();
        taxClassification = in.readString();
        cnpj = in.readString();
        oramaStandard = in.readByte() != 0;
        slug = in.readString();
        volatility12m = in.readString();
        insuranceCompanyCode = in.readString();
        closedToCaptureExplanation = in.readString();
        closingDate = in.readString();
        netPatrimony12m = in.readString();
        isClosedToCapture = in.readByte() != 0;
        esgSeal = in.readByte() != 0;
    }

    public static final Creator<Fundo> CREATOR = new Creator<Fundo>() {
        @Override
        public Fundo createFromParcel(Parcel in) {
            return new Fundo(in);
        }

        @Override
        public Fundo[] newArray(int size) {
            return new Fundo[size];
        }
    };

    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    @JsonProperty("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Specification getSpecification() {
        return specification;
    }

    @JsonProperty("specification")
    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public String getInitialDate() {
        return initialDate;
    }

    @JsonProperty("initial_date")
    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
    }

    public Fees getFees() {
        return fees;
    }

    @JsonProperty("fees")
    public void setFees(Fees fees) {
        this.fees = fees;
    }

    public PerformanceAudio[] getPerformanceAudios() {
        return performanceAudios;
    }

    @JsonProperty("performance_audios")
    public void setPerformanceAudios(PerformanceAudio[] performanceAudios) {
        this.performanceAudios = performanceAudios;
    }

    public PerformanceVideo[] getPerformanceVideos() {
        return performanceVideos;
    }

    @JsonProperty("performance_videos")
    public void setPerformanceVideos(PerformanceVideo[] performanceVideos) {
        this.performanceVideos = performanceVideos;
    }

    public boolean isActive() {
        return isActive;
    }

    @JsonProperty("is_active")
    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isSimple() {
        return isSimple;
    }

    @JsonProperty("is_simple")
    public void setSimple(boolean simple) {
        isSimple = simple;
    }

    public String getDescriptionSEO() {
        return descriptionSEO;
    }

    @JsonProperty("description_seo")
    public void setDescriptionSEO(String descriptionSEO) {
        this.descriptionSEO = descriptionSEO;
    }

    public String getOpeningDate() {
        return openingDate;
    }

    @JsonProperty("opening_date")
    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }

    public boolean isClosed() {
        return isClosed;
    }

    @JsonProperty("is_closed")
    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public String getSimpleName() {
        return simpleName;
    }

    @JsonProperty("simple_name")
    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public String getTargetFund() {
        return targetFund;
    }

    @JsonProperty("target_fund")
    public void setTargetFund(String targetFund) {
        this.targetFund = targetFund;
    }

    public Document[] getDocuments() {
        return documents;
    }

    @JsonProperty("documents")
    public void setDocuments(Document[] documents) {
        this.documents = documents;
    }

    public String getQuotaDate() {
        return quotaDate;
    }

    @JsonProperty("quota_date")
    public void setQuotaDate(String quotaDate) {
        this.quotaDate = quotaDate;
    }

    public String getTaxClassification() {
        return taxClassification;
    }

    @JsonProperty("tax_classification")
    public void setTaxClassification(String taxClassification) {
        this.taxClassification = taxClassification;
    }

    public String getCnpj() {
        return cnpj;
    }

    @JsonProperty("cnpj")
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Description getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Description description) {
        this.description = description;
    }

    public Benchmark getBenchmark() {
        return benchmark;
    }

    @JsonProperty("benchmark")
    public void setBenchmark(Benchmark benchmark) {
        this.benchmark = benchmark;
    }

    public boolean isOramaStandard() {
        return oramaStandard;
    }

    @JsonProperty("orama_standard")
    public void setOramaStandard(boolean oramaStandard) {
        this.oramaStandard = oramaStandard;
    }

    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    public FundSituation getFundSituation() {
        return fundSituation;
    }

    @JsonProperty("fund_situation")
    public void setFundSituation(FundSituation fundSituation) {
        this.fundSituation = fundSituation;
    }

    public String getVolatility12m() {
        return volatility12m;
    }

    @JsonProperty("volatility_12m")
    public void setVolatility12m(String volatility12m) {
        this.volatility12m = volatility12m;
    }

    public StrategyVideo getStrategyVideo() {
        return strategyVideo;
    }

    @JsonProperty("strategy_video")
    public void setStrategyVideo(StrategyVideo strategyVideo) {
        this.strategyVideo = strategyVideo;
    }

    public String getInsuranceCompanyCode() {
        return insuranceCompanyCode;
    }

    @JsonProperty("insurance_company_code")
    public void setInsuranceCompanyCode(String insuranceCompanyCode) {
        this.insuranceCompanyCode = insuranceCompanyCode;
    }

    public Profitabilities getProfitabilities() {
        return profitabilities;
    }

    @JsonProperty("profitabilities")
    public void setProfitabilities(Profitabilities profitabilities) {
        this.profitabilities = profitabilities;
    }

    public String getClosedToCaptureExplanation() {
        return closedToCaptureExplanation;
    }

    @JsonProperty("closed_to_capture_explanation")
    public void setClosedToCaptureExplanation(String closedToCaptureExplanation) {
        this.closedToCaptureExplanation = closedToCaptureExplanation;
    }

    public String getClosingDate() {
        return closingDate;
    }

    @JsonProperty("closing_date")
    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }

    public String getNetPatrimony12m() {
        return netPatrimony12m;
    }

    @JsonProperty("net_patrimony_12m")
    public void setNetPatrimony12m(String netPatrimony12m) {
        this.netPatrimony12m = netPatrimony12m;
    }

    public boolean isClosedToCapture() {
        return isClosedToCapture;
    }

    @JsonProperty("is_closed_to_capture")
    public void setClosedToCapture(boolean closedToCapture) {
        isClosedToCapture = closedToCapture;
    }

    public FundManager getFundManager() {
        return fundManager;
    }

    @JsonProperty("fund_manager")
    public void setFundManager(FundManager fundManager) {
        this.fundManager = fundManager;
    }

    public boolean isEsgSeal() {
        return esgSeal;
    }

    @JsonProperty("esg_seal")
    public void setEsgSeal(boolean esgSeal) {
        this.esgSeal = esgSeal;
    }

    public Operability getOperability() {
        return operability;
    }

    @JsonProperty("operability")
    public void setOperability(Operability operability) {
        this.operability = operability;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(benchmark, flags);
        dest.writeParcelable(description, flags);
        dest.writeTypedArray(documents, flags);
        dest.writeParcelable(fees, flags);
        dest.writeParcelable(fundManager, flags);
        dest.writeParcelable(fundSituation, flags);
        dest.writeParcelable(operability, flags);
        dest.writeTypedArray(performanceAudios, flags);
        dest.writeTypedArray(performanceVideos, flags);
        dest.writeParcelable(profitabilities, flags);
        dest.writeParcelable(specification, flags);
        dest.writeParcelable(strategyVideo, flags);
        dest.writeInt(id);
        dest.writeString(fullName);
        dest.writeString(initialDate);
        dest.writeByte((byte) (isActive ? 1 : 0));
        dest.writeByte((byte) (isSimple ? 1 : 0));
        dest.writeString(descriptionSEO);
        dest.writeString(openingDate);
        dest.writeByte((byte) (isClosed ? 1 : 0));
        dest.writeString(simpleName);
        dest.writeString(targetFund);
        dest.writeString(quotaDate);
        dest.writeString(taxClassification);
        dest.writeString(cnpj);
        dest.writeByte((byte) (oramaStandard ? 1 : 0));
        dest.writeString(slug);
        dest.writeString(volatility12m);
        dest.writeString(insuranceCompanyCode);
        dest.writeString(closedToCaptureExplanation);
        dest.writeString(closingDate);
        dest.writeString(netPatrimony12m);
        dest.writeByte((byte) (isClosedToCapture ? 1 : 0));
        dest.writeByte((byte) (esgSeal ? 1 : 0));
    }
}
