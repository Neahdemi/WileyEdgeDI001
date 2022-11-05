package com.neahdemi.demo;

import com.neahdemi.exception.AgeException;
import com.neahdemi.exception.MarksException;

/**
 *
 * @author neahbanberry-duhaney
 * Create a class called Student which asks the user to input the rollNo, name ,
 * age ,marks of a Student. Raise a custom defined exception when the user enters a student rollNo
that has been already entered and raise another exception if the age is negative or less
than 4 or greater than 18 and one more exception if the marks is negative or greater than 100.
 */
public class Student {
    
    private int rollNo, age, marks;
    private String name;
    
    public Student(){
    
    }
    
    public Student(String name, int rollNo, int age) throws AgeException{
        if(age >= 4 && age <=18){
            this.age = age;
            //this.marks = marks;
            this.name = name;
            this.rollNo = rollNo;
        }else
            throw new AgeException("Age must be between 4 and 18.");
    }
    
    public Student(String name, int rollNo, int age, int marks) throws MarksException{
        if(marks >= 0 && marks <=100){
            this.age = age;
            this.marks = marks;
            this.name = name;
            this.rollNo = rollNo;
        }else
            throw new MarksException("Marks must be between 0 and 100");
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {
        if(age >= 4 && age <=18){
            this.age = age;
        }else
            throw new AgeException("Age must be between 4 and 18.");
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) throws MarksException {
        if(marks >= 0 && marks <=100){
            this.marks = marks;
        }else
            throw new MarksException("Marks must be between 0 and 100");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Student Roll Number: " + rollNo);
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
        System.out.println("Student marks: " + marks);
        
    }
    
    

    
}
