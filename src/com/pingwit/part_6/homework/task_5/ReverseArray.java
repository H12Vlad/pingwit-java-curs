package com.pingwit.part_6.homework.task_5;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4};


        int leftBorder = 0;
        int rightBorder = array.length - 1;

        while (leftBorder < rightBorder) {
            int temp = array[leftBorder];
            array[leftBorder] = array[rightBorder];
            array[rightBorder] = temp;


            leftBorder++;
            rightBorder--;

        }

        System.out.print("Массив после инвертирования: ");

       System.out.println(Arrays.toString(array));

        }
    }

