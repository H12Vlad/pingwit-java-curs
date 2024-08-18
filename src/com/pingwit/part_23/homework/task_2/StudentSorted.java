package com.pingwit.part_23.homework.task_2;

public class StudentSorted implements Comparable<StudentSorted> {
    private String name;
    private int age;

    public StudentSorted(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(StudentSorted other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "StudentSorted{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}