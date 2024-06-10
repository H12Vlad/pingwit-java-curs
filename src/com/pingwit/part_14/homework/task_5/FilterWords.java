package com.pingwit.part_14.homework.task_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterWords {
    public static void main(String[] args) {
        String[] words = {"While", "Window", "Winter", "Water", "World", "Weather", "Wednesday", "Wonderful", "Worth", "Welcome",
                "major", "gameplay", "components", "are", "already", "in", "place", "and", "functioning",
                "players", "help", "water", "wild", "weather", "wool", "worry"};

        List<String> filteredWords = Arrays.stream(words)
                .filter(word -> word.startsWith("W") || word.startsWith("w"))
                .collect(Collectors.toList());

        System.out.println("Отфильтрованные слова: " + filteredWords);
    }
}