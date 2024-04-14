package com.pingwit.part_9.homework.task_2;

public class ProcessorGo {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Anna", "Smith", 1990, "female", "married"),
                new Person("Max", "Müller", 2002, "male", "single"),
                new Person("Sophie", "Dubois", 2001, "female", "single"),
                new Person("Lukas", "Novák", 2010, "male", "single"),
        };
        ClientDataProcessor processor = new ClientDataProcessor();
        for (Person person : people){
            processor.processPerson(person);
        }
    }
}
