package com.pingwit.part_10.point_2;

public class AbstractClassExample {
    public static void main(String[] args) {
        Furniture furniture = new Chair("white", "wood", true);
        System.out.println(furniture.model());

        System.out.println("-------");
        Furniture babyChair = new BabyChair(null, null, false);

    }
}
