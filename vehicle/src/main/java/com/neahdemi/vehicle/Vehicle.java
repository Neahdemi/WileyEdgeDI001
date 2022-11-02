package com.neahdemi.vehicle;

/**
 *
 * @author neahbanberry-duhaney
 * 
 * 
 * Create a class called Vehicle. In the Vehicle class constructor initialize few variables like colour, no of
wheels, model etc.
Create subclasses like Car.
Add common methods in the base class and specific methods in the corresponding class.
Create a class called Road and create objects for the Car and display the appropriate message.
 */
public class Vehicle {
    
    private String model, size, colour;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    
    public void inputVehicleDetails(String model, String colour, String size, String type, int doors, int wheels){
        this.model = model;
        this.colour = colour;
        this.size = size;
        //this.type = type;
       // this.doors = doors;
        //this.wheels = wheels;
        
    }
    
    public void displayVehicle(){
        System.out.println("Model: " + model);
       // System.out.println("Doors: " + doors);
        System.out.println("Size: " + size);
        //System.out.println("Type: " + type);
        //System.out.println("Wheels: " + wheels);
        System.out.println("Colour: " + colour);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
//

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

   //

   //

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
