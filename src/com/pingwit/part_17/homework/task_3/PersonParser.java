package com.pingwit.part_17.homework.task_3;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class PersonParser {
    public Person[] parsePersons(String data) {
        String[] personDataArray = data.split("; "); // split("[; ]") -> убери пробел после ;. Вместо пробела лучше использовать trim()
        Person[] persons = new Person[personDataArray.length];

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM");

        for (int i = 0; i < personDataArray.length; i++) {
            String[] fields = personDataArray[i].split(", "); //split("[, ]") -> убери пробел после запятой. Вместо пробела лучше использовать trim()
            try {
                String firstName = fields[0]; // fields[0].trim()
                String lastName = fields[1]; //fields[1].trim()
                String passportNumber = fields[2]; //fields[2].trim()
                LocalDate birthDate = LocalDate.parse(fields[3], formatter); //fields[3].trim()

                persons[i] = new Person(firstName, lastName, passportNumber, birthDate);
            } catch (DateTimeParseException e) {
                System.out.println("Error parsing date for person: " + personDataArray[i]);
                persons[i] = null;
            }
        }
        return persons;
    }
}