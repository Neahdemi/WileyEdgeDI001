package com.neahdemi.demo;

//import java.util.Scanner;

/**
 *
 * @author neahbanberry-duhaney
 */
public class PersonList {

    private Person[] persons;
    private int totalNoOfPersons;
    
     public PersonList( int totalNoOfPersons) {
        this.totalNoOfPersons = totalNoOfPersons;
        persons = new Person[totalNoOfPersons];
    }
   
    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public int getTotalNoOfPersons() {
        return totalNoOfPersons;
    }

    public void setTotalNoOfPersons(int totalNoOfPersons) {
        this.totalNoOfPersons = totalNoOfPersons;
    }
    
    public void inputPerson(Person person, int index){
        persons[index]=person;
    }
    public void displayPersonList(){
        for(int index = 0; index <totalNoOfPersons; index++){
            
            System.out.println("ID: "+persons[index].getId() + " Name: " + persons[index].getName() + " Age: " + persons[index].getAge());
        }
    }
    
     
    
}
