package com.xworkz.collectionSecond.dto;

import java.util.Objects;

public class HodDto {
    private String hodName;
    private String hodBusDriverName;
    private int hodId;
    private int hodTotalService;
    private long hodNumber;
    private long hodRegistorNumbe;
    private float hodRanking;
    private double hodSalary;
    private char hodCode;
    private boolean isHodActive;

    public HodDto(String hodBusDriverName, char hodCode, int hodId, String hodName,
                  long hodNumber, float hodRanking, long hodRegistorNumbe,
                  double hodSalary, int hodTotalService, boolean isHodActive) {

        this.hodBusDriverName = hodBusDriverName;
        this.hodCode = hodCode;
        this.hodId = hodId;
        this.hodName = hodName;
        this.hodNumber = hodNumber;
        this.hodRanking = hodRanking;
        this.hodRegistorNumbe = hodRegistorNumbe;
        this.hodSalary = hodSalary;
        this.hodTotalService = hodTotalService;
        this.isHodActive = isHodActive;
    }

    public String getHodBusDriverName() {
        return hodBusDriverName;
    }

    public void setHodBusDriverName(String hodBusDriverName) {
        this.hodBusDriverName = hodBusDriverName;
    }

    public char getHodCode() {
        return hodCode;
    }

    public void setHodCode(char hodCode) {
        this.hodCode = hodCode;
    }

    public int getHodId() {
        return hodId;
    }

    public void setHodId(int hodId) {
        this.hodId = hodId;
    }

    public String getHodName() {
        return hodName;
    }

    public void setHodName(String hodName) {
        this.hodName = hodName;
    }

    public long getHodNumber() {
        return hodNumber;
    }

    public void setHodNumber(long hodNumber) {
        this.hodNumber = hodNumber;
    }

    public float getHodRanking() {
        return hodRanking;
    }

    public void setHodRanking(float hodRanking) {
        this.hodRanking = hodRanking;
    }

    public long getHodRegistorNumbe() {
        return hodRegistorNumbe;
    }

    public void setHodRegistorNumbe(long hodRegistorNumbe) {
        this.hodRegistorNumbe = hodRegistorNumbe;
    }

    public double getHodSalary() {
        return hodSalary;
    }

    public void setHodSalary(double hodSalary) {
        this.hodSalary = hodSalary;
    }

    public int getHodTotalService() {
        return hodTotalService;
    }

    public void setHodTotalService(int hodTotalService) {
        this.hodTotalService = hodTotalService;
    }

    public boolean isHodActive() {
        return isHodActive;
    }

    public void setHodActive(boolean hodActive) {
        isHodActive = hodActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HodDto)) return false;
        HodDto hodDto = (HodDto) o;
        return hodId == hodDto.hodId && hodTotalService == hodDto.hodTotalService && hodNumber == hodDto.hodNumber && hodRegistorNumbe == hodDto.hodRegistorNumbe && Float.compare(hodRanking, hodDto.hodRanking) == 0 && Double.compare(hodSalary, hodDto.hodSalary) == 0 && hodCode == hodDto.hodCode && isHodActive == hodDto.isHodActive && Objects.equals(hodName, hodDto.hodName) && Objects.equals(hodBusDriverName, hodDto.hodBusDriverName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hodName, hodBusDriverName, hodId, hodTotalService, hodNumber, hodRegistorNumbe, hodRanking, hodSalary, hodCode, isHodActive);
    }

    @Override
    public String toString() {
        return "HodDto{" +
                "hodBusDriverName='" + hodBusDriverName + '\'' +
                ", hodName='" + hodName + '\'' +
                ", hodId=" + hodId +
                ", hodTotalService=" + hodTotalService +
                ", hodNumber=" + hodNumber +
                ", hodRegistorNumbe=" + hodRegistorNumbe +
                ", hodRanking=" + hodRanking +
                ", hodSalary=" + hodSalary +
                ", hodCode=" + hodCode +
                ", isHodActive=" + isHodActive +
                '}';
    }
}
