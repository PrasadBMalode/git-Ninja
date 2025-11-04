package com.xworkz.trip.external;

import com.xworkz.trip.dto.PaymentDto;

public class PaymentRunner {
    public static void main(String[] args) {

        PaymentDto paymentDto=new PaymentDto();
        paymentDto.setAccountNumber(5467578);
        long num= paymentDto.getAccountNumber();
        System.out.println("number=="+num);

        paymentDto.setDiscount(5.5f);
        float discount= paymentDto.getDiscount();
        System.out.println("discount=="+discount);

        paymentDto.setCurrencySymbol('A');
        char symbol= paymentDto.getCurrencySymbol();
        System.out.println("symbol=="+symbol);

        paymentDto.setPayerName("ram");
        String name= paymentDto.getPayerName();
        System.out.println("name=="+name);

        paymentDto.setInstallmentCount(45);
        int count= paymentDto.getInstallmentCount();
        System.out.println("count=="+count);

        paymentDto.setTaxAmount(456.7);
        double amount= paymentDto.getTaxAmount();
        System.out.println("amount=="+amount);
        }
    }

