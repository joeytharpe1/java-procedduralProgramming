package com.codewithjoey;

public class Employee {
    //FIELDS
    public int baseSalary;
    public int hourlyRate;

    //METHODS
    public int calculateWage(int extraHours){
        return baseSalary + (extraHours * hourlyRate);
    }
}
