package com.pingwit.part_14.homework.task_1;

public class WordGame {
    public static void main(String[] args) {
        String word = "engineering";
        String engine = word.substring(0, 6);
        String ring = word.substring(7);
        System.out.println("Первое слово: " + engine);
        System.out.println("Второе слово: " + ring);
    }
}