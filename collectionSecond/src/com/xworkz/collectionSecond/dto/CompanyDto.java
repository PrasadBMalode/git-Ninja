package com.xworkz.collectionSecond.dto;

import java.util.Objects;

public class CompanyDto {
    private String companyName;
    private String companyBusDriverName;
    private int companyId;
    private int companyTotalWorkers;
    private int companyTotalBus;
    private long companyRegistorNumber;
    private float companyRanking;
    private double companyWorkersSalary;
    private char companyCode;
    private boolean isCompanyActive;

    public CompanyDto(String companyName, String companyBusDriverName, int companyId,
                      int companyTotalWorkers, int companyTotalBus, long companyRegistorNumber,
                      float companyRanking, double companyWorkersSalary, char companyCode,
                      boolean isCompanyActive) {

        this.companyName = companyName;
        this.companyBusDriverName = companyBusDriverName;
        this.companyId = companyId;
        this.companyTotalWorkers = companyTotalWorkers;
        this.companyTotalBus = companyTotalBus;
        this.companyRegistorNumber = companyRegistorNumber;
        this.companyRanking = companyRanking;
        this.companyWorkersSalary = companyWorkersSalary;
        this.companyCode = companyCode;
        this.isCompanyActive = isCompanyActive;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyBusDriverName() {
        return companyBusDriverName;
    }

    public void setCompanyBusDriverName(String companyBusDriverName) {
        this.companyBusDriverName = companyBusDriverName;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getCompanyTotalWorkers() {
        return companyTotalWorkers;
    }

    public void setCompanyTotalWorkers(int companyTotalWorkers) {
        this.companyTotalWorkers = companyTotalWorkers;
    }

    public int getCompanyTotalBus() {
        return companyTotalBus;
    }

    public void setCompanyTotalBus(int companyTotalBus) {
        this.companyTotalBus = companyTotalBus;
    }

    public long getCompanyRegistorNumber() {
        return companyRegistorNumber;
    }

    public void setCompanyRegistorNumber(long companyRegistorNumber) {
        this.companyRegistorNumber = companyRegistorNumber;
    }

    public float getCompanyRanking() {
        return companyRanking;
    }

    public void setCompanyRanking(float companyRanking) {
        this.companyRanking = companyRanking;
    }

    public double getCompanyWorkersSalary() {
        return companyWorkersSalary;
    }

    public void setCompanyWorkersSalary(double companyWorkersSalary) {
        this.companyWorkersSalary = companyWorkersSalary;
    }

    public char getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(char companyCode) {
        this.companyCode = companyCode;
    }

    public boolean isCompanyActive() {
        return isCompanyActive;
    }

    public void setCompanyActive(boolean companyActive) {
        isCompanyActive = companyActive;
    }

    @Override
    public String toString() {
        return "CompanyDto{" +
                "companyName='" + companyName + '\'' +
                ", companyBusDriverName='" + companyBusDriverName + '\'' +
                ", companyId=" + companyId +
                ", companyTotalWorkers=" + companyTotalWorkers +
                ", companyTotalBus=" + companyTotalBus +
                ", companyRegistorNumber=" + companyRegistorNumber +
                ", companyRanking=" + companyRanking +
                ", companyWorkersSalary=" + companyWorkersSalary +
                ", companyCode=" + companyCode +
                ", isCompanyActive=" + isCompanyActive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompanyDto)) return false;
        CompanyDto that = (CompanyDto) o;
        return companyId == that.companyId && companyTotalWorkers == that.companyTotalWorkers && companyTotalBus == that.companyTotalBus && companyRegistorNumber == that.companyRegistorNumber && Float.compare(companyRanking, that.companyRanking) == 0 && Double.compare(companyWorkersSalary, that.companyWorkersSalary) == 0 && companyCode == that.companyCode && isCompanyActive == that.isCompanyActive && Objects.equals(companyName, that.companyName) && Objects.equals(companyBusDriverName, that.companyBusDriverName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, companyBusDriverName, companyId, companyTotalWorkers, companyTotalBus, companyRegistorNumber, companyRanking, companyWorkersSalary, companyCode, isCompanyActive);
    }
}
