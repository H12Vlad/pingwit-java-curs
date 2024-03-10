package com.pingwit.part_6;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 100;

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("-------");

        Integer[] initArray = {9,8,7,6,5};
        for (int i = 0; i < initArray.length; i++) {
            System.out.println(initArray[i]);
        }

        System.out.println("-----------");

        System.out.println(Arrays.toString(initArray));

        System.out.println("----------");

        initArray = new Integer[]{0, 1};
        initArray[0] = 33;
        System.out.println(Arrays.toString(initArray));
    }
}
