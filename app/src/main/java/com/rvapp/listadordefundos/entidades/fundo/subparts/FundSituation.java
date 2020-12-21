package com.rvapp.listadordefundos.entidades.fundo.subparts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FundSituation {
    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }
}
