package com.pingwit.part_17.homework.task_3;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class PersonParser {
    public Person[] parsePersons(String data) {
        String[] personDataArray = data.split("; ");
        Person[] persons = new Person[personDataArray.length];

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM");

        for (int i = 0; i < personDataArray.length; i++) {
            String[] fields = personDataArray[i].split(", ");
            try {
                String firstName = fields[0];
                String lastName = fields[1];
                String passportNumber = fields[2];
                LocalDate birthDate = LocalDate.parse(fields[3], formatter);

                persons[i] = new Person(firstName, lastName, passportNumber, birthDate);
            } catch (DateTimeParseException e) {
                System.out.println("Error parsing date for person: " + personDataArray[i]);
                persons[i] = null;
            }
        }
        return persons;
    }
}