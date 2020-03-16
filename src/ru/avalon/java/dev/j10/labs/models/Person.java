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
     /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     *
     * @return Name Patronymic Surname
     */
    
    public String getFullName(Passport passportOfPerson) {
        new Passport("", "", "");
        String fullName = passportOfPerson.getName() + " " + passportOfPerson.getPatronumic()+ " " +
                       passportOfPerson.getSurName();        
     return fullName;
    }
    
    /**
     * Возврвщает полное имя человека.
     * 
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     *
     * @return Name S. Surname
     */
    
    public String getFullName(Passport passportOfPerson, String x, String y) {
        new Passport("", "", "");        
        String fullName = passportOfPerson.getName() + " " + passportOfPerson.getFirst() + " " +
                          passportOfPerson.getSurName();        
        return fullName;
    }
    
    /**
     * Возврвщает полное имя человека.
     * 
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return Name Surname
     */
    
    public String getFullName(Passport passportOfPerson, String p) {
        new Passport("", "");
        String fullName = passportOfPerson.getName() + " " + passportOfPerson.getSurName();        
        return fullName;
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return Адрес в формате:
     *                         Страна, Почтовый индекс, Регион, Город, Улица, Номер дома, Номер квартиры
     */
     
    public String getAddress(Address personAddres) {
        new Address("", "", "", "", "", "", "");
        String add = personAddres.getCountry()  + ", " +  personAddres.getPostCode() + ", " +
                     personAddres.getRegion()  + ", " +  personAddres.getCity()  + ", " +
                     personAddres.getStreet()  + ", " +  personAddres.getHousesNumber() + ", " +  
                     personAddres.getFlatsNumber();
        
        return add;
    }    
}