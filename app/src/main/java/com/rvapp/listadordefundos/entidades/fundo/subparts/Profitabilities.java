package com.rvapp.listadordefundos.entidades.fundo.subparts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Profitabilities {
    private String m60;
    private String m48;
    private String m24;
    private String m36;
    private String month;
    private String m12;
    private String year;
    private String day;

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
