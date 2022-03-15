package com.codewithjoey;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    //METHODS
    public int calculateWage(int extraHours){
        return getBaseSalary() + (extraHours * getHourlyRate());
    }

    public void setBaseSalary(int baseSalary){ //SETTER
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }
    //GETTER
    public int getBaseSalary() {
        return baseSalary;
    }


    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or less");
        this.hourlyRate = hourlyRate;
    }

}
