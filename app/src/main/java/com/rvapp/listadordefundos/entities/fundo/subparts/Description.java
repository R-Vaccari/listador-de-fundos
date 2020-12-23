package com.rvapp.listadordefundos.entities.fundo.subparts;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Description implements Parcelable {
    @JsonProperty("objective") private String objective;
    @JsonProperty("movie_url") private String movieURL;
    @JsonProperty("target_audience") private String targetAudience;
    @JsonProperty("strengths") private String strengths;
    @JsonProperty("strategy") private String strategy;

    public Description() {
    }

    protected Description(Parcel in) {
        objective = in.readString();
        movieURL = in.readString();
        targetAudience = in.readString();
        strengths = in.readString();
        strategy = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(objective);
        dest.writeString(movieURL);
        dest.writeString(targetAudience);
        dest.writeString(strengths);
        dest.writeString(strategy);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Description> CREATOR = new Creator<Description>() {
        @Override
        public Description createFromParcel(Parcel in) {
            return new Description(in);
        }

        @Override
        public Description[] newArray(int size) {
            return new Description[size];
        }
    };

    public String getObjective() {
        return objective;
    }


    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getMovieURL() {
        return movieURL;
    }


    public void setMovieURL(String movieURL) {
        this.movieURL = movieURL;
    }

    public String getTargetAudience() {
        return targetAudience;
    }


    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public String getStrengths() {
        return strengths;
    }


    public void setStrengths(String strengths) {
        this.strengths = strengths;
    }

    public String getStrategy() {
        return strategy;
    }


    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }
}
