package com.example.natashaford.employee_starter;

public class Manager extends Employee {

    private String deptName;

    public Manager(int empId, String name, String ssn, int salary, String deptName){
        super(empId, name, ssn, salary);
        this.deptName = deptName;

    }

    public String getDeptName() {
        return deptName;
    }


}
