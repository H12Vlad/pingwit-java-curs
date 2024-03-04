package com.pingwit.part_4.homework.task_6;

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Четные числа от 2 до 100:"); // Ты скорее всего знаешь что такое конкатенация строк, значит, можно 2 и 100 вынести в отдельную переменную и менять значение в одном месте.
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}
