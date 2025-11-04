package com.xworkz.restaurent.external;

import com.xworkz.restaurent.dto.BookingTicketDto;

public class BookingTicketRunner {

        public static void main(String[] args) {
            BookingTicketDto bookingDto=new BookingTicketDto();
            bookingDto.setBookingId("abc");
            String id=bookingDto.getBookingId();
            System.out.println("id=="+id);

            bookingDto.setBookingStatus('a');
            char status= bookingDto.getBookingStatus();
            System.out.println("status=="+status);

            bookingDto.setAmount(324.6);
            double amount= bookingDto.getAmount();
            System.out.println("amount=="+amount);

            bookingDto.setTaxPrice(45.4f);
            float price=bookingDto.getTaxPrice();
            System.out.println("price=="+price);

            bookingDto.setNumberOfRooms(2);
            int rooms= bookingDto.getNumberOfRooms();
            System.out.println("rooms=="+rooms);

            bookingDto.setNumber(53647657);
            long number= bookingDto.getNumber();
            System.out.println("number=="+number);
        }
    }


