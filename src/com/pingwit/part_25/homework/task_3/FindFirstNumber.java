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
    }
}