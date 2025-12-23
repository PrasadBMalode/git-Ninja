package com.xworkz.encapsulation.dto;

public class MovieDto {
    private String movieName;
    private int releaseYear;
    private long registorNumber;
    private float rating;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public long getRegistorNumber() {
        return registorNumber;
    }

    public void setRegistorNumber(long registorNumber) {
        this.registorNumber = registorNumber;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
