package com.rvapp.listadordefundos.entidades;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Document {
    private int position;
    private String documentType;
    private String name;
    private String documentURL;

    public int getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(int position) {
        this.position = position;
    }

    public String getDocumentType() {
        return documentType;
    }

    @JsonProperty("document_type")
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public String getDocumentURL() {
        return documentURL;
    }

    @JsonProperty("document_url")
    public void setDocumentURL(String documentURL) {
        this.documentURL = documentURL;
    }
}
