package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.*;
import ru.avalon.java.dev.j10.labs.commons.*;

public class Main {
    public static void main(String[] args) {
        Person smith = new Person(1, new Passport("John","Smith"),
                       new Address("U.S.A", "15848",  "California",  "Los Angeles",  "Gold\'s Gym",  "34",  "7"));              
        String fullNameSmith = smith.getFullName();
        String addressSmith = smith.getAddress();
        
        Person ivanov = new Person(2, new Passport("Ivan","Ivanovich","Ivanov"),
                        new Address("Russia", "188800", "Leningradskaya obl.", "Vyborg", "Turgeneva", "9", "25"));              
        String fullNameIvanov = ivanov.getFullName();
        String addressIvanov = ivanov.getAddress();
        
        Person conor = new Person(3, new Passport("Conor","Anthony ","McGregor"),
                       new Address("Ireland", "45957", "Laighean", "Dublin", "Wall street", "24", "57"));              
        String fullNameConor = conor.getFullName();
        String addressConor = conor.getAddress();       
        
        Person ferguson = new Person(1, new Passport("Anthony", "Ferguson"),
                          new Address("U.S.A", "75521", "California", "Oxnard", "Ventura street", "75", "35"));              
        String fullNameFerguson = ferguson.getFullName();
        String addressFerguson = ferguson.getAddress();
        
        System.out.println(fullNameSmith + "\n" + addressSmith + "\n" +  "\n" +
                           fullNameIvanov + "\n" + addressIvanov + "\n" + "\n" +
                           fullNameConor + "\n" + addressConor + "\n" + "\n" +
                           fullNameFerguson + "\n" + addressFerguson + "\n");        
    }
}
