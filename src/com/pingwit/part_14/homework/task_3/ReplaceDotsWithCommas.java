package com.pingwit.part_14.homework.task_3;

public class ReplaceDotsWithCommas {
    public static void main(String[] args) {
        String defaultText = "Green. red. blue. yellow";
        String modifiedStr = defaultText.replace('.', ',');

        System.out.println("Исходная строка: " + defaultText);
        System.out.println("Модифицированная строка: " + modifiedStr);
    }
}