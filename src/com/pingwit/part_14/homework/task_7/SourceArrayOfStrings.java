package com.pingwit.part_14.homework.task_7;

public class SourceArrayOfStrings {
    public static void main(String[] args) {
        String[] strings = {"Ford", "Fiat", "Volvo", "Tesla", "Toyota", "Lamborghini", "Volkswagen"};
        System.out.println("Строки длиной больше 5 символов:");

        int characters = 5; // characters - это символы, у тебя переменная хранит maxAllowedLength, лучше переименовать

        for (String str : strings) {
            if (str.length() > characters) {
                System.out.println(str);
            }
        }
    }
}