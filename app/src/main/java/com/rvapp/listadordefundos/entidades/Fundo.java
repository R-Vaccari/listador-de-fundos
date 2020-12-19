package com.rvapp.listadordefundos.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Fundo {
    private int id;

    public Fundo() {

    }

    public Fundo(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Fundo{" +
                "id=" + id +
                '}';
    }
}
