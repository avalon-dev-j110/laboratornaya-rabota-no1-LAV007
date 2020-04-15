package ru.avalon.java.dev.j10.labs.commons;

public class Address {
    
private String country;
private String postCode;
private String region;
private String city;
private String street;
private String housesNumber;
private String flatsNumber;

public Address(String country, String postCode, String region, String city,
               String street, String housesNumber, String flatsNumber){
           setCountry(country);
           setPostCode(postCode);
           setRegion(region);
           setCity(city);
           setStreet(street);
           setHousesNumber(housesNumber);
           setFlatsNumber(flatsNumber);
    }

public void setCountry(String country) {
this.country = country;
}
public String getCountry() {
return country;
}

public void setPostCode(String postCode) {
this.postCode = postCode;
}
public String getPostCode() {
return postCode;
}

public void setRegion(String region) {
this.region = region;
}
public String getRegion() {
return region;
}

public void setCity(String city) {
this.city = city;
}
public String getCity() {
return city;
}

public void setStreet(String street) {
this.street = street;
}
public String getStreet() {
return street;
}

public void setHousesNumber(String housesNumber) {
this.housesNumber = housesNumber;
}
public String getHousesNumber() {
return housesNumber;
}

public void setFlatsNumber(String flatsNumber) {
this.flatsNumber = flatsNumber;
}
public String getFlatsNumber() {
return flatsNumber;
}
}
