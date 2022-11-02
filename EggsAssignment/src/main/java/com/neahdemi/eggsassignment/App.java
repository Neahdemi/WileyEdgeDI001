
package com.neahdemi.eggsassignment;

import java.util.Scanner;

/**
 *
 * @author neahbanberry-duhaney
 * 
 * Exercise : Consider user has N eggs. Then display the no of eggs in gross (144 eggs make one gross) and no of eggs in dozen (12 eggs make one dozen) and the no of eggs that is left out remaining.
The total no of eggs can be got as input. The program should display how many gross, how many dozen, and how many left over eggs the user has.
 */
public class App {
    
    public static void main(String[] args) {
        
     
          //ask user how many eggs they have
        System.out.println("How many eggs do you have?");
         //get user input with Scanner
         Scanner sc = new Scanner(System.in);
         int userEggs = sc.nextInt();
         //create an object
         EggsAssignment eggs = new EggsAssignment(userEggs);
         
         eggs.remainderOfEggs();
         System.out.println("There are " + eggs.getGrossEggs() + " gross eggs and, "+ eggs.getDozenEggs() + " dozen eggs and, " + eggs.getLeftoverEggs()+" remaining eggs after dozens.");
        
    }
    
  
    
}
