package com.neahdemi.demo;

import com.neahdemi.exception.AgeCheckException;

/**
 *
 * @author neahbanberry-duhaney
 * Create a class called Employee which asks the user to input the name and the age of a 
employee. Raise a custom defined exception when the user enters an employee name 
that has been already entered and raise another exception if the age is negative or less
than 18 or greater than 60.
 */
public class Employee {
    
    private String name;
    private int age;
    
    public Employee(){
        
    }
    
        public Employee(String name,  int age) throws AgeCheckException {
		if(age>=18 && age <= 60){
			this.name = name;
                        this.age = age;
                }else throw new AgeCheckException("Age must be between 18 to 60");        
                     
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeCheckException {
        if(age>= 18 && age <= 60){
            this.age = age;
        }else 
            throw new AgeCheckException("Age must be between 18 to 60");
        
    }
    
    public void display() {
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Age : "+age);
	}


}
