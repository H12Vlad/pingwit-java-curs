package com.pingwit.part_9.homework.task_2;

public class Person {
    // ВСЕ поля класса сделай приватными, для этого и нужны геттеры и сеттеры
    String name;
    String surname;
    int birthYear;
    String gender; // в задании сказано, что я могу пол указать только мужской или женский, если поле String, то нету никаких ограничений. Нужен другой тип
    String maritalStatus; // в задании сказано, что я могу семейный статус указать только single/married, если поле String, то нету никаких ограничений. Нужен другой тип

    public Person(String name, String surname, int birthYear, String gender, String maritalStatus) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
