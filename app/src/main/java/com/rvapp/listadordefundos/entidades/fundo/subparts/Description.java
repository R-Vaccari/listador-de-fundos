package com.rvapp.listadordefundos.entidades.fundo.subparts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Description {
    private String objective;
    private String movieURL;
    private String targetAudience;
    private String strengths;
    private String strategy;

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
