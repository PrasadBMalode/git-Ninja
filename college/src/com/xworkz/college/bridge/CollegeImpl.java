package com.xworkz.college.bridge;

import com.xworkz.college.internal.*;

public class CollegeImpl implements College{
    @Override
    public CollegeInfo displayCollegeInfo(CollegeInfo collegeInfo) {
        if(collegeInfo.collegeName=="Akash"){
            System.out.println("My college");
        }
        else{
            System.out.println("its not my college");
        }

        return collegeInfo;
    }

    @Override
    public CollegeDetails displayCollegeDetails(CollegeDetails collegeDetails) {
        if(collegeDetails.numberOfFaculty>50){
            System.out.println("Enough Facultys");
        }
        else {
            System.out.println("Facultys required");
        }
        return collegeDetails;
    }

    @Override
    public CollegeStudents displayCollegeStudents(CollegeStudents collegeStudents) {
        if(collegeStudents.numberOfStudents>9.999){
            System.out.println("More students");
        }
        else {
            System.out.println("Enough students");
        }
        return collegeStudents;
    }

    @Override
    public CollegeBus displayCollegeBus(CollegeBus collegeBus) {
        if(collegeBus.busColore=="yellow"){
            System.out.println("color looks good");
        }
        else {
            System.out.println("not good");
        }
        return collegeBus;
    }

    @Override
    public CollegeCanteen displayCollegeCanteen(CollegeCanteen collegeCanteen) {
        if(collegeCanteen.normalPrice<40){
            System.out.println("its normal price");
        }
        else {
            System.out.println("its high price");
        }
        return collegeCanteen;
    }
}
