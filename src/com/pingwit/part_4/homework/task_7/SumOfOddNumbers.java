package com.pingwit.part_4.homework.task_7;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Сумма всех нечетных чисел от 1 до 99: " + sum);
    }
}
