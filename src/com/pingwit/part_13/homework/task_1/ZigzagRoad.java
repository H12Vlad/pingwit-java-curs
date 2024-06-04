package com.pingwit.part_13.homework.task_1;

public class ZigzagRoad {
    public static void main(String[] args) {
        int tab = 10;
        String road = "|| | ||";
        String emptyString = " ";
        int counter = 100;
        Boolean increment = false;
        int right = 0;
        int left = 10;

        while (counter > 0) {
            for (int i = 0; i < tab + 10; i++) {
                System.out.print(emptyString);
            }

            System.out.println(road);
            counter--;
            if (increment) {
                tab++;
            } else {
                tab--;
            }

            if (tab == right) {
                increment = true;
            }

            if (tab == left) {
                increment = false;
            }
        }
        System.out.println(tab);
    }
}