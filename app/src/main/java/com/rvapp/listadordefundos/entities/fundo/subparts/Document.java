package com.rvapp.listadordefundos.entities.fundo.subparts;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Document implements Parcelable {
    private int position;
    private String documentType;
    private String name;
    private String documentURL;

    public Document() {
    }

    protected Document(Parcel in) {
        position = in.readInt();
        documentType = in.readString();
        name = in.readString();
        documentURL = in.readString();
    }

    public static final Creator<Document> CREATOR = new Creator<Document>() {
        @Override
        public Document createFromParcel(Parcel in) {
            return new Document(in);
        }

        @Override
        public Document[] newArray(int size) {
            return new Document[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(position);
        dest.writeString(documentType);
        dest.writeString(name);
        dest.writeString(documentURL);
    }
}
