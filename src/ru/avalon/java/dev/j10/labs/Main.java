/**Выполнил слушатель 52065 Лысогора Алексей Викторович.
 * Группа ПП.Разработчик ПО (Java) [весна 2020-2]
 * Лабораторная работа №1 по курсу "DEV-J110. Введение в язык Java"
 */
package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.*;
import ru.avalon.java.dev.j10.labs.commons.*;

public class Main {

    public static void main(String[] args) {
        Person smith = new Person();              
        String fullNameSmith = smith.getFullName(new Passport("John", "Edvard", "Smith"));
        String addressSmith = smith.getAddress(new Address("U.S.A", "15848",  "California",  "Los Angeles",  "Gold\'s Gym",  "34",  "7"));
        System.out.println(fullNameSmith + "\n" + addressSmith + "\n");
        
        Person ivanov = new Person();        
        String fullNameIvanov = ivanov.getFullName(new Passport("Ivan", "Ivanovich", "Ivanov"));
        String addressIvanov = ivanov.getAddress(new Address("Russia", "188800", "Leningradskaya obl.", "Vyborg", "Turgeneva", "9", "25"));
        System.out.println(fullNameIvanov + "\n" + addressIvanov + "\n");
      
        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
}
