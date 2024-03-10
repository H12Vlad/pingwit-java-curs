package com.pingwit.part_4.homework.task_8;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;
        int totalSum = 0;

        for (int i = 0; i <= 100; i++) {
// эту строку можно убрать
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
// эту строку лучше убрать
        }

        totalSum = sumEven + sumOdd;

        System.out.println("Сумма четных чисел: " + sumEven);
// эту строку можно убрать
        System.out.println("Сумма нечетных чисел: " + sumOdd);
// эту строку можно убрать
        System.out.println("Общая сумма всех чисел: " + totalSum);
    }
}
