package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.commons.*;

public class Person {
    private final Passport pass;
    private final Address add;
    
    public enum Name {
    HAS_NAME_SURNAME,
    HAS_PATRONYMIC,
    HAS_SECOND_NAME;    
    }
    
    Name name;
    
    public Person(Name n, Passport pass, Address add) {
        this.pass = pass;
        this.add = add;
        name = n;
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
     * @return 
     */
    public String getFullName() {
       String fullName;       
       switch (name) {
           case HAS_NAME_SURNAME:
                fullName = pass.getName() + " " + pass.getSurName();
                return fullName;
           case HAS_PATRONYMIC:
                fullName = pass.getName() + " " + pass.getPatronumic()+ " " +
                           pass.getSurName();        
                return fullName;
           case HAS_SECOND_NAME:
                fullName = pass.getName() + " " + pass.getFirst() + " " +
                           pass.getSurName();        
                return fullName;
       }
    return "You entered incorrect value";       
    }   
}
