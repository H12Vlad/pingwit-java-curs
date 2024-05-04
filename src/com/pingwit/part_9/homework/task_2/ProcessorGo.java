package com.pingwit.part_9.homework.task_2;

public class ProcessorGo {
    public static void main(String[] args) {
        Person[] people = {
                new Person("666", "Smith", 1990, Gender.MALE, FamilyStatus.SINGLE),
                new Person("Max", "Müller", 2002, Gender.FEMALE, FamilyStatus.SINGLE),
                new Person("Sophie", "Dubois", 2001, Gender.MALE, FamilyStatus.MARRIED),
                new Person("Lukas", "Novák", 2010, Gender.MALE, FamilyStatus.SINGLE),
        };

        ClientDataProcessor processor = new ClientDataProcessor();
        for (Person person : people) {
            processor.processPerson(person);
        }
    }
}