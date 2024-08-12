package com.pingwit.part_22.point_3;
import java.util.Map;
import java.util.TreeMap;
public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> students = new TreeMap<>();

        students.put(3, "A");
        students.put(0, "B");
        students.put(1, "C");

        System.out.println(students);

//        students.put(null, "D");

        Map<String, Integer> apples = new TreeMap<>();

        apples.put("AA", 33);
        apples.put("a", 44);
        apples.put("AB", 44);
        apples.put("ABB", 44);
        apples.put("AC", 44);
        apples.put("!", 44);
        apples.put("?", 44);
        apples.put("1AA", 33);
        apples.put("0AA", 33);
        apples.put("AA1", 33);
        apples.put("AA0", 33);
        apples.put(".", 33);

        System.out.println(apples);

    }
}
