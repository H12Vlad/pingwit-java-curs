package com.pingwit.part_12.homework.task_2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PlayStudents {
    public static void main(String[] args) throws Exception {
        UniversityStudents university = new UniversityStudents();
        System.out.println("Before adding a student: " + university);

        try {
            Constructor<Student> constructor = Student.class.getDeclaredConstructor(String.class, String.class, int.class);
            constructor.setAccessible(true);
            Student newStudent = constructor.newInstance("Bruce", "Lee", 18);
            university.Student(newStudent);
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException |
                 InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("After adding a student: " + university);
    }
}