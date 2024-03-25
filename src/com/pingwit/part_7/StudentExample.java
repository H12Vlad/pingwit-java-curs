package com.pingwit.part_7;

public class StudentExample {
    public static void main(String[] args) {
        String name = "Egor";
        String surname = "Pingwit";

        Student egor = new Student(name,surname);
        System.out.println(egor.name);
        System.out.println(egor.surname);
//
//        Student random = new Student();
//        System.out.println(random.name);
//        System.out.println(random.surname);
//
//        Student olya = new Student("Olya", 25);
//        System.out.println(olya.name);
//        System.out.println(olya.surname);
//        System.out.println(olya.age);
    }
}
