package com.rvapp.listadordefundos.entidades.fundo.subparts.especification.subparts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FundSuitabilityProfile {
    private int scoreRangeOrder;
    private String name;

    public int getScoreRangeOrder() {
        return scoreRangeOrder;
    }

    @JsonProperty("score_range_order")
    public void setScoreRangeOrder(int scoreRangeOrder) {
        this.scoreRangeOrder = scoreRangeOrder;
    }

    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }
}
