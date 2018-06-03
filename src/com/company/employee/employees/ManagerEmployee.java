package com.company.employee.employees;

import com.company.employee.Employee;

public class ManagerEmployee extends Employee {

    private Integer supervisingPeopleCount;


    public ManagerEmployee(String firstName, String lastName, Integer supervisingPeopleCount) {

        super(firstName, lastName);
        this.supervisingPeopleCount = supervisingPeopleCount;
    }


    public String getPositionType() {
        return "Manager";
    }

    public Integer getSupervisingPeopleCount() {
        return supervisingPeopleCount;
    }

    public void setSupervisingPeopleCount(Integer supervisingPeopleCount) {
        this.supervisingPeopleCount = supervisingPeopleCount;
    }

    @Override
    public String toString() {
        return "ManagerEmployee{" +
                "supervisingPeopleCount=" + supervisingPeopleCount +
                "} " + super.toString();
    }
}
