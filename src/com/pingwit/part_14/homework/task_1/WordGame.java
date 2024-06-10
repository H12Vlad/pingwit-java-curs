package com.pingwit.part_14.homework.task_1;

public class WordGame {
    public static void main(String[] args) {
        String word = "engineering";
        String word1 = word.substring(0, 6);
        String word2 = word.substring(7);
        System.out.println("Первое слово: " + word1);
        System.out.println("Второе слово: " + word2);
    }
}