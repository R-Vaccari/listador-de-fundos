package com.rvapp.listadordefundos.entities.fundo.subparts;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Benchmark implements Parcelable {
    @JsonProperty("id") private int id;
    @JsonProperty("name") private String name;

    public Benchmark() {
    }

    protected Benchmark(Parcel in) {
        id = in.readInt();
        name = in.readString();
    }

    public static final Creator<Benchmark> CREATOR = new Creator<Benchmark>() {
        @Override
        public Benchmark createFromParcel(Parcel in) {
            return new Benchmark(in);
        }

        @Override
        public Benchmark[] newArray(int size) {
            return new Benchmark[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
    }
}
