package com.pingwit.part_23.homework.task_2;

import java.util.Set;
import java.util.TreeSet;

public class StudentMain {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();
        students.add(new Student("Jon", 23));
        students.add(new Student("Anna", 21));
        students.add(new Student("Dev", 22));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}