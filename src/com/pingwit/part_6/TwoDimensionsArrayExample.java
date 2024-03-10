package com.pingwit.part_6;

import java.util.Arrays;

public class TwoDimensionsArrayExample {
    public static void main(String[] args) {
        int[][] twoDimensionsArray = new int[5][4];

        System.out.println(Arrays.toString(twoDimensionsArray));

        for (int i = 0; i < twoDimensionsArray.length; i++) {
            System.out.println(Arrays.toString(twoDimensionsArray[i]));
        }

        twoDimensionsArray[1][2] = 33;
        System.out.println(twoDimensionsArray[1][2]);

        for (int i = 0; i < twoDimensionsArray.length; i++) {
            System.out.println(Arrays.toString(twoDimensionsArray[i]));
        }

        System.out.println("------------");

        int[][] initArray = {
                {22,33,44},
                {55},
                {66,77}
        };

        for (int i = 0; i < initArray.length; i++) {
            System.out.println(Arrays.toString(initArray[i]));

        }
    }
}
