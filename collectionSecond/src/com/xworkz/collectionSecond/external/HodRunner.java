package com.xworkz.collectionSecond.external;

import com.xworkz.collectionSecond.dto.HodDto;

import java.util.ArrayList;
import java.util.List;

public class HodRunner {

    public static void main(String[] args) {
        List<HodDto> list=new ArrayList<>();

        list.add(new HodDto("Ravi",'P',10001,"Naveen",9876543212l,8.8f,675647l,77.999,15,true));
        list.add(new HodDto("Ravi", 'P', 10001, "Naveen", 9876543212L, 8.8f, 675647L, 77.999, 15, true));
        list.add(new HodDto("Suresh", 'S', 10002, "Mahesh", 9876543213L, 9.1f, 675648L, 72.555, 12, false));
        list.add(new HodDto("Kiran", 'K', 10003, "Rohit", 9876543214L, 7.5f, 675649L, 69.444, 10, true));
        list.add(new HodDto("Deepak", 'D', 10004, "Prakash", 9876543215L, 8.3f, 675650L, 74.212, 18, false));
        list.add(new HodDto("Manoj", 'M', 10005, "Sagar", 9876543216L, 8.7f, 675651L, 70.999, 20, true));

        list.add(new HodDto("Karthik", 'K', 10006, "Sharath", 9876543217L, 9.0f, 675652L, 79.123, 11, false));
        list.add(new HodDto("Ajay", 'A', 10007, "Ramesh", 9876543218L, 7.9f, 675653L, 66.778, 9, true));
        list.add(new HodDto("Vinod", 'V', 10008, "Tejas", 9876543219L, 8.6f, 675654L, 73.000, 14, false));
        list.add(new HodDto("Praveen", 'P', 10009, "Akash", 9876543220L, 9.2f, 675655L, 80.120, 16, true));
        list.add(new HodDto("Sharath", 'S', 10010, "Koushik", 9876543221L, 8.4f, 675656L, 71.222, 13, false));

        list.add(new HodDto("Rohit", 'R', 10011, "Darshan", 9876543222L, 7.8f, 675657L, 68.569, 8, true));
        list.add(new HodDto("Vijay", 'V', 10012, "Nitin", 9876543223L, 8.9f, 675658L, 76.890, 15, false));
        list.add(new HodDto("Harish", 'H', 10013, "Yogesh", 9876543224L, 9.3f, 675659L, 82.345, 17, true));
        list.add(new HodDto("Ramesh", 'R', 10014, "Madhu", 9876543225L, 7.6f, 675660L, 65.432, 7, false));
        list.add(new HodDto("Shankar", 'S', 10015, "Vinay", 9876543226L, 8.1f, 675661L, 70.876, 12, true));

        list.add(new HodDto("Naveen", 'N', 10016, "Manish", 9876543227L, 8.5f, 675662L, 74.111, 19, false));
        list.add(new HodDto("Girish", 'G', 10017, "Lokesh", 9876543228L, 9.4f, 675663L, 81.900, 16, true));
        list.add(new HodDto("Sachin", 'S', 10018, "Deepu", 9876543229L, 7.3f, 675664L, 63.789, 9, false));
        list.add(new HodDto("Yogesh", 'Y', 10019, "Prem", 9876543230L, 8.2f, 675665L, 72.667, 10, true));
        list.add(new HodDto("Mallesh", 'M', 10020, "Raju", 9876543231L, 8.9f, 675666L, 77.100, 14, false));

        list.add(new HodDto("Suhas", 'S', 10021, "Tarun", 9876543232L, 9.1f, 675667L, 79.555, 18, true));
        list.add(new HodDto("Keshav", 'K', 10022, "Rohini", 9876543233L, 7.7f, 675668L, 64.900, 8, false));
        list.add(new HodDto("Rajesh", 'R', 10023, "Arun", 9876543234L, 8.0f, 675669L, 69.321, 11, true));
        list.add(new HodDto("Sandeep", 'S', 10024, "Gagan", 9876543235L, 8.6f, 675670L, 75.220, 12, false));
        list.add(new HodDto("Umesh", 'U', 10025, "Nitin", 9876543236L, 9.0f, 675671L, 80.876, 17, true));

        list.add(new HodDto("Tejas", 'T', 10026, "Yash", 9876543237L, 8.3f, 675672L, 72.450, 13, false));
        list.add(new HodDto("Arun", 'A', 10027, "Bhanu", 9876543238L, 7.8f, 675673L, 68.980, 9, true));
        list.add(new HodDto("Mahesh", 'M', 10028, "Santhosh", 9876543239L, 9.2f, 675674L, 81.333, 16, false));
        list.add(new HodDto("Lokesh", 'L', 10029, "Chetan", 9876543240L, 8.1f, 675675L, 70.123, 10, true));
        list.add(new HodDto("Nithin", 'N', 10030, "Harsha", 9876543241L, 8.7f, 675676L, 76.444, 15, false));


        list.forEach(n-> System.out.println(n));

        for (HodDto dto:list){
            System.out.println(dto);
        }

    }
}
