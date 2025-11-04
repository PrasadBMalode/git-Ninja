package com.xworkz.clock.dto;

public class ClockHistoryDto {

        private String inventor;
        private int recordId;
        private long historicalRefNumber;
        private float accuracyImprovement;
        private double historicalValue;
        private char grade;

        public void setInventor(String inventor)
        {
            this.inventor=inventor;
        }
        public String getInventor()
        {
            return inventor;
        }
        public void setRecordId(int recordId)
        {
            this.recordId=recordId;
        }
        public int getRecordId()
        {
            return recordId;
        }
        public void setHistoricalRefNumber(long historicalRefNumber)
        {
            this.historicalRefNumber=historicalRefNumber;
        }
        public long getHistoricalRefNumber()
        {
            return historicalRefNumber;
        }
        public void setAccuracyImprovement(float accuracyImprovement)
        {
            this.accuracyImprovement=accuracyImprovement;
        }
        public float getAccuracyImprovement()
        {
            return accuracyImprovement;
        }
        public void setHistoricalValue(double historicalValue)
        {
            this.historicalValue=historicalValue;
        }
        public double getHistoricalValue()
        {
            return historicalValue;
        }
        public void setGrade(char grade)
        {
            this.grade=grade;
        }
        public char getGrade()
        {
            return grade;
        }

    }


