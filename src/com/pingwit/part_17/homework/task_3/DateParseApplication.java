package com.pingwit.part_17.homework.task_3;

public class DateParseApplication {
    public static void main(String[] args) {
        String data = "Fedor, Petrov, 197854, 1980-25-02; Peter, Parker, 254870, 1970-01-01; Inna, Filatova, 557504, 1994-02-10";

        PersonParser parser = new PersonParser();
        Person[] persons = parser.parsePersons(data);

        for (Person person : persons) {
            if (person != null) {
                System.out.println(person);
            }
        }
    }
}