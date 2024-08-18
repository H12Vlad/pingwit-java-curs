package com.pingwit.part_23.homework.task_2;

public class StudentSorted implements Comparable<StudentSorted> { // StudentSorted - название класса должно быть как существительное, это название класса хорошо подходит для названия переменной. Подумай пока сам как название можно изменить
    private String name;
    private int age;

    public StudentSorted(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override //сгенерировал метод или сам написал? Понимаешь почему он так выглядит?
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