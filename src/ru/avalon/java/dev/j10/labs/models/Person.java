package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.commons.*;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>именем;
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {
    Passport pass;
    Address add;
         
    public String getFullName() {
        String fullName = pass.getName() + " " + pass.getPatronumic()+ " " +
                       pass.getSurName();        
     return fullName;
    }
         
    public String getAddress() {
        String addr = add.getCountry()  + ", " +  add.getPostCode() + ", " +
                     add.getRegion()  + ", " +  add.getCity()  + ", " +
                     add.getStreet()  + ", " +  add.getHousesNumber() + ", " +  
                     add.getFlatsNumber();
        
        return addr;
    } 

    public Person(Passport pass, Address add) {
        this.pass = pass;
        this.add = add;
    }
    
}