package com.neahdemi.vehicle;

/**
 *
 * @author neahbanberry-duhaney
 * Create a class called Vehicle. In the Vehicle class constructor initialize few variables like colour, no of
wheels, model etc.
Create subclasses like Car.
Add common methods in the base class and specific methods in the corresponding class.
Create a class called Road and create objects for the Car and display the appropriate message.
 */
public class Car extends Vehicle {
    
    private String modelName, modelSize, modelType;
    private int numWheels, numDoors;
    
    public void inputCarDetails(String model, String colour, String size, String type, int doors, int wheels,
     String modelName, String modelSize, String modelType, int numWheels, int numDoors){
        inputVehicleDetails(model, colour, size, type, doors, wheels);
        this.modelName = modelName;
        this.modelSize = modelSize;
        this.modelType = modelType;
        this.numDoors = numDoors;
        this.numWheels = numWheels;
    }
    
    public void displayCarDetails(){
        displayVehicle();
        System.out.println("Model Name: " + modelName);
        System.out.println("Model Size: " + modelSize);
        System.out.println("Model Type: " + modelType);
        System.out.println("Number of wheels: " + numWheels);
        System.out.println("Number of doors: " + numDoors);
        
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelSize() {
        return modelSize;
    }

    public void setModelSize(String modelSize) {
        this.modelSize = modelSize;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public int getNumWheels(int cWheels) {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getNumDoors(int cDoors) {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

}
