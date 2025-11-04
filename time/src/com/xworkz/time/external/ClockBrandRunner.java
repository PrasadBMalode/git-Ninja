package com.xworkz.clock.external;

import com.xworkz.clock.dto.ClockBrandDto;

public class ClockBrandRunner {

        public static void main(String[] args) {
            ClockBrandDto brandDto= new ClockBrandDto();
            brandDto.setBrandName("titan");
            String name=brandDto.getBrandName();
            System.out.println("brand name :"+name);

            brandDto.setBrandId(345677);
            int id = brandDto.getBrandId();
            System.out.println("Brand id :"+id);

            brandDto.setRegNumber(677899999);
            long number=brandDto.getRegNumber();
            System.out.println("brand regNumber :"+number);

            brandDto.setMarketShare(2.3f);
            float share=brandDto.getMarketShare();
            System.out.println("ClockBrand market share :"+share);

            brandDto.setTotalRevenue(123.45);
            double total=brandDto.getTotalRevenue();
            System.out.println("Total revenue "+total);
            brandDto.setBrandGrade('B');
            char grade=brandDto.getBrandGrade();
            System.out.println("Brand grade :"+grade);
        }
    }


