package com.codewithjoey;

public class Main {

    public static void main(String[] args) {
	// write your code here
        new Employee(10_000);
        var employee = new Employee(50_000, 20);
        int wage = employee.calculateWage();
        System.out.println(wage);
    }



}
