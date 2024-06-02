package com.pingwit.part_12.homework.my_personal_homework_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class PlayCheckPerson {
    public static void main(String[] args) {
        try {
            Constructor<Person> constructor = Person.class.getDeclaredConstructor(String.class, int.class);
            constructor.setAccessible(true);
            Person person = constructor.newInstance("Emma Hix", 26);
            System.out.println("Before: " + person);

            Field nameField = Person.class.getDeclaredField("name");
            Field ageField = Person.class.getDeclaredField("age");

            nameField.setAccessible(true);
            ageField.setAccessible(true);

            nameField.set(person, "Piter Boll");
            ageField.set(person, 28);

            System.out.println("After: " + person);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}