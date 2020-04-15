package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.*;
import ru.avalon.java.dev.j10.labs.models.Person.*;
import ru.avalon.java.dev.j10.labs.commons.*;

public class Main {
    public static void main(String[] args) {
        Person smith = new Person(Name.HAS_NAME_SURNAME, new Passport("John", "Edward", "Smith"),
                       new Address("U.S.A", "15848",  "California",  "Los Angeles",  "Gold\'s Gym",  "34",  "7"));              
        String fullNameSmith = smith.getFullName();
        String addressSmith = smith.getAddress();
        
        Person ivanov = new Person(Name.HAS_PATRONYMIC, new Passport("Ivan","Ivanovich","Ivanov"),
                        new Address("Russia", "188800", "Leningradskaya obl.", "Vyborg", "Turgeneva", "9", "25"));              
        String fullNameIvanov = ivanov.getFullName();
        String addressIvanov = ivanov.getAddress();
        
        Person conor = new Person(Name.HAS_SECOND_NAME, new Passport("Conor","Anthony ","McGregor"),
                       new Address("Ireland", "45957", "Laighean", "Dublin", "Wall street", "24", "57"));              
        String fullNameConor = conor.getFullName();
        String addressConor = conor.getAddress();       
        
        Person ferguson = new Person(Name.HAS_NAME_SURNAME, new Passport("Anthony", "Ferguson"),
                          new Address("U.S.A", "75521", "California", "Oxnard", "Ventura street", "75", "35"));              
        String fullNameFerguson = ferguson.getFullName();
        String addressFerguson = ferguson.getAddress();
        
        System.out.println(fullNameSmith + "\n" + addressSmith + "\n" +  "\n" +
                           fullNameIvanov + "\n" + addressIvanov + "\n" + "\n" +
                           fullNameConor + "\n" + addressConor + "\n" + "\n" +
                           fullNameFerguson + "\n" + addressFerguson + "\n");        
    }
}
