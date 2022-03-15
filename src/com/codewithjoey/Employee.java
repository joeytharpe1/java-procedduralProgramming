package com.codewithjoey;

public class Employee {
    //INSTANT FIELDS
    private int baseSalary;
    private int hourlyRate;

    //STATIC FIELDS only for employee class references
    public static int numberOfEmployees;

    //CONSTRUCTORS
    public Employee(int baseSalary, int hourlyRate){
        //using setters instead of this.x
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }
    public Employee(int baseSalary){ //overloading a constructor
        //using setters instead of this.x
        this(baseSalary, 0);
    }

    // STATIC METHODS - only see other static methods
    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);
    }

    // METHODS
    public int calculateWage(int extraHours){
        return baseSalary + (extraHours * getHourlyRate());

    }
    public int calculateWage(){ //overloading a method
        return calculateWage(0);
    }

    //SETTERS
    private void setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if(hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    //GETTERS
    private int getBaseSalary() {
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }



}
