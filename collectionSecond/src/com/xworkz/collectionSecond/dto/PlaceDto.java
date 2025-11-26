package com.xworkz.collectionSecond.dto;

import java.util.Objects;

public class PlaceDto {
    private String placeName;
    private String passangerName;
    private int placeId;
    private int placeCost;
    private long placeRegistrationId;
    private float placeRateing;
    private double placeTotalExpenditure;
    private char placeCode;
    private boolean placeIsExist;

    public PlaceDto(String passangerName, char placeCode, int placeCost,
                    int placeId, boolean placeIsExist, String placeName,
                    float placeRateing, long placeRegistrationId,
                    double placeTotalExpenditure) {

        this.passangerName = passangerName;
        this.placeCode = placeCode;
        this.placeCost = placeCost;
        this.placeId = placeId;
        this.placeIsExist = placeIsExist;
        this.placeName = placeName;
        this.placeRateing = placeRateing;
        this.placeRegistrationId = placeRegistrationId;
        this.placeTotalExpenditure = placeTotalExpenditure;
    }

    public String getPassangerName() {
        return passangerName;
    }

    public void setPassangerName(String passangerName) {
        this.passangerName = passangerName;
    }

    public char getPlaceCode() {
        return placeCode;
    }

    public void setPlaceCode(char placeCode) {
        this.placeCode = placeCode;
    }

    public int getPlaceCost() {
        return placeCost;
    }

    public void setPlaceCost(int placeCost) {
        this.placeCost = placeCost;
    }

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public boolean isPlaceIsExist() {
        return placeIsExist;
    }

    public void setPlaceIsExist(boolean placeIsExist) {
        this.placeIsExist = placeIsExist;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public float getPlaceRateing() {
        return placeRateing;
    }

    public void setPlaceRateing(float placeRateing) {
        this.placeRateing = placeRateing;
    }

    public long getPlaceRegistrationId() {
        return placeRegistrationId;
    }

    public void setPlaceRegistrationId(long placeRegistrationId) {
        this.placeRegistrationId = placeRegistrationId;
    }

    public double getPlaceTotalExpenditure() {
        return placeTotalExpenditure;
    }

    public void setPlaceTotalExpenditure(double placeTotalExpenditure) {
        this.placeTotalExpenditure = placeTotalExpenditure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlaceDto)) return false;
        PlaceDto placeDto = (PlaceDto) o;
        return placeId == placeDto.placeId && placeCost == placeDto.placeCost && placeRegistrationId == placeDto.placeRegistrationId && Float.compare(placeRateing, placeDto.placeRateing) == 0 && Double.compare(placeTotalExpenditure, placeDto.placeTotalExpenditure) == 0 && placeCode == placeDto.placeCode && placeIsExist == placeDto.placeIsExist && Objects.equals(placeName, placeDto.placeName) && Objects.equals(passangerName, placeDto.passangerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placeName, passangerName, placeId, placeCost, placeRegistrationId, placeRateing, placeTotalExpenditure, placeCode, placeIsExist);
    }

    @Override
    public String toString() {
        return "PlaceDto{" +
                "passangerName='" + passangerName + '\'' +
                ", placeName='" + placeName + '\'' +
                ", placeId=" + placeId +
                ", placeCost=" + placeCost +
                ", placeRegistrationId=" + placeRegistrationId +
                ", placeRateing=" + placeRateing +
                ", placeTotalExpenditure=" + placeTotalExpenditure +
                ", placeCode=" + placeCode +
                ", placeIsExist=" + placeIsExist +
                '}';
    }
}
