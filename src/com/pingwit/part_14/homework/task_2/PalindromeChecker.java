package com.pingwit.part_14.homework.task_2;

public class PalindromeChecker {
    public static void main(String[] args) {
        String word1 = "radar";
        String word2 = "engineering";

        System.out.println("Слово '" + word1 + "' является палиндромом: " + isPalindrome(word1));
        System.out.println("Слово '" + word2 + "' является палиндромом: " + isPalindrome(word2));
    }

    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();

        int length = cleanedStr.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedStr.charAt(i) != cleanedStr.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}