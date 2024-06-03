package com.pingwit.part_13.homework.task_1;

public class ZigzagRoad {
    public static void main(String[] args) {
        int tab = 10;
        String road = "|| | ||";
        String emptyString = " ";
        int counter = 100;
        Boolean increment = false;
        int right = 10;
        int left = 0;
        int smallerNumber = 0;
        while (counter > smallerNumber) {
            for (int i = 0; i < tab; i++) {
                System.out.print(emptyString);
            }
            System.out.println(road);
            counter--;
            if (increment) {
                tab++;
            } else {
                tab--;
            }
            if (tab == left) {
                increment = true;
            }
            if (tab == right) {
                increment = false;
            }
        }
        System.out.println(tab);
    }
}