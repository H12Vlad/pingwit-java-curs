package com.pingwit.part_12.homework.my_personal_homework_1;

public class Person {
    private String name;
    private int age;

    // в описании задания конструктор приватный, а у тебя паблик
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}