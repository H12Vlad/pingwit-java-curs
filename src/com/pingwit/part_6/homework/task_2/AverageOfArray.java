package com.pingwit.part_6.homework.task_2;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int num : array) {
            sum += num;
        }

        double average = (double) sum / array.length; // чтобы не кастить можно изначально использовать массив double[], но пока не критично

        System.out.println("Среднее арифметическое элементов массива: " + average);
    }
}
