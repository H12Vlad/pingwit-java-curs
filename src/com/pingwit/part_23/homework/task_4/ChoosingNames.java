package com.pingwit.part_23.homework.task_4;

import java.util.TreeSet;
import java.util.regex.Pattern;

public class ChoosingNames {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Edward");
        names.add("Frank");
        names.add("George");
        names.add("Hannah");
        names.add("Irene");
        names.add("John");
        names.add("Kevin");
        names.add("Laura");
        names.add("Michael");
        names.add("Nancy");
        names.add("Oscar");
        names.add("Paul");
        names.add("Quincy");
        names.add("Rachel");
        names.add("Sam");
        names.add("Thomas");
        names.add("Ursula");
        names.add("Victor");
        names.add("Wendy");
        names.add("Xavier");
        // Создаем регулярное выражение для имен от "H" до "W"
        Pattern pattern = Pattern.compile("^[H-W].*");
        // Фильтрация и вывод имен
        System.out.println("Имена от 'H' до 'W':");
        for (String name : names) {
            if (pattern.matcher(name).matches()) {
                System.out.println(name);
            }
        }
    }
}