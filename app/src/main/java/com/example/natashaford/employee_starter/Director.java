package com.example.natashaford.employee_starter;

public class Director extends Manager {

    private int budget;

    public Director(int empId, String name, String ssn, int salary, String deptName, int budget){
        super(empId, name, ssn, salary, deptName);
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }
}
