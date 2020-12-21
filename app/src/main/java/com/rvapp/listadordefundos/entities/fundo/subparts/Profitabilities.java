package com.rvapp.listadordefundos.entities.fundo.subparts;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Profitabilities implements Parcelable {
    private String m60;
    private String m48;
    private String m24;
    private String m36;
    private String month;
    private String m12;
    private String year;
    private String day;

    public Profitabilities() {
    }

    protected Profitabilities(Parcel in) {
        m60 = in.readString();
        m48 = in.readString();
        m24 = in.readString();
        m36 = in.readString();
        month = in.readString();
        m12 = in.readString();
        year = in.readString();
        day = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(m60);
        dest.writeString(m48);
        dest.writeString(m24);
        dest.writeString(m36);
        dest.writeString(month);
        dest.writeString(m12);
        dest.writeString(year);
        dest.writeString(day);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Profitabilities> CREATOR = new Creator<Profitabilities>() {
        @Override
        public Profitabilities createFromParcel(Parcel in) {
            return new Profitabilities(in);
        }

        @Override
        public Profitabilities[] newArray(int size) {
            return new Profitabilities[size];
        }
    };

    public String getM60() {
        return m60;
    }

    @JsonProperty("m60")
    public void setM60(String m60) {
        this.m60 = m60;
    }

    public String getM48() {
        return m48;
    }

    @JsonProperty("m48")
    public void setM48(String m48) {
        this.m48 = m48;
    }

    public String getM24() {
        return m24;
    }

    @JsonProperty("m24")
    public void setM24(String m24) {
        this.m24 = m24;
    }

    public String getM36() {
        return m36;
    }

    @JsonProperty("m36")
    public void setM36(String m36) {
        this.m36 = m36;
    }

    public String getMonth() {
        return month;
    }

    @JsonProperty("month")
    public void setMonth(String month) {
        this.month = month;
    }

    public String getM12() {
        return m12;
    }

    @JsonProperty("m12")
    public void setM12(String m12) {
        this.m12 = m12;
    }

    public String getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(String year) {
        this.year = year;
    }

    public String getDay() {
        return day;
    }

    @JsonProperty("day")
    public void setDay(String day) {
        this.day = day;
    }
}
