package com.xworkz.collectionSecond.external;

import com.xworkz.collectionSecond.dto.StudentDto;

import java.util.ArrayList;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {
        List<StudentDto> list=new ArrayList<>();

        list.add(new StudentDto("Prasad",  "Akash Global College", 2615, 9, 6360211265L, 786543287l, 5.9f, 90.99, 'F', true));
        list.add(new StudentDto("Mahesh",  "Jnana Jyothi College", 2616, 8, 9480551122L, 786543288l, 6.1f, 88.45, 'M', false));
        list.add(new StudentDto("Kiran",   "Reva University",2617, 7, 7337885412L, 786543289l, 7.2f, 76.88, 'M', true));
        list.add(new StudentDto("Ramesh",  "Kristu Jayanti", 2618, 10, 9741223344L, 786543290l, 8.5f, 92.10, 'M', true));
        list.add(new StudentDto("Suresh",  "CMRIT",  2619, 6, 9113344556L, 786543291l, 5.4f, 68.55, 'M', false));

        list.add(new StudentDto("Likitha", "PES University",2620, 9, 8880012345l, 786543292L, 9.1f, 94.44, 'F', true));
        list.add(new StudentDto("Ananya",  "BMS College", 2621, 8, 9988776655l, 786543293L, 8.3f, 89.20, 'F', true));
        list.add(new StudentDto("Yogesh",  "SIT Tumkur", 2622, 7, 7204432112l, 786543294L, 6.9f, 78.90, 'M', false));
        list.add(new StudentDto("Vinay",   "Acharya Institute",2623, 6, 7625534211l, 786543295L, 7.0f, 75.99, 'M', true));
        list.add(new StudentDto("Naveen",  "AIET", 2624, 10, 8095123321l, 786543296L, 8.8f, 91.77, 'M', true));

        list.add(new StudentDto("Varun",   "NMIT", 2625, 9, 6360909090L, 786543297L, 9.2f, 95.01, 'M', true));
        list.add(new StudentDto("Sahana",  "Jyothy College",2626, 8, 9845012345L, 786543298L, 6.5f, 74.55, 'F', false));
        list.add(new StudentDto("Manoj",   "SVIT", 2627, 7, 8867889900L, 786543299L, 7.3f, 79.36, 'M', true));
        list.add(new StudentDto("Girish",  "BIT", 2628, 6, 9988442211L, 786543300L, 5.7f, 70.12, 'M', true));
        list.add(new StudentDto("Karthik", "DSCE",2629, 10, 8105544332L, 786543301L, 9.4f, 96.40, 'M', true));

        list.add(new StudentDto("Arun",    "MSRIT",2630, 8, 9741221188L, 786543302L, 8.0f, 87.70, 'M', true));
        list.add(new StudentDto("Raksha",  "RNSIT",2631, 9, 6360251122L, 786543303L, 8.7f, 90.54, 'F', true));
        list.add(new StudentDto("Kavya",   "NIE Mysore", 2632, 7, 7337445566L, 786543304L, 7.1f, 77.82, 'F', false));
        list.add(new StudentDto("Darshan", "Amrita College",2633, 6, 9112233445L, 786543305L, 6.8f, 73.15, 'M', true));
        list.add(new StudentDto("Harsha",  "RV College",2634, 10, 8095112233L, 786543306L, 9.6f, 97.22, 'M', true));

        list.add(new StudentDto("Rohit",   "Global Academy", 2635, 9, 8867070707L, 786543307L, 9.0f, 91.30, 'M', true));
        list.add(new StudentDto("Praveen", "SJBIT", 2636, 8, 9845022113L, 786543308L, 7.8f, 84.88, 'M', true));
        list.add(new StudentDto("Shruthi", "New Horizon College", 2637, 7, 7612334455L, 786543309L, 6.9f, 75.45, 'F', false));
        list.add(new StudentDto("Bhavana", "East Point College", 2638, 6, 9344332211L, 786543310L, 7.2f, 78.91, 'F', true));
        list.add(new StudentDto("Sudeep",  "Cambridge Institute",  2639, 10, 7204023455L, 786543311L, 9.5f, 95.56, 'M', true));

        list.add(new StudentDto("Ajay",    "CEC", 2640, 8, 8800552211L, 786543312L, 8.1f, 86.33, 'M', true));
        list.add(new StudentDto("Dinesh",  "GIT",  2641, 7, 9900776611L, 786543313L, 6.8f, 74.22, 'M', false));
        list.add(new StudentDto("Meghana", "MIT Manipal", 2642, 6, 7337889900L, 786543314L, 7.9f, 80.44, 'F', true));
        list.add(new StudentDto("Sanjana", "PDIT Hospet",2643, 9, 7090998899L, 786543315L, 9.3f, 93.99, 'F', true));
        list.add(new StudentDto("Tejas",   "AIT Chikkamagaluru",2644, 10, 9480112211L, 786543316L, 9.7f, 98.10, 'M', true));

        list.forEach(n-> System.out.println(n));

        for (StudentDto dto:list){
            System.out.println(dto);
        }

    }
}
