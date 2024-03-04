package com.pingwit.part_4.homework.task_2;

public class Amoeba {
    public static void main(String[] args) {
        int amoeba = 1;
        for (int hour = 3; hour <= 24; hour += 3) {
            amoeba *= 2;
            System.out.println("Через " + hour + " часа(ов) будет " + amoeba + " амёб(ы))");
        }
    }
}
