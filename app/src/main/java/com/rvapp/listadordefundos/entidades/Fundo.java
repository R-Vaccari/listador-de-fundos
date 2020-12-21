package com.rvapp.listadordefundos.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Fundo {
    private int id;
    private String fullName;
    private Specification specification;
    private String initialDate;
    private Fees fees;
    private PerformanceAudio[] performanceAudios;
    private boolean isSimple;
    private String descriptionSEO;
    private String openingDate;
    private boolean isClosed;
    private String simpleName;
    private String targetFund;
    private Document[] documents;

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

    @JsonProperty("simple_Name")
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
}
