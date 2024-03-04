package com.pingwit.part_4.homework.task_3;

public class Calculation {
    public static void main(String[] args) {
        int c = 1; // придумай для 'c' понятное название переменной 
        for (int i = 1; i <= 256; i *= 2) { // для 'i' название можно не менять, т.к. это стандартное название для счетчика цикла
            c += i;
        }
        System.out.println("Сумма: " + c);
    }
}
