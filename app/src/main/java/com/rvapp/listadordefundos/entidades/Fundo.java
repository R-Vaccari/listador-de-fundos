package com.rvapp.listadordefundos.entidades;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rvapp.listadordefundos.entidades.fundo.subparts.Benchmark;
import com.rvapp.listadordefundos.entidades.fundo.subparts.Description;
import com.rvapp.listadordefundos.entidades.fundo.subparts.Document;
import com.rvapp.listadordefundos.entidades.fundo.subparts.Fees;
import com.rvapp.listadordefundos.entidades.fundo.subparts.FundManager;
import com.rvapp.listadordefundos.entidades.fundo.subparts.FundSituation;
import com.rvapp.listadordefundos.entidades.fundo.subparts.Operability;
import com.rvapp.listadordefundos.entidades.fundo.subparts.PerformanceAudio;
import com.rvapp.listadordefundos.entidades.fundo.subparts.PerformanceVideo;
import com.rvapp.listadordefundos.entidades.fundo.subparts.Profitabilities;
import com.rvapp.listadordefundos.entidades.fundo.subparts.Specification;
import com.rvapp.listadordefundos.entidades.fundo.subparts.StrategyVideo;

public class Fundo {
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
}
