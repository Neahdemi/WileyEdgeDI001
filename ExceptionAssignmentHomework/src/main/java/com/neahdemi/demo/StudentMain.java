package com.neahdemi.demo;

import com.neahdemi.exception.AgeException;
import com.neahdemi.exception.MarksException;
import com.neahdemi.exception.RollNoException;
import java.util.Scanner;

/**
 *
 * @author neahbanberry-duhaney
 */
public class StudentMain {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Enter total number of Students:");
            int total = sc.nextInt();
            
            RollNoList rollNoList = new RollNoList(total);
            
            for(int index = 0; index < total; index++){
                Student student = new Student();
                
                System.out.println("Enter Student Roll Number: ");
                student.setRollNo(sc.nextInt());
                System.out.println("Enter Student Name: ");
                student.setName(sc.next());
                System.out.println("Enter Student Age: ");
                student.setAge(sc.nextInt());
                System.out.println("Enter Student Marks: ");
                student.setMarks(sc.nextInt());
                
                rollNoList.inputRollNo(student, index);
       
            }
            rollNoList.displayStudents();    
        }catch(RollNoException | AgeException | MarksException e){
            System.out.println(e.getMessage());         
        }catch(NegativeArraySizeException e){
            System.out.println("Total number of students cannot be negative!");
        }catch(Exception e){
            System.out.println("OOPS Something went wrong, please try again!");
        }
       
    }
    
}
