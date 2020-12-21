package com.rvapp.listadordefundos.entities.fundo.subparts;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Description implements Parcelable {
    private String objective;
    private String movieURL;
    private String targetAudience;
    private String strengths;
    private String strategy;

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

    @JsonProperty("objective")
    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getMovieURL() {
        return movieURL;
    }

    @JsonProperty("movie_url")
    public void setMovieURL(String movieURL) {
        this.movieURL = movieURL;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    @JsonProperty("target_audience")
    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public String getStrengths() {
        return strengths;
    }

    @JsonProperty("strengths")
    public void setStrengths(String strengths) {
        this.strengths = strengths;
    }

    public String getStrategy() {
        return strategy;
    }

    @JsonProperty("strategy")
    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }
}
