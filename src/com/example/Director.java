package com.example;

public class Director extends Manager {

    private int empId;
    private String name;
    private String ssn;
    private double salary;
    private String deptName;
    private int budget;

    public Manager(int empId, String name, String ssn, int salary, String deptName, int budget){
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
        this.deptName = deptName;
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }
}
