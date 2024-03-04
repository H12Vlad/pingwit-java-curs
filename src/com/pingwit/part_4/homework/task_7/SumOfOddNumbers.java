package com.pingwit.part_4.homework.task_7;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 99; i += 2) { // можно оставить +2, но более грамотным решением будет через % 2 == 0 решать, предыдущую задачу тоже
            sum += i;
        }
        System.out.println("Сумма всех нечетных чисел от 1 до 99: " + sum);
    }
}
