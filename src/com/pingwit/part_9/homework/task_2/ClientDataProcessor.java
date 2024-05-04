package com.pingwit.part_9.homework.task_2;

public class ClientDataProcessor {
    public void processPerson(Person person) {
        long year = 2024;
        int age = 18;

        if (person.getBirthYear() <= (year - age) && FamilyStatus.SINGLE == person.getFamilyStatus()) {
            if (Gender.FEMALE == person.getGender()) {
                System.out.println("Уважаемый " + person.getName() + ", желаете ли познакомиться с девушкой?");
            } else if (Gender.MALE == person.getGender()) {
                System.out.println("Уважаемая " + person.getName() + ", мы поможем вам найти мужчину мечты!");
            } else {
                System.out.println("Невозможно определить пол клиента");
            }
        } else {
            System.out.println("Данные клиента " + person.getName() + " " + person.getSurname() + " не соответствуют требованиям, просьба покинуть наш сайт!");
        }
    }
}