package com.pingwit.part_25.homework.task_1;

import java.util.List;
import java.util.stream.Collectors;

public class CollectionStrings {
    public static void main(String[] args) {
        List<String> words = List.of("bacon", "salami", "blackberry", "strawberry", "fig", "lime", "pear", "peas");

        List<String> collect = words.stream()
                .filter(shor -> shor.length() >= 5)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}