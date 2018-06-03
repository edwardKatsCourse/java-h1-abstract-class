package com.company.employee.employees;

import com.company.employee.Employee;

public class DeveloperEmployee extends Employee {

    private Integer yearsOfExperience;


    public DeveloperEmployee(String firstName,
                             String lastName,
                             Integer yearsOfExperience) {
        super(firstName, lastName);

        this.yearsOfExperience = yearsOfExperience;
    }

    public String getPositionType() {
        return "Java Developer";
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "DeveloperEmployee{" +
                "yearsOfExperience=" + yearsOfExperience +
                "} " + super.toString();
    }
}
