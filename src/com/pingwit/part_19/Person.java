package com.pingwit.part_19;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = -2437198751732008847L;

    private String name;
    private String surname;
    private int age;
    private Work work;
    private transient String password;

    public Person(String name, String surname, int age, Work work, String password) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.work = work;
        this.password = password;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", work=" + work +
                ", password='" + password + '\'' +
                '}';
    }
}
