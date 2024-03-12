package com.pingwit.part_6.homework.task_3;

public class ReplaceOddElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
        }

        System.out.print("Массив после замены: ");

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
