package com.pingwit.part_7.homework.task_3;

public class PersonalInformation {
    private String name;
    private int age;

    public PersonalInformation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonalInformation{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }
}
