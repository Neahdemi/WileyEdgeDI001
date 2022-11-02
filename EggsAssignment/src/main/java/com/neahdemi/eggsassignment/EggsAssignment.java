package com.neahdemi.eggsassignment;

/**
 *
 * @author neahbanberry-duhaney
 */

/**
 * 
 *Exercise : Consider user has N eggs. Then display the no of eggs in gross (144 eggs make one gross) and no of eggs in dozen (12 eggs make one dozen) and the number of eggs that is left out remaining.
The total no of eggs can be got as input. The program should display how many gross, how many dozen, and how many left over eggs the user has.
 */

public class EggsAssignment {
    
    private int grossEggs, dozenEggs,leftoverEggs, numEggs;
   
    //constructor
    public EggsAssignment(int numEggs) {
        grossEggs = 0;
        dozenEggs = 0;
        leftoverEggs = 0; 
        this.numEggs = numEggs;
    }
    
    public void remainderOfEggs(){
        //find num eggs by dividing the numEggs by 144
        grossEggs = numEggs / 144;
        
        if(grossEggs>= 1){
        numEggs -= 144;  
        }
        
        dozenEggs = numEggs / 12;
        
        leftoverEggs = numEggs % 12; //give me the remaining eggs
       
    }


    public int getGrossEggs() {
        return grossEggs;
    }


    public int getDozenEggs() {
        return dozenEggs;
    }


    public int getLeftoverEggs() {
        return leftoverEggs;
    }

        
}
