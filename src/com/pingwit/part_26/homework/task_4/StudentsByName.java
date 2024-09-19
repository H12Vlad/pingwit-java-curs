package com.pingwit.part_26.homework.task_4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentsByName {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Аня", "Петрова", 7.0),
                new Student("Аня", "Иванова", 8.0),
                new Student("Евгений", "Чижиков", 6.0),
                new Student("Евгений", "Семенов", 8.0),
                new Student("Ольга", "Недяева", 9.0)
        );

        Map<String, Double> averageGradesByName = students.stream()
                .collect(Collectors.groupingBy(
                        Student::name,
                        Collectors.averagingDouble(Student::gradePointAverage)
                ));

        averageGradesByName.forEach((name, avgGrade) ->
                System.out.println(name + " - " + avgGrade)
        );
    }
}
