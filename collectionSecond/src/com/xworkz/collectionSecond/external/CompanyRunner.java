package com.xworkz.collectionSecond.external;

import com.xworkz.collectionSecond.dto.CompanyDto;

import java.util.ArrayList;
import java.util.List;

public class CompanyRunner {
    public static void main(String[] args) {
        List<CompanyDto> list=new ArrayList<>();

        CompanyDto companyDto=new CompanyDto("Microsoft","Mahesh",1001,30999,8999,989876765434l,9.9f,99.898,'M',true);
        CompanyDto companyDto1  = new CompanyDto("Microsoft", "Mahesh", 1001, 30999, 8999, 989876765434L, 9.9f, 99.898, 'M', true);
        CompanyDto companyDto2  = new CompanyDto("Google", "Rakesh", 1002, 40999, 7999, 989876765435L, 8.7f, 89.345, 'G', false);
        CompanyDto companyDto3  = new CompanyDto("Amazon", "Suresh", 1003, 28999, 6999, 989876765436L, 7.8f, 75.234, 'A', true);
        CompanyDto companyDto4  = new CompanyDto("Apple", "Prashant", 1004, 50999, 5999, 989876765437L, 9.2f, 92.124, 'P', false);
        CompanyDto companyDto5  = new CompanyDto("Meta", "Dinesh", 1005, 37999, 8990, 989876765438L, 8.4f, 82.980, 'C', true);

        CompanyDto companyDto6  = new CompanyDto("IBM", "Sanjay", 1006, 45999, 7600, 989876765439L, 7.9f, 71.456, 'I', false);
        CompanyDto companyDto7  = new CompanyDto("Intel", "Ravi", 1007, 42999, 6400, 989876765440L, 8.8f, 85.678, 'N', true);
        CompanyDto companyDto8  = new CompanyDto("Samsung", "Leela", 1008, 38999, 7200, 989876765441L, 6.7f, 66.901, 'S', false);
        CompanyDto companyDto9  = new CompanyDto("Oracle", "Pooja", 1009, 31999, 7300, 989876765442L, 9.0f, 88.340, 'O', true);
        CompanyDto companyDto10 = new CompanyDto("Adobe", "Kiran", 1010, 47999, 8200, 989876765443L, 8.5f, 77.234, 'D', false);

        CompanyDto companyDto11 = new CompanyDto("Tesla", "Sahana", 1011, 59999, 9300, 989876765444L, 9.3f, 95.123, 'T', true);
        CompanyDto companyDto12 = new CompanyDto("Nvidia", "Harish", 1012, 38990, 8800, 989876765445L, 8.2f, 84.660, 'V', false);
        CompanyDto companyDto13 = new CompanyDto("Qualcomm", "Meena", 1013, 34999, 5600, 989876765446L, 7.6f, 70.998, 'Q', true);
        CompanyDto companyDto14 = new CompanyDto("Siemens", "Anita", 1014, 26999, 4300, 989876765447L, 8.0f, 76.220, 'S', false);
        CompanyDto companyDto15 = new CompanyDto("Cisco", "Keshav", 1015, 29999, 4500, 989876765448L, 9.1f, 90.130, 'C', true);

        CompanyDto companyDto16 = new CompanyDto("Dell", "Roshni", 1016, 38999, 7100, 989876765449L, 7.3f, 64.444, 'D', false);
        CompanyDto companyDto17 = new CompanyDto("HP", "Vikram", 1017, 27999, 6900, 989876765450L, 8.1f, 78.550, 'H', true);
        CompanyDto companyDto18 = new CompanyDto("Lenovo", "Geeta", 1018, 25999, 6700, 989876765451L, 7.5f, 69.233, 'L', false);
        CompanyDto companyDto19 = new CompanyDto("LG", "Sunil", 1019, 23999, 5400, 989876765452L, 8.4f, 81.990, 'G', true);
        CompanyDto companyDto20 = new CompanyDto("Philips", "Shreya", 1020, 32999, 6200, 989876765453L, 6.9f, 61.445, 'P', false);

        CompanyDto companyDto21 = new CompanyDto("Panasonic", "Ajay", 1021, 34990, 6100, 989876765454L, 7.8f, 72.340, 'N', true);
        CompanyDto companyDto22 = new CompanyDto("Sony", "Charan", 1022, 45990, 8900, 989876765455L, 9.4f, 94.210, 'S', false);
        CompanyDto companyDto23 = new CompanyDto("Hitachi", "Yamini", 1023, 38990, 7700, 989876765456L, 8.3f, 80.200, 'H', true);
        CompanyDto companyDto24 = new CompanyDto("Accenture", "Tejas", 1024, 56999, 9100, 989876765457L, 8.9f, 86.900, 'A', false);
        CompanyDto companyDto25 = new CompanyDto("Infosys", "Lavanya", 1025, 29990, 6900, 989876765458L, 7.4f, 73.332, 'I', true);

        CompanyDto companyDto26 = new CompanyDto("Wipro", "Rithvik", 1026, 27990, 6100, 989876765459L, 7.0f, 63.120, 'W', false);
        CompanyDto companyDto27 = new CompanyDto("TCS", "Monica", 1027, 39990, 7800, 989876765460L, 8.6f, 82.678, 'T', true);
        CompanyDto companyDto28 = new CompanyDto("Cognizant", "Swapna", 1028, 41999, 8000, 989876765461L, 8.0f, 75.450, 'C', false);
        CompanyDto companyDto29 = new CompanyDto("Capgemini", "Siddharth", 1029, 45999, 8300, 989876765462L, 8.7f, 83.340, 'G', true);
        CompanyDto companyDto30 = new CompanyDto("Tech Mahindra", "Shruti", 1030, 36999, 7200, 989876765463L, 7.9f, 71.990, 'M', false);

        list.add(companyDto);
        list.add(companyDto1);
        list.add(companyDto2);
        list.add(companyDto3);
        list.add(companyDto4);
        list.add(companyDto5);
        list.add(companyDto6);
        list.add(companyDto7);
        list.add(companyDto8);
        list.add(companyDto9);
        list.add(companyDto10);
        list.add(companyDto11);
        list.add(companyDto12);
        list.add(companyDto13);
        list.add(companyDto14);
        list.add(companyDto15);
        list.add(companyDto16);
        list.add(companyDto17);
        list.add(companyDto18);
        list.add(companyDto19);
        list.add(companyDto20);
        list.add(companyDto21);
        list.add(companyDto22);
        list.add(companyDto23);
        list.add(companyDto24);
        list.add(companyDto25);
        list.add(companyDto26);
        list.add(companyDto27);
        list.add(companyDto28);
        list.add(companyDto29);
        list.add(companyDto30);

        list.forEach(n-> System.out.println(n));

        for (CompanyDto dto:list){
            System.out.println(dto);
        }
    }
}
