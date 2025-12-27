package com.xworz.comparable.dto;

public class MoviesDto implements Comparable<MoviesDto> {

    private String movieName;
    private int movieId;

    public MoviesDto(int movieId, String movieName) {
        this.movieId = movieId;
        this.movieName = movieName;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public int compareTo(MoviesDto o) {

        return this.movieName.compareTo(o.movieName);
    }

    @Override
    public String toString() {
        return "MoviesDto{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                '}';
    }
}