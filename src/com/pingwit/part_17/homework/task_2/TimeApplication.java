package com.pingwit.part_17.homework.task_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TimeApplication {
    public static void main(String[] args) {
        // Строки с датами
        String dateStr1 = "2023-17-01";
        String dateStr2 = "23-2022-01";
        String dateStr3 = "15-07-2024";

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-yyyy-MM");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            LocalDate date1 = LocalDate.parse(dateStr1, formatter1);
            LocalDate date2 = LocalDate.parse(dateStr2, formatter2);
            LocalDate date3 = LocalDate.parse(dateStr3, formatter3);

            DateTimeFormatter outputFormatter1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
            DateTimeFormatter outputFormatter2 = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
            DateTimeFormatter outputFormatter3 = DateTimeFormatter.ofPattern("yyyy-dd-MMM");
            DateTimeFormatter outputFormatter4 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");

            System.out.println("Formatted date1: ");
            System.out.println(date1.format(outputFormatter1));
            System.out.println(date1.format(outputFormatter2));
            System.out.println(date1.format(outputFormatter3));
            System.out.println(date1.format(outputFormatter4));

            System.out.println("Formatted date2: ");
            System.out.println(date2.format(outputFormatter1));
            System.out.println(date2.format(outputFormatter2));
            System.out.println(date2.format(outputFormatter3));
            System.out.println(date2.format(outputFormatter4));

            System.out.println("Formatted date3: ");
            System.out.println(date3.format(outputFormatter1));
            System.out.println(date3.format(outputFormatter2));
            System.out.println(date3.format(outputFormatter3));
            System.out.println(date3.format(outputFormatter4));

            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter unusualFormatter = DateTimeFormatter.ofPattern("EEEE, dd'th' MMMM yyyy 'at' hh:mm a");
            System.out.println("Current date and time: " + now.format(unusualFormatter));

        } catch (DateTimeParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }
    }
}