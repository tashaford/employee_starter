package com.example;

public class Manager extends Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;
    private String deptName;

    public Manager(int empId, String name, String ssn, int salary, String deptName){
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }


}
