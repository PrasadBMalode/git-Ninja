package com.xworkz.collectionSecond.dto;

import java.util.Objects;

public class EmployeeDto {
    private String employeName;
    private String employeBusDriverName;
    private int employeId;
    private int employeTotalEL;
    private int employeTotalProject;
    private long employeRegistorNumber;
    private float employeRanking;
    private double employeSalary;
    private char employeCode;
    private boolean isEmployeActive;

    public EmployeeDto(String employeName, String employeBusDriverName, int employeId,
                       int employeTotalEL, int employeTotalProject, long employeRegistorNumber,
                       float employeRanking,double employeSalary, char employeCode,
                       boolean isEmployeActive) {

        this.employeName = employeName;
        this.employeBusDriverName = employeBusDriverName;
        this.employeId = employeId;
        this.employeTotalEL = employeTotalEL;
        this.employeTotalProject = employeTotalProject;
        this.employeRegistorNumber = employeRegistorNumber;
        this.employeRanking = employeRanking;
        this.employeSalary = employeSalary;
        this.employeCode = employeCode;
        this.isEmployeActive = isEmployeActive;
    }

    public String getEmployeName() {
        return employeName;
    }

    public void setEmployeName(String employeName) {
        this.employeName = employeName;
    }

    public String getEmployeBusDriverName() {
        return employeBusDriverName;
    }

    public void setEmployeBusDriverName(String employeBusDriverName) {
        this.employeBusDriverName = employeBusDriverName;
    }

    public int getEmployeId() {
        return employeId;
    }

    public void setEmployeId(int employeId) {
        this.employeId = employeId;
    }

    public int getEmployeTotalEL() {
        return employeTotalEL;
    }

    public void setEmployeTotalEL(int employeTotalEL) {
        this.employeTotalEL = employeTotalEL;
    }

    public int getEmployeTotalProject() {
        return employeTotalProject;
    }

    public void setEmployeTotalProject(int employeTotalProject) {
        this.employeTotalProject = employeTotalProject;
    }

    public long getEmployeRegistorNumber() {
        return employeRegistorNumber;
    }

    public void setEmployeRegistorNumber(long employeRegistorNumber) {
        this.employeRegistorNumber = employeRegistorNumber;
    }

    public float getEmployeRanking() {
        return employeRanking;
    }

    public void setEmployeRanking(float employeRanking) {
        this.employeRanking = employeRanking;
    }

    public double getEmployeSalary() {
        return employeSalary;
    }

    public void setEmployeSalary(double employeSalary) {
        this.employeSalary = employeSalary;
    }

    public char getEmployeCode() {
        return employeCode;
    }

    public void setEmployeCode(char employeCode) {
        this.employeCode = employeCode;
    }

    public boolean isEmployeActive() {
        return isEmployeActive;
    }

    public void setEmployeActive(boolean employeActive) {
        isEmployeActive = employeActive;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "employeName='" + employeName + '\'' +
                ", employeBusDriverName='" + employeBusDriverName + '\'' +
                ", employeId=" + employeId +
                ", employeTotalEL=" + employeTotalEL +
                ", employeTotalProject=" + employeTotalProject +
                ", employeRegistorNumber=" + employeRegistorNumber +
                ", employeRanking=" + employeRanking +
                ", employeSalary=" + employeSalary +
                ", employeCode=" + employeCode +
                ", isEmployeActive=" + isEmployeActive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeDto)) return false;
        EmployeeDto that = (EmployeeDto) o;
        return employeId == that.employeId && employeTotalEL == that.employeTotalEL && employeTotalProject == that.employeTotalProject && employeRegistorNumber == that.employeRegistorNumber && Float.compare(employeRanking, that.employeRanking) == 0 && Double.compare(employeSalary, that.employeSalary) == 0 && employeCode == that.employeCode && isEmployeActive == that.isEmployeActive && Objects.equals(employeName, that.employeName) && Objects.equals(employeBusDriverName, that.employeBusDriverName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeName, employeBusDriverName, employeId, employeTotalEL, employeTotalProject, employeRegistorNumber, employeRanking, employeSalary, employeCode, isEmployeActive);
    }
}
