package com.pingwit.part_6.homework.task_6;

import java.util.Arrays;

public class EvenNumbersArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evenNumbersArray = getEvenNumbersArray(originalArray);

        System.out.println("Массив с четными элементами: " + Arrays.toString(evenNumbersArray));
    }

    public static int[] getEvenNumbersArray(int[] originalArray) { // очень хорошо
        int count = 0;

        for (int num : originalArray) {
            if (num % 2 == 0) {
                count++;
            }
        }

        int[] evenNumbersArray = new int[count];
        int index = 0;

        for (int num : originalArray) {
            if (num % 2 == 0) {
                evenNumbersArray[index] = num;
                index++;
            }
        }
        return evenNumbersArray;
    }
}
