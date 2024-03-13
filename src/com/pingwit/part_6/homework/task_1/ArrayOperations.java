package com.pingwit.part_6.homework.task_1;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[3];

        for (int i = 0; i < array.length; i++) { // Я думаю тебе можно начать пользоваться Random random = new Random -> random.nextInt()
            System.out.print("Введите элемент массива #" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        int min = array[0];
        int max = array[0];

        for (int num : array) {
            sum += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Наименьшее число: " + min);
        System.out.println("Наибольшее число: " + max);

        scanner.close(); // в случае со Scanner это делать не обязательно
    }
}
