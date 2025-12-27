package com.xworz.comparable.dto;

public class EmployeeDto implements Comparable<EmployeeDto> {

    private String employeeName;
    private int employeId;
    private String company;

    public EmployeeDto(String company, String employeeName, int employeId) {
        this.company = company;
        this.employeeName = employeeName;
        this.employeId = employeId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeId() {
        return employeId;
    }

    public void setEmployeId(int employeId) {
        this.employeId = employeId;
    }

    @Override
    public int compareTo(EmployeeDto o) {

        return this.employeId - o.employeId;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "company='" + company + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeId=" + employeId +
                '}';
    }
}
