package com.pingwit.part_4.homework.task_4;

public class CalculationWithoutMultiplication {
    public static void main(String[] args) {
        int a = -1; // подставь а = -1 и b = -1, и посмотри результат. С этой задачей должен справиться сам, дебаг тебе в помощь :)
        int b = -1;
        int result = multiply(a, b);
        System.out.println("Произведение чисел " + a + " и " + b + " равно " + result);
    }

    public static int multiply(int a, int b) {
        if (a == -1 && b == -1) {
            return 1;
        }
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


