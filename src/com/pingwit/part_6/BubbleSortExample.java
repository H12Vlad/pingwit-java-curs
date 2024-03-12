package com.pingwit.part_6;

import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] numbers = {7,5,9,0,1,55,66};

        int counter = 0;
        int swapCounter = 0;

        boolean needToSort;

        for (int i = 1; i < numbers.length; i++) {
            needToSort =false;
            for (int j = 1; j < numbers.length - (i - 1); j++) {
                int current = numbers[j];
                int previous = numbers[j - 1];

                if (previous > current){
                    numbers[j] = previous;
                    numbers[j - 1] = current;
                    swapCounter++;
                    needToSort = true;
                }
                counter++;
            }

            if (!needToSort){
                break;
            }
        }
        System.out.println("Counter = " + counter);
        System.out.println("SwapCounter = " + swapCounter);
        System.out.println(Arrays.toString(numbers));
    }
}
