package com.pingwit.part_16;

import java.util.Objects;

public class ValidatedPerson {
    @NameValidation(min = 5)
    private String name;
    private int age;

    public ValidatedPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValidatedPerson that = (ValidatedPerson) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "ValidatedPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}