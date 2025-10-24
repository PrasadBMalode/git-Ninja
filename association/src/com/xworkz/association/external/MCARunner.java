package com.xworkz.association.external;

import com.xworkz.association.internal.Faculty;
import com.xworkz.association.internal.HOD;
import com.xworkz.association.internal.MCA;
import com.xworkz.association.internal.Student;

public class MCARunner {
    public static void main(String[] args) {
        HOD hod=new HOD("Naveen","MCA");
        Faculty faculty=new Faculty(24,true);
        Student student=new Student("PRASAD",15);
        MCA mca=new MCA("AGI","Devanhalli",hod,faculty,student);
        mca.displayMCA();

        hod.displayHOD();
        faculty.displayFaculty();
        student.displayStudent();


    }
}
