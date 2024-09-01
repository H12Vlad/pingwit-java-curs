package com.pingwit.part_24.homework.task_2;

import java.util.function.Function;
public class ConvertingNumberToString {
    public static void main(String[] args) {
        Function<Integer, String> convert = (number) -> {
            String rubles;
            if (number % 10 == 1 && number % 100 != 11) {
                rubles = "рубль";
            } else if (number % 10 >= 2 && number % 10 <= 4 && (number % 100 < 10 || number % 100 >= 20)) {
                rubles = "рубля";
            } else {
                rubles = "рублей";
            }
            return number + " " + rubles;
        };
        System.out.println(convert.apply(5));
    }
}