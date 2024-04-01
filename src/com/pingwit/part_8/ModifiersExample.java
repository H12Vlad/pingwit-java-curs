package com.pingwit.part_8;

import com.pingwit.part_8.person.Person;
import com.pingwit.part_8.person.ImmutablePerson;

public class ModifiersExample {
    public static void main(String[] args) {
        /*
        1. private - видимость области только наш класс
        2. default - пакет
        3. protected - пакет + наследники
        4. public - видно всем
         */

        Person person = new Person();
        person.setName("Egorka");
        person.setAge(28);
        person.setHungry(false);

        Person.sayHi();

        System.out.println(person);

        person.setName("Kolya");
        System.out.println(person);

        ImmutablePerson immutablePerson = new ImmutablePerson("Petr", 33, true);
        System.out.println(immutablePerson);
    }
}