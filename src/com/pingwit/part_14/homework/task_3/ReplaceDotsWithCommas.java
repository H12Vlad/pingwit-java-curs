package com.pingwit.part_14.homework.task_3;

public class ReplaceDotsWithCommas {
    public static void main(String[] args) {
        String str = "Green. red. blue. yellow"; // str -> text, defaultText
        String modifiedStr = str.replace('.', ','); // str - старайся не делать таких сокращений

        System.out.println("Исходная строка: " + str);
        System.out.println("Модифицированная строка: " + modifiedStr);
    }
}