package com.xworkz.collectionSecond.dto;

import java.util.Objects;

public class ManagerDto {
    private String managerName;
    private String managerBusDriverNa;
    private int managerId;
    private int managerTotalService;
    private long managerNumber;
    private long managerRegistorNumbe;
    private float managerRanking;
    private double managerSalary;
    private char managerCode;
    private boolean isManagerActive;

    public ManagerDto(boolean isManagerActive, String managerBusDriverNa,
                      char managerCode, int managerId, String managerName,
                      long managerNumber, float managerRanking,
                      long managerRegistorNumbe, double managerSalary,
                      int managerTotalService) {


        this.isManagerActive = isManagerActive;
        this.managerBusDriverNa = managerBusDriverNa;
        this.managerCode = managerCode;
        this.managerId = managerId;
        this.managerName = managerName;
        this.managerNumber = managerNumber;
        this.managerRanking = managerRanking;
        this.managerRegistorNumbe = managerRegistorNumbe;
        this.managerSalary = managerSalary;
        this.managerTotalService = managerTotalService;
    }

    public boolean isManagerActive() {
        return isManagerActive;
    }

    public void setManagerActive(boolean managerActive) {
        isManagerActive = managerActive;
    }

    public String getManagerBusDriverNa() {
        return managerBusDriverNa;
    }

    public void setManagerBusDriverNa(String managerBusDriverNa) {
        this.managerBusDriverNa = managerBusDriverNa;
    }

    public char getManagerCode() {
        return managerCode;
    }

    public void setManagerCode(char managerCode) {
        this.managerCode = managerCode;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public long getManagerNumber() {
        return managerNumber;
    }

    public void setManagerNumber(long managerNumber) {
        this.managerNumber = managerNumber;
    }

    public float getManagerRanking() {
        return managerRanking;
    }

    public void setManagerRanking(float managerRanking) {
        this.managerRanking = managerRanking;
    }

    public long getManagerRegistorNumbe() {
        return managerRegistorNumbe;
    }

    public void setManagerRegistorNumbe(long managerRegistorNumbe) {
        this.managerRegistorNumbe = managerRegistorNumbe;
    }

    public double getManagerSalary() {
        return managerSalary;
    }

    public void setManagerSalary(double managerSalary) {
        this.managerSalary = managerSalary;
    }

    public int getManagerTotalService() {
        return managerTotalService;
    }

    public void setManagerTotalService(int managerTotalService) {
        this.managerTotalService = managerTotalService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ManagerDto)) return false;
        ManagerDto that = (ManagerDto) o;
        return managerId == that.managerId && managerTotalService == that.managerTotalService && managerNumber == that.managerNumber && managerRegistorNumbe == that.managerRegistorNumbe && Float.compare(managerRanking, that.managerRanking) == 0 && Double.compare(managerSalary, that.managerSalary) == 0 && managerCode == that.managerCode && isManagerActive == that.isManagerActive && Objects.equals(managerName, that.managerName) && Objects.equals(managerBusDriverNa, that.managerBusDriverNa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(managerName, managerBusDriverNa, managerId, managerTotalService, managerNumber, managerRegistorNumbe, managerRanking, managerSalary, managerCode, isManagerActive);
    }

    @Override
    public String toString() {
        return "ManagerDto{" +
                "isManagerActive=" + isManagerActive +
                ", managerName='" + managerName + '\'' +
                ", managerBusDriverNa='" + managerBusDriverNa + '\'' +
                ", managerId=" + managerId +
                ", managerTotalService=" + managerTotalService +
                ", managerNumber=" + managerNumber +
                ", managerRegistorNumbe=" + managerRegistorNumbe +
                ", managerRanking=" + managerRanking +
                ", managerSalary=" + managerSalary +
                ", managerCode=" + managerCode +
                '}';
    }
}
