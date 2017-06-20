package com.example.natashaford.employee_starter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestDirector {

    Director director;

    @Before
    public void before(){
        director = new Director(1, "Natasha Ford", "abcd1234", 20000, "Programming", 40000);
    }

    @Test
    public void canChangeName(){
        assertEquals("Natasha Scott", director.setName("Natasha Scott"));
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(22000, director.raiseSalary(2000), 1);
    }
}