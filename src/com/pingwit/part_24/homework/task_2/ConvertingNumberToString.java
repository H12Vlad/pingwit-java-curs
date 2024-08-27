package com.pingwit.part_24.homework.task_2;

import java.util.function.Function;

public class ConvertingNumberToString {
    public static void main(String[] args) {
        Function<Integer, String> convert = (number) -> number + "zł.";
        System.out.println(convert.apply(5));
    }
}