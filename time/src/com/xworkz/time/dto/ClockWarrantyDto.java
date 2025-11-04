package com.xworkz.clock.dto;

public class ClockWarrantyDto {

        private String customerName;
        private int warrantyId;
        private long customerContact;
        private float claimCount;
        private double maxClaimAmount;
        private char warrantyType;

        public void setCustomerName(String customerName)
        {
            this.customerName=customerName;
        }
        public String getCustomerName()
        {
            return customerName;
        }
        public void setWarrantyId(int warrantyId)
        {
            this.warrantyId=warrantyId;
        }
        public int getWarrantyId()
        {
            return warrantyId;
        }
        public void setCustomerContact(long customerContact)
        {
            this.customerContact=customerContact;
        }
        public long getCustomerContact()
        {
            return customerContact;
        }
        public void setClaimCount(float claimCount)
        {
            this.claimCount=claimCount;
        }
        public float getClaimCount()
        {
            return claimCount;
        }
        public void setMaxClaimAmount(double maxClaimAmount)
        {
            this.maxClaimAmount=maxClaimAmount;
        }
        public double getMaxClaimAmount()
        {
            return maxClaimAmount;
        }
        public void setWarrantyType(char warrantyType)
        {
            this.warrantyType=warrantyType;
        }
        public char getWarrantyType()
        {
            return warrantyType;
        }
    }



