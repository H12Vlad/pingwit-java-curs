package com.pingwit.part_7.homework.task_2.taketwo_task_2;

public class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person(){
        this.name = "Unknown";
        this.age = 0;
    }
    {
        System.out.println("Создан новый экземпляр класса Person");
    }

//    public static void main(String[] args) {
//        Person person = new Person();
//        System.out.println(person.age);
//        System.out.println(person.name);
//
//    }

}
