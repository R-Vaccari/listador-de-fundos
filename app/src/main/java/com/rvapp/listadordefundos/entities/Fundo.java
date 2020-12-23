package com.rvapp.listadordefundos.entities;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("id") private int id;
    @JsonProperty("full_name") private String fullName;
    @JsonProperty("specification") private Specification specification;
    @JsonProperty("initial_date") private String initialDate;
    @JsonProperty("fees") private Fees fees;
    @JsonProperty("performance_audios") private PerformanceAudio[] performanceAudios;
    @JsonProperty("performance_videos") private PerformanceVideo[] performanceVideos;
    @JsonProperty("is_active") private boolean isActive;
    @JsonProperty("is_simple") private boolean isSimple;
    @JsonProperty("description_seo") private String descriptionSEO;
    @JsonProperty("opening_date") private String openingDate;
    @JsonProperty("is_closed") private boolean isClosed;
    @JsonProperty("simple_name") private String simpleName;
    @JsonProperty("target_fund") private String targetFund;
    @JsonProperty("documents") private Document[] documents;
    @JsonProperty("quota_date") private String quotaDate;
    @JsonProperty("tax_classification") private String taxClassification;
    @JsonProperty("cnpj") private String cnpj;
    @JsonProperty("description") private Description description;
    @JsonProperty("benchmark") private Benchmark benchmark;
    @JsonProperty("orama_standard") private boolean oramaStandard;
    @JsonProperty("slug") private String slug;
    @JsonProperty("fund_situation") private FundSituation fundSituation;
    @JsonProperty("volatility_12m") private String volatility12m;
    @JsonProperty("strategy_video") private StrategyVideo strategyVideo;
    @JsonProperty("insurance_company_code") private String insuranceCompanyCode;
    @JsonProperty("profitabilities") private Profitabilities profitabilities;
    @JsonProperty("closed_to_capture_explanation") private String closedToCaptureExplanation;
    @JsonProperty("closing_date") private String closingDate;
    @JsonProperty("net_patrimony_12m") private String netPatrimony12m;
    @JsonProperty("is_closed_to_capture") private boolean isClosedToCapture;
    @JsonProperty("fund_manager") private FundManager fundManager;
    @JsonProperty("esg_seal") private boolean esgSeal;
    @JsonProperty("operability") private Operability operability;

    public Fundo() {
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

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public String getInitialDate() {
        return initialDate;
    }


    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
    }

    public Fees getFees() {
        return fees;
    }


    public void setFees(Fees fees) {
        this.fees = fees;
    }

    public PerformanceAudio[] getPerformanceAudios() {
        return performanceAudios;
    }


    public void setPerformanceAudios(PerformanceAudio[] performanceAudios) {
        this.performanceAudios = performanceAudios;
    }

    public PerformanceVideo[] getPerformanceVideos() {
        return performanceVideos;
    }


    public void setPerformanceVideos(PerformanceVideo[] performanceVideos) {
        this.performanceVideos = performanceVideos;
    }

    public boolean isActive() {
        return isActive;
    }


    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isSimple() {
        return isSimple;
    }


    public void setSimple(boolean simple) {
        isSimple = simple;
    }

    public String getDescriptionSEO() {
        return descriptionSEO;
    }


    public void setDescriptionSEO(String descriptionSEO) {
        this.descriptionSEO = descriptionSEO;
    }

    public String getOpeningDate() {
        return openingDate;
    }


    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }

    public boolean isClosed() {
        return isClosed;
    }


    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public String getSimpleName() {
        return simpleName;
    }


    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public String getTargetFund() {
        return targetFund;
    }


    public void setTargetFund(String targetFund) {
        this.targetFund = targetFund;
    }

    public Document[] getDocuments() {
        return documents;
    }


    public void setDocuments(Document[] documents) {
        this.documents = documents;
    }

    public String getQuotaDate() {
        return quotaDate;
    }


    public void setQuotaDate(String quotaDate) {
        this.quotaDate = quotaDate;
    }

    public String getTaxClassification() {
        return taxClassification;
    }


    public void setTaxClassification(String taxClassification) {
        this.taxClassification = taxClassification;
    }

    public String getCnpj() {
        return cnpj;
    }


    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Description getDescription() {
        return description;
    }


    public void setDescription(Description description) {
        this.description = description;
    }

    public Benchmark getBenchmark() {
        return benchmark;
    }


    public void setBenchmark(Benchmark benchmark) {
        this.benchmark = benchmark;
    }

    public boolean isOramaStandard() {
        return oramaStandard;
    }


    public void setOramaStandard(boolean oramaStandard) {
        this.oramaStandard = oramaStandard;
    }

    public String getSlug() {
        return slug;
    }


    public void setSlug(String slug) {
        this.slug = slug;
    }

    public FundSituation getFundSituation() {
        return fundSituation;
    }


    public void setFundSituation(FundSituation fundSituation) {
        this.fundSituation = fundSituation;
    }

    public String getVolatility12m() {
        return volatility12m;
    }


    public void setVolatility12m(String volatility12m) {
        this.volatility12m = volatility12m;
    }

    public StrategyVideo getStrategyVideo() {
        return strategyVideo;
    }


    public void setStrategyVideo(StrategyVideo strategyVideo) {
        this.strategyVideo = strategyVideo;
    }

    public String getInsuranceCompanyCode() {
        return insuranceCompanyCode;
    }


    public void setInsuranceCompanyCode(String insuranceCompanyCode) {
        this.insuranceCompanyCode = insuranceCompanyCode;
    }

    public Profitabilities getProfitabilities() {
        return profitabilities;
    }


    public void setProfitabilities(Profitabilities profitabilities) {
        this.profitabilities = profitabilities;
    }

    public String getClosedToCaptureExplanation() {
        return closedToCaptureExplanation;
    }


    public void setClosedToCaptureExplanation(String closedToCaptureExplanation) {
        this.closedToCaptureExplanation = closedToCaptureExplanation;
    }

    public String getClosingDate() {
        return closingDate;
    }


    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }

    public String getNetPatrimony12m() {
        return netPatrimony12m;
    }


    public void setNetPatrimony12m(String netPatrimony12m) {
        this.netPatrimony12m = netPatrimony12m;
    }

    public boolean isClosedToCapture() {
        return isClosedToCapture;
    }


    public void setClosedToCapture(boolean closedToCapture) {
        isClosedToCapture = closedToCapture;
    }

    public FundManager getFundManager() {
        return fundManager;
    }


    public void setFundManager(FundManager fundManager) {
        this.fundManager = fundManager;
    }

    public boolean isEsgSeal() {
        return esgSeal;
    }


    public void setEsgSeal(boolean esgSeal) {
        this.esgSeal = esgSeal;
    }

    public Operability getOperability() {
        return operability;
    }


    public void setOperability(Operability operability) {
        this.operability = operability;
    }

    @Override
    public int describeContents() {
        return 0;
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
