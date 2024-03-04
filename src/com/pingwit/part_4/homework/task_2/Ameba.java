package com.pingwit.part_4.homework.task_2;

public class Ameba { // Ameba -> Amoeba, у тебя опечатка в названии класса
    public static void main(String[] args) {
        int a = 1; // придумай для 'a' понятное название переменной
        for (int h = 3; h <= 24; h += 3) { // h -> hour
            a *= 2;
            System.out.println("Через " + h + " часа(ов) будет " + a + " амёб(ы)");
        }
    }
}
