package com.pingwit.part_20.point_5;

public class CommonDeveloperExample {
    public static void main(String[] args) {
        JuniorDeveloper<String> junior = new JuniorDeveloper<>();
        String id = junior.getId();

        MiddleDeveloper<String, Integer> middle = new MiddleDeveloper<>();
        Long id1 = middle.getId();
    }
}
