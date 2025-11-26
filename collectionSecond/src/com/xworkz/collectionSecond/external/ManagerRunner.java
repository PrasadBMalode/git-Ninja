package com.xworkz.collectionSecond.external;

import com.xworkz.collectionSecond.dto.ManagerDto;

import java.util.ArrayList;
import java.util.List;

public class ManagerRunner {
    public static void main(String[] args) {
        List<ManagerDto> list=new ArrayList<>();

        list.add(new ManagerDto(true,"Mahesh",'M',1234,"Guru",9480295666l,9.2f,7867546l,2.99999,25));
        list.add(new ManagerDto(true,  "Mahesh",   'M', 1234, "Guru",     9480295666L, 9.2f, 7867546L, 2.99999, 25));
        list.add(new ManagerDto(false, "Rakesh",   'R', 1235, "Shivu",    9480295667L, 8.8f, 7867547L, 3.19999, 22));
        list.add(new ManagerDto(true,  "Kiran",    'K', 1236, "Suresh",   9480295668L, 9.1f, 7867548L, 2.89999, 28));
        list.add(new ManagerDto(false, "Deepak",   'D', 1237, "Lokesh",   9480295669L, 8.5f, 7867549L, 3.49999, 20));
        list.add(new ManagerDto(true,  "Naveen",   'N', 1238, "Ramu",     9480295670L, 9.0f, 7867550L, 2.49999, 30));

        list.add(new ManagerDto(true,  "Sharath",  'S', 1239, "Tejas",    9480295671L, 8.7f, 7867551L, 3.59999, 21));
        list.add(new ManagerDto(false, "Vivek",    'V', 1240, "Prakash",  9480295672L, 8.9f, 7867552L, 2.79999, 26));
        list.add(new ManagerDto(true,  "Ajay",     'A', 1241, "Manu",     9480295673L, 9.3f, 7867553L, 3.09999, 24));
        list.add(new ManagerDto(false, "Karthik",  'K', 1242, "Harsha",   9480295674L, 8.4f, 7867554L, 2.69999, 23));
        list.add(new ManagerDto(true,  "Praveen",  'P', 1243, "Yogesh",   9480295675L, 9.4f, 7867555L, 3.29999, 27));

        list.add(new ManagerDto(true,  "Rohit",    'R', 1244, "Ganesh",   9480295676L, 8.6f, 7867556L, 2.99911, 29));
        list.add(new ManagerDto(false, "Sanjay",   'S', 1245, "Vinod",    9480295677L, 8.3f, 7867557L, 3.39999, 19));
        list.add(new ManagerDto(true,  "Yogesh",   'Y', 1246, "Nithin",   9480295678L, 9.5f, 7867558L, 2.59999, 32));
        list.add(new ManagerDto(false, "Harish",   'H', 1247, "Gagan",    9480295679L, 7.9f, 7867559L, 3.59991, 18));
        list.add(new ManagerDto(true,  "Umesh",    'U', 1248, "Chethan",  9480295680L, 8.8f, 7867560L, 2.70999, 33));

        list.add(new ManagerDto(true,  "Suhas",    'S', 1249, "Prem",     9480295681L, 9.1f, 7867561L, 3.79999, 26));
        list.add(new ManagerDto(false, "Arun",     'A', 1250, "Darshan",  9480295682L, 8.2f, 7867562L, 2.89911, 20));
        list.add(new ManagerDto(true,  "Rajesh",   'R', 1251, "Madhu",    9480295683L, 9.0f, 7867563L, 3.19989, 28));
        list.add(new ManagerDto(false, "Sandeep",  'S', 1252, "Bharath",  9480295684L, 7.8f, 7867564L, 3.55999, 27));
        list.add(new ManagerDto(true,  "Tejas",    'T', 1253, "Naveen",   9480295685L, 8.9f, 7867565L, 2.78888, 23));

        list.add(new ManagerDto(true,  "Manoj",    'M', 1254, "Rakesh",   9480295686L, 9.2f, 7867566L, 3.12999, 24));
        list.add(new ManagerDto(false, "Shankar",  'S', 1255, "Lohith",   9480295687L, 8.3f, 7867567L, 2.94444, 22));
        list.add(new ManagerDto(true,  "Girish",   'G', 1256, "Koushik",  9480295688L, 9.4f, 7867568L, 3.05555, 29));
        list.add(new ManagerDto(false, "Tarun",    'T', 1257, "Jayanth",  9480295689L, 7.7f, 7867569L, 3.74444, 21));
        list.add(new ManagerDto(true,  "Rithvik",  'R', 1258, "Arvind",   9480295690L, 8.6f, 7867570L, 3.25555, 31));

        list.add(new ManagerDto(true,  "Divya",    'D', 1259, "Shwetha",  9480295691L, 9.3f, 7867571L, 2.84444, 25));
        list.add(new ManagerDto(false, "Anusha",   'A', 1260, "Sneha",    9480295692L, 8.1f, 7867572L, 3.58888, 22));
        list.add(new ManagerDto(true,  "Pooja",    'P', 1261, "Keerthi",  9480295693L, 9.5f, 7867573L, 2.98888, 30));
        list.add(new ManagerDto(false, "Monica",   'M', 1262, "Anita",    9480295694L, 7.9f, 7867574L, 3.68888, 19));
        list.add(new ManagerDto(true,  "Lavanya",  'L', 1263, "Ramya",    9480295695L, 8.8f, 7867575L, 2.87777, 33));

        list.forEach(n-> System.out.println(n));

        for (ManagerDto dto:list){
            System.out.println(dto);
        }

    }
}
