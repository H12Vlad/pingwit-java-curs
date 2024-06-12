package com.pingwit.part_15.point_4;

public class ToyotaExample {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();

        try {
            toyota.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
