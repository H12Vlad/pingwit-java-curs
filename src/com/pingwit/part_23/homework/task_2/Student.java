package com.pingwit.part_23.homework.task_2;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override //сгенерировал метод или сам написал? Понимаешь почему он так выглядит?(написал сам не генерировал, но не понимаю почему он так выглядит)(если обьяснишь будет круто))
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}