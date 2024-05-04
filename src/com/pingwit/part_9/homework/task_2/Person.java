package com.pingwit.part_9.homework.task_2;

public class Person {
    private String name;
    private String surname;
    private int birthYear;
    private Gender gender;
    private FamilyStatus familyStatus;

    public Person(String name, String surname, int birthYear, Gender gender, FamilyStatus familyStatus) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.gender = gender;
        this.familyStatus = familyStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public FamilyStatus getFamilyStatus() {
        return familyStatus;
    }

    public void setFamilyStatus(FamilyStatus familyStatus) {
        this.familyStatus = familyStatus;
    }
}
