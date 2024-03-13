package com.pingwit.part_6.homework.task_8;

public class LongestSequence {
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0};

        int maxLength = 0;
        int startIndex = 0;
        int currentLength = 1;

        /*
        Возможно тебе больше понравится вариант с
        for (int i = 1; i <= array.length; i++) {
            if (i < array.length && array[i] == array[i - 1]) {

        тогда можно будет убрать if после цикла, потому что такое дублирование кода очень опасно, если необходимо будет делать правки   
        */
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    startIndex = i - maxLength;
                }
                currentLength = 1;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
            startIndex = array.length - maxLength;
        }

        System.out.println("Количество элементов самой длинной последовательности: " + maxLength);
        System.out.println("Номер элемента, с которого начинается самая длинная последовательность: " + startIndex);
    }
}
