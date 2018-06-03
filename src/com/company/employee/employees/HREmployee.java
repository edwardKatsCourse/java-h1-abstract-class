package com.company.employee.employees;

import com.company.employee.Employee;

public class HREmployee extends Employee {

    private Integer processingResumesPerDay;



    public HREmployee(String firstName,
                      String lastName,
                      Integer processingResumesPerDay) {

        super(firstName, lastName);
        this.processingResumesPerDay = processingResumesPerDay;
    }


    public String getPositionType() {
        return "Human Resources";
    }


    public Integer getProcessingResumesPerDay() {
        return processingResumesPerDay;
    }

    public void setProcessingResumesPerDay(Integer processingResumesPerDay) {
        this.processingResumesPerDay = processingResumesPerDay;
    }

    @Override
    public String toString() {
        return "HREmployee{" +
                "processingResumesPerDay=" + processingResumesPerDay +
                "} " + super.toString();
    }
}
