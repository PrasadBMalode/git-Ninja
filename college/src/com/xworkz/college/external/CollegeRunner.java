package com.xworkz.college.external;

import com.xworkz.college.bridge.*;
import com.xworkz.college.internal.*;

public class CollegeRunner {
    public static void main(String[] args) {
        College college=new CollegeImpl();

        CollegeInfo collegeInfo=new CollegeInfo("Akash");
        college.displayCollegeInfo(collegeInfo);
        System.out.println("College name==="+collegeInfo.collegeName);

        CollegeDetails collegeDetails=new CollegeDetails(82);
        college.displayCollegeDetails(collegeDetails);
        System.out.println("number of facultys==="+collegeDetails.numberOfFaculty);

        CollegeStudents collegeStudents=new CollegeStudents(12.999);
        college.displayCollegeStudents(collegeStudents);
        System.out.println("number of students==="+collegeStudents.numberOfStudents);

        CollegeBus collegeBus=new CollegeBus("yellow");
        college.displayCollegeBus(collegeBus);
        System.out.println("bus color==="+collegeBus.busColore);

        CollegeCanteen collegeCanteen=new CollegeCanteen(40);
        college.displayCollegeCanteen(collegeCanteen);
        System.out.println("canteeen normal price==="+collegeCanteen.normalPrice);

        System.out.println("-------------------------------------------------------");
        System.out.println("its a Faculty interface Implimentation");

        Faculty faculty=new FacultyImpl();
        faculty.displayCollegeBus(collegeBus);
        System.out.println("bus color==="+collegeBus.busColore);

        faculty.displayCollegeCanteen(collegeCanteen);
        System.out.println("canteeen normal price==="+collegeCanteen.normalPrice);

        faculty.displayCollegeDetails(collegeDetails);
        System.out.println("number of facultys==="+collegeDetails.numberOfFaculty);

        faculty.displayCollegeInfo(collegeInfo);
        System.out.println("College name==="+collegeInfo.collegeName);

        faculty.displayCollegeStudents(collegeStudents);
        System.out.println("number of students==="+collegeStudents.numberOfStudents);

        System.out.println("------------------------------------------------------------");
        System.out.println("its a Students interface Implimentation");

        Students students=new StudentsImpl();
        students.displayCollegeBus(collegeBus);
        System.out.println("bus color==="+collegeBus.busColore);

        students.displayCollegeCanteen(collegeCanteen);
        System.out.println("canteeen normal price==="+collegeCanteen.normalPrice);

        students.displayCollegeStudents(collegeStudents);
        System.out.println("number of students==="+collegeStudents.numberOfStudents);

        students.displayCollegeDetails(collegeDetails);
        System.out.println("number of facultys==="+collegeDetails.numberOfFaculty);

        students.displayCollegeInfo(collegeInfo);
        System.out.println("College name==="+collegeInfo.collegeName);

        System.out.println("-------------------------------------------------------");
        System.out.println("its a Bus interface implimentation");

        Bus bus=new BusImpl();

        bus.displayCollegeBus(collegeBus);
        System.out.println("bus color==="+collegeBus.busColore);

        bus.displayCollegeCanteen(collegeCanteen);
        System.out.println("canteeen normal price==="+collegeCanteen.normalPrice);

        bus.displayCollegeDetails(collegeDetails);
        System.out.println("number of facultys==="+collegeDetails.numberOfFaculty);

        bus.displayCollegeInfo(collegeInfo);
        System.out.println("College name==="+collegeInfo.collegeName);

        bus.displayCollegeStudents(collegeStudents);
        System.out.println("number of students==="+collegeStudents.numberOfStudents);

        System.out.println("----------------------------------------------------------");
        System.out.println("its a Canteen interface Implimentation");

        Canteen canteen=new CanteenImpl();

        canteen.displayCollegeBus(collegeBus);
        System.out.println("bus color==="+collegeBus.busColore);


        canteen.displayCollegeCanteen(collegeCanteen);
        System.out.println("canteeen normal price==="+collegeCanteen.normalPrice);

        canteen.displayCollegeDetails(collegeDetails);
        System.out.println("number of facultys==="+collegeDetails.numberOfFaculty);

        canteen.displayCollegeInfo(collegeInfo);
        System.out.println("College name==="+collegeInfo.collegeName);

        canteen.displayCollegeStudents(collegeStudents);
        System.out.println("number of students==="+collegeStudents.numberOfStudents);









    }
}
