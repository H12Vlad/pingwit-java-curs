package com.pingwit.part_5.task_3;
import java.util.Scanner;
public class Butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер бабочки (нечетное число): ");
        int size = scanner.nextInt();
        scanner.close();

        if (size % 2 == 0) {
            System.out.println("Размер должен быть нечетным!");
            return;
        }

        drawButterfly(size);
    }

    public static void drawButterfly(int size) {
        int halfSize = size / 2;
        for (int i = 0; i < halfSize; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < size - 2 * (i + 1); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = halfSize; i >= 0; i--) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < size - 2 * (i + 1); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
