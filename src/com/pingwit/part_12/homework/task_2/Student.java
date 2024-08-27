package com.pingwit.part_12.homework.task_2;

public class Student {
    private String name;
    private String surname;
    private int age;

    Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentSorted{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}