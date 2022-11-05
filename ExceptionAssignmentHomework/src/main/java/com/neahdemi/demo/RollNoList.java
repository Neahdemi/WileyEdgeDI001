package com.neahdemi.demo;

import com.neahdemi.exception.RollNoException;

/**
 *
 * @author neahbanberry-duhaney
 * 
 *  Create a class called Student which asks the user to input the rollNo, name ,
 * age ,marks of a Student. Raise a custom defined exception when the user enters a student rollNo
that has been already entered and raise another exception if the age is negative or less
than 4 or greater than 18 and one more exception if the marks is negative or greater than 100.
 */
public class RollNoList {
    
    private Student[] rollNoList;
    private int totalRollNos;
    
    public RollNoList(int totalRollNos){
        super();
        
        this.totalRollNos = totalRollNos;
        rollNoList = new Student[totalRollNos];
        
    }
    
    public void inputRollNo(Student rollNo, int index) throws RollNoException{
        
        for(int i = 0; i < index ; i++){
            if(rollNoList[i].getRollNo()==(rollNo.getRollNo()))
                throw new RollNoException("Duplicate Roll Number");
                
        }
        
        rollNoList[index] = rollNo;            
    }
    
    public void displayStudents(){
        
        for(Student rollNo : rollNoList){
            rollNo.display();
        }
    }
    
    
    
    
}
