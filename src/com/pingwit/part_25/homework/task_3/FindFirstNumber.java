package com.pingwit.part_25.homework.task_3;

import java.util.List;
import java.util.Optional;

public class FindFirstNumber {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 15, 20, 25, 30, 22, 18);

        Optional<Integer> result = numbers.stream()
                .filter(num -> num > 22)
                .findFirst();

        System.out.println(result);

        /*
        твой вариант ок, ниже вариант тебе на будущее :)

        numbers.stream()
                .filter(num -> num > 22)
                .findFirst()
                .ifPresent(System.out::println);  System.out::println это сокращенная форма от num -> System.out.println(num)

         */
    }
}