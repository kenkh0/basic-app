package com.itheima.ArrayList;

public class movie {
    private String movieName;
    private double movieScore;
    private String movieAction;
    public  movie(){

    }
    public movie(String movieName, double movieScore, String movieAction) {
        this.movieName = movieName;
        this.movieScore = movieScore;
        this.movieAction = movieAction;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public double getMovieScore() {
        return movieScore;
    }

    public void setMovieScore(double movieScore) {
        this.movieScore = movieScore;
    }

    public String getMovieAction() {
        return movieAction;
    }

    public void setMovieAction(String movieAction) {
        this.movieAction = movieAction;
    }
}
