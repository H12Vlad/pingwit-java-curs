package com.pingwit.part_7;

public class Student {
    static String message;
    String name;
    String surname;
    String group;
    int age;
    double height;
    Boolean expelled;
    boolean happy;
    static {
        System.out.println("static Init block 1");
        message = "Haaahaaha";
    }
    static {
        System.out.println("static Init block 2");
    }

    {
        System.out.println("Init block 1");
    }
    {
        System.out.println("Init block 2");
    }

    public Student(String name, String surname){
        System.out.println("Constructor 1: ");
        this.name = name;
        this.surname = surname;
        this.happy = false;
    }

    public Student(String name, int age){
        System.out.println("Constructor: ");
        this.name = name;
        this.age = age;
    }
    public  Student(){
        this("Randomname", "RandomSurname");
        System.out.println("Hello from default constructor");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group='" + group + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", expelled=" + expelled +
                ", happy=" + happy +
                '}';
    }
}
