package com.pingwit.part_22.point_2;
import java.util.HashMap;
import java.util.Map;
public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        System.out.println(students);
        students.put(1, "Egorka");
        students.put(2, "Egorka");
        System.out.println(students);
        students.put(1, "Olya");
        System.out.println(students);

        System.out.println(students.containsKey(1));
        System.out.println(students.containsKey(3));

        System.out.println("students.size()=" + students.size());

        System.out.println(students.get(1));
        System.out.println(students.get(33));
        System.out.println(students.getOrDefault(33, "Toyota"));
        System.out.println(students.getOrDefault(2, "Toyota"));

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        students.remove(1, "Egorka");
        System.out.println(students);

        students.replace(2, "Egorka", "Tesla");
        students.put(null, "A");
        System.out.println(students);
        System.out.println(students.get(null));
    }
}
