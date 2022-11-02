package com.neahdemi.height;

/**
 *
 * @author neahbanberry-duhaney
 */
/**
 *
 * @author neahbanberry-duhaney
 * 1st Nov 2022 Class Assignment 1
Create a Height class which represents height in feet and inches.
Create setters, getters and sum method to calculate sum of two height objects.
Note :
1. 1 feet = 12 inches
2. Make sure you must get height in proper unit after adding two height objects as well.
 */
public class Height {
    
    private int feet, inches;

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }
    
    public void addHeights(Height h1, Height h2){
        int totalInchesH1 = h1.getInches() + (h1.getFeet() * 12);
        int totalInchesH2 = h2.getInches() + (h2.getFeet() * 12);
        int totalInches = totalInchesH1 + totalInchesH2;
        this.feet = Math.floorDiv(totalInches, 12);
        this.inches = totalInches % 12;
        
    }
    
    
    
}
