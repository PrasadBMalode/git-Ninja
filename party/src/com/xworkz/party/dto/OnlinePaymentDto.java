package com.xworkz.restaurent.dto;

public class OnlinePaymentDto {

        private int installmentCount;
        private String payerName;
        private double taxAmount;
        private float discount;
        private long accountNumber;
        private char currencySymbol;

        public void setInstallmentCount(int installmentCount) {
            this.installmentCount = installmentCount;
        }

        public int getInstallmentCount() {
            return installmentCount;
        }

        public void setPayerName(String payerName) {
            this.payerName = payerName;
        }

        public String getPayerName() {
            return payerName;
        }

        public void setTaxAmount(double taxAmount) {
            this.taxAmount = taxAmount;
        }

        public double getTaxAmount() {
            return taxAmount;
        }

        public void setDiscount(float discount) {
            this.discount = discount;
        }

        public float getDiscount() {
            return discount;
        }

        public void setAccountNumber(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        public long getAccountNumber() {
            return accountNumber;
        }

        public void setCurrencySymbol(char currencySymbol) {
            this.currencySymbol = currencySymbol;
        }

        public char getCurrencySymbol() {
            return currencySymbol;
        }
    }


