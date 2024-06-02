package com.pingwit.part_12.homework.task_2;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class UniversityStudents {
    private Student[] freshmen;

    public UniversityStudents() {
        this.freshmen = new Student[3];
        freshmen[0] = createStudent("Alice", "Smith", 18);
        freshmen[1] = createStudent("Bob", "Johnson", 19);
        freshmen[2] = createStudent("Lola", "Mol", 18);
    }

    public void Student(Student student) {
        freshmen = Arrays.copyOf(freshmen, freshmen.length + 1);
        freshmen[freshmen.length - 1] = student;
    }

    private Student createStudent(String firstName, String lastName, int age) {
        try {
            Constructor<Student> constructor = Student.class.getDeclaredConstructor(String.class, String.class, int.class);
            constructor.setAccessible(true);
            return constructor.newInstance(firstName, lastName, age);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "UniversityStudents{" +
                "freshmen=" + Arrays.toString(freshmen) +
                '}';
    }
}