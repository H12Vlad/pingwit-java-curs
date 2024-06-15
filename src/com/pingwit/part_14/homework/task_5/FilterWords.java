package com.pingwit.part_14.homework.task_5;

public class FilterWords {
    public static void main(String[] args) {
        String[] words = {"While", "Window", "Winter", "Water", "World", "Weather", "Wednesday", "Wonderful", "Worth", "Welcome",
                "major", "gameplay", "components", "are", "already", "in", "place", "and", "functioning",
                "players", "help", "water", "wild", "weather", "wool", "worry"};

        int count = 0;
        for (String word : words) {
            // а давай выражение внутри if вынесем в отдельный приватный метод, который будет возвращать boolean и вызовем его еще в 21 строке
            if (word.startsWith("W") || word.startsWith("w")) {
                count++;
            }
        }

        String[] filteredWords = new String[count];

        int index = 0;

        for (String word : words) {
            if (word.startsWith("W") || word.startsWith("w")) {
                filteredWords[index] = word;
                index++;
            }
        }

        System.out.println("Отфильтрованные слова: " + String.join(", ", filteredWords));
    }
}