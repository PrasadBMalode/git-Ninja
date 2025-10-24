package com.xworkz.association.external;

import com.xworkz.association.internal.College;
import com.xworkz.association.internal.CollegeLibrary;
import com.xworkz.association.internal.RollNumber;
import com.xworkz.association.internal.Scolership;

public class StudentDetailsRunner {
    public static void main(String[] args) {
        RollNumber rollNumber=new RollNumber("PRASAD",143);
        rollNumber.displayRoleNumber();

        CollegeLibrary collegeLibrary=new CollegeLibrary("Sarvajna library",rollNumber);
        collegeLibrary.displayCollegeLibrary();

        Scolership scolership=new Scolership("SSP scholership", rollNumber);
        scolership.displayschloershipName();

        College college=new College("Akash global College","MCA",rollNumber);
        college.displayColege();
    }
}
