package com.rvapp.listadordefundos.entidades.fundo.subparts.especification.subparts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FundMainStrategy {
    private String explanation;
    private int fundMacroStrategy;
    private int id;
    private String name;

    public String getExplanation() {
        return explanation;
    }

    @JsonProperty("explanation")
    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public int getFundMacroStrategy() {
        return fundMacroStrategy;
    }

    @JsonProperty("fund_macro_strategy")
    public void setFundMacroStrategy(int fundMacroStrategy) {
        this.fundMacroStrategy = fundMacroStrategy;
    }

    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }
}
