package com.pingwit.part_5.homework.task_3;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        while (true) {
            System.out.print("Введите размер бабочки (нечетное число) или 0 для выхода: ");
            size = scanner.nextInt();
            if (size == 0) {
                System.out.println("Работа программы завершена.");
                break;
            }
            if (size % 2 == 0) {
                System.out.println("Размер должен быть нечетным!");
            } else {
                drawButterfly(size);
            }
        }

        scanner.close();
    }

    public static void drawButterfly(int size) {
        int halfSize = size / 2;
        int leftBorder = 1;
        int rightBorder = size * 2 - 1;


        for (int i = 0; i < size; i++) {
            int printer = 1;
            for (int j = 0; j < size * 2; j++) {
                if (j < leftBorder) {
                    System.out.print(printer);
                    printer++;
                } else if (j < rightBorder) {
                    System.out.print(" ");
                } else {
                    printer--;
                    System.out.print(printer);
                }
            }
            leftBorder++;
            rightBorder--;
            System.out.println();
            if (size % 2 == 0) { // а зачем тебе в этом методе эта проверка? у тебя такая же в 18 строке
                System.out.println("Размер должен быть нечетным!");
// лишняя строка
            }
        }
        for (int i = 0; i < size; i++) {
            int printer = 1;
            for (int j = 0; j < size * 2; j++) {
                if (j < leftBorder - 2) {
                    System.out.print(printer);
                    printer++;
                } else if (j < rightBorder + 2) {
                    System.out.print(" ");
                } else {
                    printer--;
                    System.out.print(printer);
                }
            }
            leftBorder--;
            rightBorder++;
            System.out.println();
            if (size % 2 == 0) { // а зачем тебе в этом методе эта проверка? у тебя такая же в 18 строке
                System.out.println("Размер должен быть нечетным!");
            }
// лишняя строка
        }
    }
}

