package com.xworkz.collectionSecond.dto;

import java.util.Objects;

public class BankDto {
    private String customerName;
    private String customerBankName;
    private int customerId;
    private int customerTotalAccount;
    private int customerTotalBranch;
    private long customerRegistorNumber;
    private float customerRanking;
    private double customerSalary;
    private char customerCode;
    private boolean isCustomerAlive;

    public BankDto(String customerBankName, char customerCode, int customerId,
                   String customerName, float customerRanking, long customerRegistorNumber,
                   double customerSalary, int customerTotalAccount, int customerTotalBranch,
                   boolean isCustomerAlive) {

        this.customerBankName = customerBankName;
        this.customerCode = customerCode;
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerRanking = customerRanking;
        this.customerRegistorNumber = customerRegistorNumber;
        this.customerSalary = customerSalary;
        this.customerTotalAccount = customerTotalAccount;
        this.customerTotalBranch = customerTotalBranch;
        this.isCustomerAlive = isCustomerAlive;
    }

    public String getCustomerBankName() {
        return customerBankName;
    }

    public void setCustomerBankName(String customerBankName) {
        this.customerBankName = customerBankName;
    }

    public char getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(char customerCode) {
        this.customerCode = customerCode;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public float getCustomerRanking() {
        return customerRanking;
    }

    public void setCustomerRanking(float customerRanking) {
        this.customerRanking = customerRanking;
    }

    public long getCustomerRegistorNumber() {
        return customerRegistorNumber;
    }

    public void setCustomerRegistorNumber(long customerRegistorNumber) {
        this.customerRegistorNumber = customerRegistorNumber;
    }

    public double getCustomerSalary() {
        return customerSalary;
    }

    public void setCustomerSalary(double customerSalary) {
        this.customerSalary = customerSalary;
    }

    public int getCustomerTotalAccount() {
        return customerTotalAccount;
    }

    public void setCustomerTotalAccount(int customerTotalAccount) {
        this.customerTotalAccount = customerTotalAccount;
    }

    public int getCustomerTotalBranch() {
        return customerTotalBranch;
    }

    public void setCustomerTotalBranch(int customerTotalBranch) {
        this.customerTotalBranch = customerTotalBranch;
    }

    public boolean isCustomerAlive() {
        return isCustomerAlive;
    }

    public void setCustomerAlive(boolean customerAlive) {
        isCustomerAlive = customerAlive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankDto)) return false;
        BankDto bankDto = (BankDto) o;
        return customerId == bankDto.customerId && customerTotalAccount == bankDto.customerTotalAccount && customerTotalBranch == bankDto.customerTotalBranch && customerRegistorNumber == bankDto.customerRegistorNumber && Float.compare(customerRanking, bankDto.customerRanking) == 0 && Double.compare(customerSalary, bankDto.customerSalary) == 0 && customerCode == bankDto.customerCode && isCustomerAlive == bankDto.isCustomerAlive && Objects.equals(customerName, bankDto.customerName) && Objects.equals(customerBankName, bankDto.customerBankName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerName, customerBankName, customerId, customerTotalAccount, customerTotalBranch, customerRegistorNumber, customerRanking, customerSalary, customerCode, isCustomerAlive);
    }

    @Override
    public String toString() {
        return "BankDto{" +
                "customerBankName='" + customerBankName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerId=" + customerId +
                ", customerTotalAccount=" + customerTotalAccount +
                ", customerTotalBranch=" + customerTotalBranch +
                ", customerRegistorNumber=" + customerRegistorNumber +
                ", customerRanking=" + customerRanking +
                ", customerSalary=" + customerSalary +
                ", customerCode=" + customerCode +
                ", isCustomerAlive=" + isCustomerAlive +
                '}';
    }
}
