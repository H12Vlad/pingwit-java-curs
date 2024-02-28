package com.pingwit.part_4.homework.task_1;

public class Distance {

        public static void main(String[] args) {
            double d = 10;
            for (int v = 1; v <= 7; v++) {
                d *= 1.1;
            }
            System.out.println("Суммарный путь спортсмена за 7 дней: " + d + " км");
        }
    }

