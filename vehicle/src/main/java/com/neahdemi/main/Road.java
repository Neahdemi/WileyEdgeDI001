package com.neahdemi.main;

import com.neahdemi.vehicle.Car;
import com.neahdemi.vehicle.Vehicle;
import java.util.Scanner;

/**
 *
 * @author neahbanberry-duhaney
 * Create a class called Vehicle. In the Vehicle class constructor initialize few variables like colour, no of
wheels, model etc.
Create subclasses like Car.
Add common methods in the base class and specific methods in the corresponding class.
Create a class called Road and create objects for the Car and display the appropriate message.
 */
public class Road {
    
    
    public static void main(String[] args) {
        
        Vehicle car = new Vehicle();
        //car.inputVehicleDetails("Vauxhall", "red", "small", "Automobile", 5, 4);
        //car.displayVehicle();
        
        //car.getColour();
        //car.setModel("");
        
        System.out.println("=============================");
        Scanner sc = new Scanner(System.in);
        Car myCar = new Car();
        //corsa.inputCarDetails("Vauxhall", "red", "small", "car", 5, 4, "Corsa", "Small", "car", 5, 4);
        //corsa.displayCarDetails();
        
        System.out.println("What type of vehicle do you have?: " );
        String cModel = sc.nextLine();
        
        System.out.println("What size is your " + cModel + "?");
        String vSize = sc.nextLine();
        
        System.out.println("What type of brand is your " + cModel + "?");
        String cType = sc.nextLine();
        
        System.out.println("What is the name of your " + cType + "?");
        String cName = sc.nextLine();
        
        System.out.println("What colour is your " + cName + "? " );
        String cColour = sc.next();
        
        System.out.println("What size is your " + cModel + "?");
        String cSize = sc.next();
        
        System.out.println("How many wheels does your " + cModel + " have?");
        int cWheels = sc.nextInt();
        
        System.out.println("How many door does your " + cModel + " have?");
        int cDoors = sc.nextInt();
        
        car.setColour(cColour);
        car.setModel(cModel);
        //car.setColour(vColour);
        car.setSize(vSize);
        //car.setDoors(vDoors);
        myCar.setModelType(cType);
        myCar.setModelName(cName);
        myCar.setModelSize(cSize);
        myCar.setNumDoors(cDoors);
        myCar.setNumWheels(cWheels);
        
        System.out.println("==============================");
        System.out.println("The details of your " + cModel + " are: \n");
        
        myCar.displayCarDetails();
        
    }

    
    
}
