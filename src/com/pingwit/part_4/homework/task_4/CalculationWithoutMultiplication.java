package com.pingwit.part_4.homework.task_4;

public class CalculationWithoutMultiplication {
    public static void main(String[] args) {
        int A = 5;
        int B = 7;
        int result = multiply(A, B);
        System.out.println("Произведение чисел " + A + " и " + B + " равно " + result);
    }

    public static int multiply(int a, int b) {
        int result = 0;

        for (int i = 0; i < Math.abs(b); i++) {
            result += a;
        }
        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            result = -result;
        }
        return result;
    }
}


