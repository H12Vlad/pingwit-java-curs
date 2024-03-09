package com.pingwit.part_4.homework.task_9;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 9;

        drawRhombus(size);
    }

    public static void drawRhombus(int size) {
        int halfSize = size / 2;

        for (int i = 0; i < size; i++) {
            int currentRow = (i < halfSize) ? i : size - 1 - i;
            for (int j = 0; j < size * 2; j++) {
                if (j <= halfSize + currentRow && j >= halfSize - currentRow) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
