package ru.avalon.java.dev.j10.labs.models;

public class Passport {
    private String serialAndNumberOfDoc, name, surName, patronymic, secondName,
                   dateOfBirth, dateIssueDoc, authorityIssueDoc;
    
    public Passport(String name, String surName) {
            this.name = name;            
            this.surName = surName; 
        }  
     
    public Passport(String name, String patronymic, String surName) {
            this.name = name;     
            this.secondName = patronymic;
            this.patronymic = patronymic;
            this.surName = surName;
        }   
      
    public void setSerialAndNumberOfDoc (String serial){
    this.serialAndNumberOfDoc = serial;
    }
    public String getSerialAndNumberOfDoc () {
    return serialAndNumberOfDoc;
    }
    
    public void setName (String setname) {
    this.name = setname;
    }
    public String getName () {
    return name;
    }
    
    public void setSurName (String setsurname) {
    this.surName = setsurname;
    }
    public String getSurName () {
    return surName;
    }
    
    public void setPatronymic (String setpatronymic) {
    this.patronymic = setpatronymic;
    }
    public String getPatronumic () {
    return patronymic;
    }
   
    public void setSecondName(String secondName) {
    this.secondName = secondName;
    }
    public String getSecondName() {
    return secondName;
    }
    
    public void setDateOfBirth (String setdateOfBirth) {
    this.dateOfBirth = setdateOfBirth;
    }
    public String getDateOfBirth () {
    return dateOfBirth;
    }
    
    public void setDateIssueDoc (String setdateIssueDoc) {
    this.dateIssueDoc = setdateIssueDoc;
    }
    public String getDateIssueDoc () {
    return dateIssueDoc;
    }
    
    public void setAuthorityIssueDoc (String authorityIssurDoc) {
    this.authorityIssueDoc = authorityIssurDoc;
    }
    public String getAuthorityIssueDoc () {
    return authorityIssueDoc;
    }

    public String getFirst() {
    char first = secondName.charAt(0);
    String firstL = first + ".";
    return firstL;
    }    
}
