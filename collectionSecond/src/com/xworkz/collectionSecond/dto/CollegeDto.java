package com.xworkz.collectionSecond.dto;

import java.util.Objects;

public class CollegeDto {
    private String cllgName;
    private String cllgLocation;
    private int cllgId;
    private int cllgTotalStudents;
    private int cllgTotalBus;
    private long cllgRegistorNumber;
    private float cllgRanking;
    private double cllgFees;
    private char cllgType;
    private boolean iscllgActive;

    public CollegeDto(String cllgName, String cllgLocation, int cllgId,
                      int cllgTotalStudents, int cllgTotalBus, long cllgRegistorNumber,
                      float cllgRanking, double cllgFees, char cllgType, boolean iscllgActive) {

        this.cllgName = cllgName;
        this.cllgLocation = cllgLocation;
        this.cllgId = cllgId;
        this.cllgTotalStudents = cllgTotalStudents;
        this.cllgTotalBus = cllgTotalBus;
        this.cllgRegistorNumber = cllgRegistorNumber;
        this.cllgRanking = cllgRanking;
        this.cllgFees = cllgFees;
        this.cllgType = cllgType;
        this.iscllgActive = iscllgActive;
    }

    public String getCllgName() {
        return cllgName;
    }

    public void setCllgName(String cllgName) {
        this.cllgName = cllgName;
    }

    public String getCllgLocation() {
        return cllgLocation;
    }

    public void setCllgLocation(String cllgLocation) {
        this.cllgLocation = cllgLocation;
    }

    public int getCllgId() {
        return cllgId;
    }

    public void setCllgId(int cllgId) {
        this.cllgId = cllgId;
    }

    public int getCllgTotalStudents() {
        return cllgTotalStudents;
    }

    public void setCllgTotalStudents(int cllgTotalStudents) {
        this.cllgTotalStudents = cllgTotalStudents;
    }

    public int getCllgTotalBus() {
        return cllgTotalBus;
    }

    public void setCllgTotalBus(int cllgTotalBus) {
        this.cllgTotalBus = cllgTotalBus;
    }

    public long getCllgRegistorNumber() {
        return cllgRegistorNumber;
    }

    public void setCllgRegistorNumber(long cllgRegistorNumber) {
        this.cllgRegistorNumber = cllgRegistorNumber;
    }

    public float getCllgRanking() {
        return cllgRanking;
    }

    public void setCllgRanking(float cllgRanking) {
        this.cllgRanking = cllgRanking;
    }

    public double getCllgFees() {
        return cllgFees;
    }

    public void setCllgFees(double cllgFees) {
        this.cllgFees = cllgFees;
    }

    public char getCllgType() {
        return cllgType;
    }

    public void setCllgType(char cllgType) {
        this.cllgType = cllgType;
    }

    public boolean isIscllgActive() {
        return iscllgActive;
    }

    public void setIscllgActive(boolean iscllgActive) {
        this.iscllgActive = iscllgActive;
    }

    @Override
    public String toString() {
        return "CollegeDto{" +
                "cllgName='" + cllgName + '\'' +
                ", cllgLocation='" + cllgLocation + '\'' +
                ", cllgId=" + cllgId +
                ", cllgTotalStudents=" + cllgTotalStudents +
                ", cllgTotalBus=" + cllgTotalBus +
                ", cllgRegistorNumber=" + cllgRegistorNumber +
                ", cllgRanking=" + cllgRanking +
                ", cllgFees=" + cllgFees +
                ", cllgType=" + cllgType +
                ", iscllgActive=" + iscllgActive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CollegeDto)) return false;
        CollegeDto that = (CollegeDto) o;
        return cllgId == that.cllgId && cllgTotalStudents == that.cllgTotalStudents && cllgTotalBus == that.cllgTotalBus && cllgRegistorNumber == that.cllgRegistorNumber && Float.compare(cllgRanking, that.cllgRanking) == 0 && Double.compare(cllgFees, that.cllgFees) == 0 && cllgType == that.cllgType && iscllgActive == that.iscllgActive && Objects.equals(cllgName, that.cllgName) && Objects.equals(cllgLocation, that.cllgLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cllgName, cllgLocation, cllgId, cllgTotalStudents, cllgTotalBus, cllgRegistorNumber, cllgRanking, cllgFees, cllgType, iscllgActive);
    }
}
