package com.pingwit.part_4.homework.task_3;

public class Calculation {
    public static void main(String[] args) {
        int c = 1;
        for (int i = 1; i <= 256; i *= 2) {
            c += i;
        }
        System.out.println("Сумма: " + c);
    }
}
