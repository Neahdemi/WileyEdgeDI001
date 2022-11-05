package com.neahdemi.exception;

/**
 *
 * @author neahbanberry-duhaney
 * 
 * Create a class called Employee which asks the user to input the name and the age of a 
employee. Raise a custom defined exception when the user enters an employee name 
that has been already entered and raise another exception if the age is negative or less
than 18 or greater than 60.
 */
public class AgeCheckException extends Exception {

    public AgeCheckException(String message){
        super(message);
    }
}
