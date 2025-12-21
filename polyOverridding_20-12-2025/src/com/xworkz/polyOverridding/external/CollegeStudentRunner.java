package com.xworkz.polyOverridding.external;

import com.xworkz.polyOverridding.internal.College;
import com.xworkz.polyOverridding.internal.Student;

public class CollegeStudentRunner {
    public static void main(String[] args) {
        College obj=new Student();
        obj.display();
        obj.id();
        obj.name();
        obj.hod();
        obj.location();
    }
}
