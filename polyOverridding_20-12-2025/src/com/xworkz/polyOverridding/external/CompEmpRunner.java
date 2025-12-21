package com.xworkz.polyOverridding.external;

import com.xworkz.polyOverridding.internal.Companyee;
import com.xworkz.polyOverridding.internal.Employee;

public class CompEmpRunner {
    public static void main(String[] args) {
        Companyee obj=new Employee();
        obj.display();
        obj.id();
        obj.name();
        obj.mail();
        obj.isActive();
    }
}
