package com.pingwit.part_13.homework.task_1;

public class ZigzagRoad {
    public static void main(String[] args) {
        int tab = 10;
        String road = "|| | ||";
        String emptyString = " ";
        int counter = 100;
        Boolean increment = false;
        int right = 10;
        int left = 0; // попробуй сделать так, чтобы переменная left контролировала расстояние дороги от левого края, т.е. если left = 10, то дорога печатается ближе к центру экрана
        int smallerNumber = 0;
        while (counter > smallerNumber) { // в данном случае можно оставить while (counter > 0)
            for (int i = 0; i < tab; i++) {
                System.out.print(emptyString);
            } // для лучшей читаемости здесь можно добавить абзац
            System.out.println(road);
            counter--;
            if (increment) {
                tab++;
            } else {
                tab--;
            }// для лучшей читаемости здесь можно добавить абзац
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