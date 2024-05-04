package com.pingwit.part_9.homework.task_1;

import java.util.Arrays;

public class Warehouse {

    private int[] numbers;
   private int index = -1;

    public Warehouse(int[] numbers) {
        this.numbers = numbers;
    }

    public int next() {
        if (index == numbers.length - 1) {
            index = 0;
        } else {
            index++;
        }
        return numbers[index];
    }
    public int[] numbers() {
        int[] clone = new int[numbers.length];
        for (int i = 0; i < clone.length; i++) {
            clone[i] = numbers[i];
        }
        return clone;
    }

    public int[] getArray() {
        return Arrays.copyOf(numbers, numbers.length);
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "numbers = " + Arrays.toString(numbers) +
                ", index = " + index +
                '}';
    }
}