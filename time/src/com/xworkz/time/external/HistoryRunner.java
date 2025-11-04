package com.xworkz.clock.external;

import com.xworkz.clock.dto.ClockHistoryDto;

public class HistoryRunner {

        public static void main(String[] args) {


            ClockHistoryDto historyDto=new ClockHistoryDto();
            historyDto.setInventor("John harrison");
            String name = historyDto.getInventor();
            System.out.println("clock inventor :"+name);

            historyDto.setRecordId(301);
            int id =historyDto.getRecordId();
            System.out.println("History id :"+id);

            historyDto.setHistoricalRefNumber(670766555);
            long num=historyDto.getHistoricalRefNumber();
            System.out.println("Historical refNumber :"+num);

            historyDto.setAccuracyImprovement(3.2f);
            float accuracy = historyDto.getAccuracyImprovement();
            System.out.println("Accuracy improvement :"+accuracy);

            historyDto.setHistoricalValue(678.34);
            double value=historyDto.getHistoricalValue();
            System.out.println("Historical value :"+value);
            historyDto.setGrade('A');
            char grade =historyDto.getGrade();
            System.out.println("Grade :"+grade);
        }
    }


