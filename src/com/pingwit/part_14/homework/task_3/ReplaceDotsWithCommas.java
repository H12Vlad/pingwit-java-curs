package com.pingwit.part_14.homework.task_3;

public class ReplaceDotsWithCommas {
    public static void main(String[] args) {
        String str = "Green. red. blue. yellow";
        String modifiedStr = str.replace('.', ',');

        System.out.println("Исходная строка: " + str);
        System.out.println("Модифицированная строка: " + modifiedStr);
    }
}