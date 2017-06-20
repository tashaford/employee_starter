package com.example;

public class Admin extends Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Admin(int empId, String name, String ssn, int salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

}
