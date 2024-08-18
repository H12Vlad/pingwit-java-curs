package com.pingwit.part_23.homework.task_2;

import java.util.TreeSet;

public class Main { // Main -> StudentMain, чтобы в проекте не было 100500 классов с названием Main
    public static void main(String[] args) {
        TreeSet<StudentSorted> students = new TreeSet<>(); //слева лучше всегда использовать интерфейс, поэтому -> TreeSet<StudentSorted> students -> Set<StudentSorted>

        students.add(new StudentSorted("Jon", 23));
        students.add(new StudentSorted("Anna", 21));
        students.add(new StudentSorted("Dev", 22));

        for (StudentSorted student : students) {
            System.out.println(student);
        }
    }
}