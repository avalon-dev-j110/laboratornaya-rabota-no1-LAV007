package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * 
 * Паспортные данные должны включать:
 * 
 *  серию и номер документа;
 *  имя;
 *  фамилию;
 *  отчество;
 *  второе имя;
 *  день рождения;
 *  дату выдачи;
 *  орган, выдавший документ.
 * 
 */
public class Passport {
    private String serialAndNumberOfDoc;
    private String name;
    private String surName;
    private String patronymic;
    private String secondName;
    private String dateOfBirth;
    private String dateIssueDoc;
    private String authorityIssueDoc;
   
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
    
    public Passport(String name, String patronymic, String surName) {
    this.name = name;
    this.patronymic = patronymic;
    this.surName = surName;    
    }
     
}       
    
