package com.pingwit.part_12.homework.task_2;

import java.util.Arrays;

public class UniversityStudents {
    private Student[] freshmen;

    public UniversityStudents(Student[] freshmen) {
        this.freshmen = freshmen;
    }

    public void addNewStudent(Student student) {
        freshmen = Arrays.copyOf(freshmen, freshmen.length + 1);
        freshmen[freshmen.length - 1] = student;
    }

    @Override
    public String toString() {
        return "UniversityStudents{" +
                "freshmen=" + Arrays.toString(freshmen) +
                '}';
    }
}