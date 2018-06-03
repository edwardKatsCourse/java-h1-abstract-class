package com.company.employee;

import com.company.employee.employees.DeveloperEmployee;
import com.company.employee.employees.HREmployee;
import com.company.employee.employees.ManagerEmployee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee managerEmployee = new ManagerEmployee(
                "Michael",
                "Smith",
                10);

        Employee developerEmployee = new DeveloperEmployee(
                "Alex",
                "Higgins",
                8);


        Employee hrEmployee = new HREmployee(
                "Natalie",
                "Petrova",
                50);


        List<Employee> company = new ArrayList<>();
        company.add(managerEmployee);
        company.add(developerEmployee);
        company.add(hrEmployee);

        /**
         * to be concluded: Interface vs Abstract class
         */

        System.out.println(managerEmployee.toString());
        System.out.println(developerEmployee.toString());
        System.out.println(hrEmployee.toString());
    }

    public void employeeProcessor(DeveloperEmployee e) {

    }
}
