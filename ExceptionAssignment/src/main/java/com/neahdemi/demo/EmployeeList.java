package com.neahdemi.demo;

import com.neahdemi.exception.NameCheckException;

/**
 *
 * @author neahbanberry-duhaney
 * Create a class called Employee which asks the user to input the name and the age of a 
employee. Raise a custom defined exception when the user enters an employee name 
that has been already entered and raise another exception if the age is negative or less
than 18 or greater than 60.
 */
public class EmployeeList {
    
    	private final Employee[] empList;
	private final int totalNoOfEmployees;
	
	public EmployeeList(int totalNoOfEmployees) {
//		super();
		this.totalNoOfEmployees = totalNoOfEmployees;
		empList =new Employee[totalNoOfEmployees];
	}
	
	public void inputEmployee(Employee employee,int index) throws NameCheckException {
            
                for(int i = 0; i <index; i++){
                        if(empList[i].getName().equals(employee.getName()))
                            throw new NameCheckException("Duplicate name entered");
        }
		empList[index]=employee;
	}
        
	
	public void displayEmployeeList() {
		//for each for (datatype variable:array/anycollection){statements; }
                for (Employee emp : empList){
                    emp.display();
                }         
	}
	
}
    

