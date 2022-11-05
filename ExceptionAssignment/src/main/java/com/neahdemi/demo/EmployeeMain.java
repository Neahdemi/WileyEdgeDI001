package com.neahdemi.demo;

import com.neahdemi.exception.AgeCheckException;
import com.neahdemi.exception.NameCheckException;
import java.util.Scanner;

/**
 *
 * @author neahbanberry-duhaney
 */
public class EmployeeMain {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try{
            
            System.out.println("Enter total number of employees: ");
            int total = sc.nextInt();
            
            EmployeeList employeeList = new EmployeeList(total);
            
            for(int index = 0; index < total; index++ ){
                Employee emp = new Employee();
                
                System.out.println("Enter employee name: ");
                emp.setName(sc.next());
                System.out.println("Enter employee age: ");
                emp.setAge(sc.nextInt());
                
                employeeList.inputEmployee(emp, index);
            }
            employeeList.displayEmployeeList();
        
        }catch(AgeCheckException | NameCheckException e){
            System.out.println(e.getMessage());
        }
        catch(NegativeArraySizeException e){
            System.out.println("Total number of employees cannot be negative");
        }
        catch(Exception e){
            System.out.println("OOPS Something went wrong, please try again after some time!");
        }
    
        
    }
    
}
