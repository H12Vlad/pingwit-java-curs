package com.pingwit.part_25.homework.task_6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TravelAroundCountries {
    public static void main(String[] args) throws IOException {
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

        List<String> uniqueCitiesPerTraveler = travelers.stream()
                .map(traveler -> {
                    String cities = traveler.countries().stream()
                            .flatMap(country -> country.cities().stream())
                            .collect(Collectors.toSet())
                            .stream()
                            .collect(Collectors.joining(", "));
                    return traveler.name() + ": " + cities;
                })
                .toList();

        Files.write(filePath, uniqueCitiesPerTraveler);

        System.out.println("Unique cities added to: " + filePath.toAbsolutePath());
    }
}