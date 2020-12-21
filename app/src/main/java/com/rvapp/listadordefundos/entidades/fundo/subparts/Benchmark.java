package com.rvapp.listadordefundos.entidades.fundo.subparts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Benchmark {
    private int id;
    private String name;

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
