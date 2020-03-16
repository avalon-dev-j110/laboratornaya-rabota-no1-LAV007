package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
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
    
    public String getFirst() {
    char first = secondName.charAt(0);
    String firstL = first + ".";
    return firstL;
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
    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */

