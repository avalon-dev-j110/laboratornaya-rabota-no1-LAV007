package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.commons.*;

public class Person {
    private Passport pass;
    private Address add;    
    
    public Person(Passport pass, Address add) {
        this.pass = pass;
        this.add = add;
    }
    
    public String getAddress() {
        String addr = add.getCountry() + ", " + add.getPostCode() + ", " +
                     add.getRegion() + ", " + add.getCity() + ", " +
                     add.getStreet() + ", " + add.getHousesNumber() + ", " +  
                     add.getFlatsNumber();        
        return addr;
    } 
    
    /**
     * If person hasn't a second name, and it hasn't patronymic - this method
     * returns only name and surname of it person.
     */
    public String getFullName() {       
        String fullName = pass.getName() + " " + pass.getSurName();             
     return fullName;            
    }
     
    /**
     * This method returns the following information: if a person hasn't a
     * second name -  you have to write down keyword "false" in the argument in
     * the brackets of this method to get name, patronymic and surname of it.
     * But, if the person has second  name -  you have to set the "true" keyword
     * in the brackets.
     */
    public String getFullName(boolean hasSecondName) {
        if (hasSecondName == false) {
            String fullName = pass.getName() + " " + pass.getPatronumic()+ " " +
                              pass.getSurName();        
        return fullName;
    } else {
           String fullName = pass.getName() + " " + pass.getFirst() + " " +
                             pass.getSurName();        
        return fullName; 
        }    
    }
}
   
    
    