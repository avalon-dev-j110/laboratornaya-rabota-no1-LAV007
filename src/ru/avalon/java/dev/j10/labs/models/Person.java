package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.commons.*;

public class Person {
    private Passport pass;
    private Address add;    
    private int has;
    
    public Person(int has, Passport pass, Address add) {
        this.has = has;
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
     * The method getFullName() returns the following information:
     * 1.) first case:  if a person hasn't a second name, and it hasn't patronymic - you have to write down number 1(one)
     * at the first position in the constructor of a new Person. This method will return only name and surname of it person;
     * 
     * 2.) second case: if the person hasn't a second name, but has a patronymic -  you have to write down number 2 at the first
     * position in the constructor of a new Person to get name, patronymic and surname of it;
     * 
     * 3.) third case: if the person has second  name -  you have to write down number 3 at the first
     * position in the constructor of a new Person. And in this case, the method will return a name of the person, first letter of
     * it's second name and it's a surname.
     * 
     */
    public String getFullName() {
       String fullName;
       switch (has) {
           case 1:
                fullName = pass.getName() + " " + pass.getSurName();
                return fullName;
           case 2:
                fullName = pass.getName() + " " + pass.getPatronumic()+ " " +
                           pass.getSurName();        
                return fullName;
           case 3:
                fullName = pass.getName() + " " + pass.getFirst() + " " +
                           pass.getSurName();        
                return fullName;
       }
    return null;       
    }   
}
