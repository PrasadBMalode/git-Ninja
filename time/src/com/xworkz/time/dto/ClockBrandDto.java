package com.xworkz.clock.dto;

public class ClockBrandDto {

        private String brandName;
        private int brandId;
        private long regNumber;
        private double totalRevenue;
        private float marketShare;
        private char brandGrade;

        public void setBrandName(String brandName)
        {
            this.brandName=brandName;

        }
        public String getBrandName()
        {
            return brandName;
        }
        public void setBrandId(int brandId)
        {
            this.brandId=brandId;
        }
        public int getBrandId()
        {
            return brandId;
        }
        public void setRegNumber(long regNumber)
        {
            this.regNumber=regNumber;
        }
        public long getRegNumber()
        {
            return regNumber;
        }
        public void setTotalRevenue(double totalRevenue)
        {
            this.totalRevenue=totalRevenue;
        }
        public double getTotalRevenue()
        {
            return totalRevenue;
        }
        public void setMarketShare(float marketShare)
        {
            this.marketShare=marketShare;
        }
        public float getMarketShare()
        {
            return marketShare;
        }
        public void setBrandGrade(char brandGrade)
        {
            this.brandGrade=brandGrade;
        }
        public char getBrandGrade()
        {
            return brandGrade;
        }

    }

