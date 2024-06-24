package com.pingwit.part_17.homework.task_3;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private String passportNumber;
    private LocalDate birthDate;

    public Person(String firstName, String lastName, String passportNumber, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}