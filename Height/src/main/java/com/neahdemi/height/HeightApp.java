package com.neahdemi.height;

/**
 *
 * @author neahbanberry-duhaney
 */
public class HeightApp {
    
    public static void main(String[] args) {
           
        Height h1 = new Height();
        h1.setFeet(5);
        h1.setInches(10);
        
        Height h2 = new Height();
        h2.setFeet(7);
        h2.setInches(11);
        
        Height h3 = new Height();
        h3.addHeights(h1, h2);
        
        System.out.println("5'10 + 7'11 = "+h3.getFeet()+" feet and " + h3.getInches() + " inches.");
        
    }
    
}