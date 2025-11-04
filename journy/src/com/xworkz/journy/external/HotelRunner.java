package com.xworkz.trip.external;

import com.xworkz.trip.dto.HotelDto;

public class HotelRunner {

        public static void main(String[] args) {
            HotelDto hotelDto=new HotelDto();

            hotelDto.setPrice(199);
            int amount=hotelDto.getPrice();
            System.out.println("hotel price==="+amount);

            hotelDto.sethotelNamee("Krishna");
            String hotelNamee=hotelDto.gethotelNamee();
            System.out.println(" hotelName name==="+hotelNamee);

            hotelDto.setregisterNumber(98765432);
            long registerNumber=hotelDto.getregisterNumber();
            System.out.println(" registerNumber==="+registerNumber);

            hotelDto.setRanking(9.9f);
            float ranking=hotelDto.getRanking();
            System.out.println("hotel ranking==="+ranking);

            hotelDto.setMaxPrice(8.999);
            double maxPrice=hotelDto.getMaxPrice();
            System.out.println("maximum hotel price==="+maxPrice);

            hotelDto.setType('F');
            char type=hotelDto.getType();
            System.out.println("its a family type hotel==="+type);

        }

    }


