package com.pingwit.part_7;

public class StudentInitExample {
    static String staticField = "some value";
    int counter = 100;

//    public StudentInitExample() {
//        counter = 200;
//    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
        System.out.println(student.surname);
        System.out.println(student.age);
        System.out.println(student.height);
        System.out.println(student.group);
        System.out.println(student.expelled);
        System.out.println(student.happy);

        System.out.println(student.name);
        student.name = "System hacked";
        System.out.println(student.name);

        student.message = "some text";

        System.out.println("----------------");
        Student randomStudent = new Student();
        System.out.println(randomStudent.name);
        System.out.println(randomStudent.message);
        randomStudent.message = "Random student message";

        System.out.println(student.message);

//        System.out.println(counter);
        System.out.println(staticField);

        StudentInitExample studentInitExample = new StudentInitExample();
        System.out.println(studentInitExample.counter);
    }
}
