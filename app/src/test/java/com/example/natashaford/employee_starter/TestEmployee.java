package com.example.natashaford.employee_starter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by natashaford on 20/06/2017.
 */

public class TestEmployee {

    Employee employee;

    @Before
    public void before(){
        employee = new Employee(1, "Natasha Ford", "abcd1234", 20000);
    }

    @Test
    public void canChangeName(){
        assertEquals("Natasha Scott", employee.setName("Natasha Scott"));
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(22000, employee.raiseSalary(2000), 1);
    }

    @Test
    public void checkNoNegativeRaise(){
        assertEquals(0, employee.raiseSalary(-2000), 1);
    }
}