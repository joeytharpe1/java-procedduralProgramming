package com.codewithjoey;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var employee = new Employee(50_000, 20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }



}
