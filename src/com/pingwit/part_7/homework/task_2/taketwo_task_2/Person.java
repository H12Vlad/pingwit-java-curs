package com.pingwit.part_7.homework.task_2.taketwo_task_2;

// отформатируй код
public class Person { // этот вариант лучше
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

    // давай уберем этот код отсюда
//    public static void main(String[] args) {
//        Person person = new Person();
//        System.out.println(person.age);
//        System.out.println(person.name);
//
//    }

}
