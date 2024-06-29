package com.pingwit.part_17.homework.task_1;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//+
public class WorldClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a city: ");
        String city = scanner.nextLine();

        try {
            ZoneId zoneId = ZoneId.of(city);
            ZonedDateTime currentTime = ZonedDateTime.now(zoneId);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            System.out.println("Time in " + city + ": " + currentTime.format(formatter));
        } catch (Exception e) {
            System.out.println("Invalid city or timezone. Please enter a valid city or timezone.");
        }
    }
}