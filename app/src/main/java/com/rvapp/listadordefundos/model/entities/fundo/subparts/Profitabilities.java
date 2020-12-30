package com.rvapp.listadordefundos.model.entities.fundo.subparts;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Profitabilities implements Parcelable {
    private static final String INDISPONIVEL = "Indisponível";
    @JsonProperty("m60")private String m60;
    @JsonProperty("m48") private String m48;
    @JsonProperty("m24") private String m24;
    @JsonProperty("m36") private String m36;
    @JsonProperty("month") private String month;
    @JsonProperty("m12") private String m12;
    @JsonProperty("year") private String year;
    @JsonProperty("day") private String day;

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


    public void setM60(String m60) {
        if (m60 != null) this.m60 = m60;
        else this.m60 = INDISPONIVEL;
    }

    public String getM48() {
        return m48;
    }

    public void setM48(String m48) {
        if (m48 != null) this.m48 = m48;
        else this.m48 = INDISPONIVEL;
    }

    public String getM24() {
        return m24;
    }

    public void setM24(String m24) {
        if (m24 != null) this.m24 = m24;
        else this.m24 = INDISPONIVEL;
    }

    public String getM36() {
        return m36;
    }

    public void setM36(String m36) {
        if (m36 != null) this.m36 = m36;
        else this.m36 = INDISPONIVEL;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        if (month != null) this.month = month;
        else this.month = INDISPONIVEL;
    }

    public String getM12() {
        return m12;
    }

    public void setM12(String m12) {
        if (m12 != null) this.m12 = m12;
        else this.m12 = INDISPONIVEL;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        if (year != null) this.year = year;
        else this.year = INDISPONIVEL;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        if (day != null) this.day = day;
        else this.day = INDISPONIVEL;
    }
}
