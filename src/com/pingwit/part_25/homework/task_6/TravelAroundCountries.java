package com.pingwit.part_25.homework.task_6;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TravelAroundCountries {
    public static void main(String[] args) {
        List<Traveler> travelers = new ArrayList<>();
        travelers.add(new Traveler("Vlad", List.of(
                new Country("Poland", List.of("Wroclaw", "Krakow", "Bielsko-Biala")),
                new Country("Germany", List.of("Berlin", "Frankfurt", "Hanover"))
        )));
        travelers.add(new Traveler("Samir", List.of(
                new Country("USA", List.of("Chicago", "Texas", "New York")),
                new Country("France", List.of("Paris", "Marseille", "Nice"))
        )));
        travelers.add(new Traveler("Anatolii", List.of(
                new Country("Ukraine", List.of("Vinnytsia", "Dnipro", "Uzhhorod"))
        )));
        travelers.add(new Traveler("Anna", List.of(
                new Country("Poland", List.of("Warsaw", "Katowice", "Wisla"))
        )));

        Path filePath = Paths.get("src/com/pingwit/part_25/homework/task_6/unique_cities.txt");

        try {
            // старайся не делать таких сложных конструкций, вынеси получение списка городов в отдельную переменную
            Files.write(filePath, travelers.stream()
                    .map(traveler -> traveler.name() + ": " +
                            traveler.countries().stream()
                                    .flatMap(country -> country.cities().stream())
                                    .collect(Collectors.toSet())
                                    .stream()
                                    .collect(Collectors.joining(", "))
                    )
                    .toList());

            System.out.println("Unique cities added to: " + filePath.toAbsolutePath());
        } catch (Exception e) { // если оставляешь блок catch совсем пустым, то просто пробрасывай исключение наверх, не используя try-catch
        }
    }
}