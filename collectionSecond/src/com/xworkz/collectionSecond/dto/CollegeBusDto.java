package com.xworkz.collectionSecond.dto;

import java.util.Objects;

public class CollegeBusDto {
    private String busColor;
    private String busDriverName;
    private int busId;
    private int busTotalPassengers;
    private int totalBus;
    private long busRegistorNumber;
    private float busRanking;
    private double busDriverSalary;
    private char busFualType;
    private boolean isBusActive;

    public CollegeBusDto(String busColor, String busDriverName, int busId,
                         int busTotalPassengers, int totalBus, long busRegistorNumber,
                         float busRanking, double busDriverSalary, char busFualType,
                         boolean isBusActive) {

        this.busColor = busColor;
        this.busDriverName = busDriverName;
        this.busId = busId;
        this.busTotalPassengers = busTotalPassengers;
        this.totalBus = totalBus;
        this.busRegistorNumber = busRegistorNumber;
        this.busRanking = busRanking;
        this.busDriverSalary = busDriverSalary;
        this.busFualType = busFualType;
        this.isBusActive = isBusActive;
    }

    public String getBusColor() {
        return busColor;
    }

    public void setBusColor(String busColor) {
        this.busColor = busColor;
    }

    public String getBusDriverName() {
        return busDriverName;
    }

    public void setBusDriverName(String busDriverName) {
        this.busDriverName = busDriverName;
    }

    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public int getBusTotalPassengers() {
        return busTotalPassengers;
    }

    public void setBusTotalPassengers(int busTotalPassengers) {
        this.busTotalPassengers = busTotalPassengers;
    }

    public int getTotalBus() {
        return totalBus;
    }

    public void setTotalBus(int totalBus) {
        this.totalBus = totalBus;
    }

    public long getBusRegistorNumber() {
        return busRegistorNumber;
    }

    public void setBusRegistorNumber(long busRegistorNumber) {
        this.busRegistorNumber = busRegistorNumber;
    }

    public float getBusRanking() {
        return busRanking;
    }

    public void setBusRanking(float busRanking) {
        this.busRanking = busRanking;
    }

    public double getBusDriverSalary() {
        return busDriverSalary;
    }

    public void setBusDriverSalary(double busDriverSalary) {
        this.busDriverSalary = busDriverSalary;
    }

    public char getBusFualType() {
        return busFualType;
    }

    public void setBusFualType(char busFualType) {
        this.busFualType = busFualType;
    }

    public boolean isBusActive() {
        return isBusActive;
    }

    public void setBusActive(boolean busActive) {
        isBusActive = busActive;
    }

    @Override
    public String toString() {
        return "CollegeBusDto{" +
                "busColor='" + busColor + '\'' +
                ", busDriverName='" + busDriverName + '\'' +
                ", busId=" + busId +
                ", busTotalPassengers=" + busTotalPassengers +
                ", totalBus=" + totalBus +
                ", busRegistorNumber=" + busRegistorNumber +
                ", busRanking=" + busRanking +
                ", busDriverSalary=" + busDriverSalary +
                ", busFualType=" + busFualType +
                ", isBusActive=" + isBusActive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CollegeBusDto)) return false;
        CollegeBusDto that = (CollegeBusDto) o;
        return busId == that.busId && busTotalPassengers == that.busTotalPassengers && totalBus == that.totalBus && busRegistorNumber == that.busRegistorNumber && Float.compare(busRanking, that.busRanking) == 0 && Double.compare(busDriverSalary, that.busDriverSalary) == 0 && busFualType == that.busFualType && isBusActive == that.isBusActive && Objects.equals(busColor, that.busColor) && Objects.equals(busDriverName, that.busDriverName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(busColor, busDriverName, busId, busTotalPassengers, totalBus, busRegistorNumber, busRanking, busDriverSalary, busFualType, isBusActive);
    }
}
