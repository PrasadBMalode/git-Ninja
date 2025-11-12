package com.xworkz.objects.external;

import com.xworkz.objects.dto.BusDto;

public class BusDtoRunner {
    public static void main(String[] args) {
        BusDto busDto=new BusDto(101,80,"KSRTC");
        BusDto busDto1=new BusDto(101,80,"KSRTC");
        BusDto busDto2=new BusDto(102,80,"KSRTC");

        System.out.println(busDto.toString());

        System.out.println("busDto == busDto1:-"+busDto.equals(busDto1));
        System.out.println("busDto1==busDto2:-"+busDto1.equals(busDto2));

    }
}
