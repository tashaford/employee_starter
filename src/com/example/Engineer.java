package com.example;

public class Engineer extends Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Engineer(int empId, String name, String ssn, int salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

}
