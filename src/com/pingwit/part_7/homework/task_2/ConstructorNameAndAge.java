package com.pingwit.part_7.homework.task_2;

public class ConstructorNameAndAge extends NameAndAge {

    public ConstructorNameAndAge(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        ConstructorNameAndAge constructorNameAndAge = new ConstructorNameAndAge(name, age);
        System.out.println(constructorNameAndAge.name);
        System.out.println(constructorNameAndAge.age);


    }

}
