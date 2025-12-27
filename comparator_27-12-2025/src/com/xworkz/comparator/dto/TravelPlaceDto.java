package com.xworkz.comparator.dto;

public class TravelPlaceDto {

    private String placeName;
    private int placeId;
    private String country;

    public TravelPlaceDto(int placeId, String placeName, String country) {
        this.placeId = placeId;
        this.placeName = placeName;
        this.country = country;
    }

    public int getPlaceId() {
        return placeId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "TravelPlaceDto{" +
                "placeId=" + placeId +
                ", placeName='" + placeName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}