package com.xworkz.clock.external;

import com.xworkz.clock.dto.ClockWarrantyDto;

public class WarrantyRunner {

        public static void main(String[] args) {
            ClockWarrantyDto warrantyDto=new ClockWarrantyDto();
            warrantyDto.setCustomerName("Ramya");
            String name =warrantyDto.getCustomerName();
            System.out.println("customer name :"+name);

            warrantyDto.setWarrantyId(234);
            int id =warrantyDto.getWarrantyId();
            System.out.println("warranty id :"+id);

            warrantyDto.setCustomerContact(890768903l);
            long contact = warrantyDto.getCustomerContact();
            System.out.println("Customer contact number :"+contact);

            warrantyDto.setClaimCount(2.1f);
            float count=warrantyDto.getClaimCount();
            System.out.println("Claim count :"+count);

            warrantyDto.setMaxClaimAmount(789.345);
            double amount =warrantyDto.getMaxClaimAmount();
            System.out.println("Maximum claim count :"+amount);

            warrantyDto.setWarrantyType('F');
            char type = warrantyDto.getWarrantyType();
            System.out.println("Type :"+type);
        }
    }


