package com.pingwit.part_15.point_4;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            printMessage("Hello");
        } catch (Exception e) {
            throw new RuntimeException("Ooops");
        }
    }

    public static void printMessage(String message) throws Exception {
        throw new Exception("Something goes wrong:" + message);
    }
}
