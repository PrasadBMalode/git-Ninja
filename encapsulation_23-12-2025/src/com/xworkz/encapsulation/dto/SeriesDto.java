package com.xworkz.encapsulation.dto;

public class SeriesDto {
    private String seriesName;
    private int releaseYear;
    private String seriesAvailabalIn;
    private float rating;

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getSeriesAvailabalIn() {
        return seriesAvailabalIn;
    }

    public void setSeriesAvailabalIn(String seriesAvailabalIn) {
        this.seriesAvailabalIn = seriesAvailabalIn;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }
}
