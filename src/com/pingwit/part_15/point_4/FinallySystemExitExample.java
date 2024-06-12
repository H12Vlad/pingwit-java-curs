package com.pingwit.part_15.point_4;

public class FinallySystemExitExample {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Ooops");
        } catch (RuntimeException e) {
            System.out.println("Hello from catch");
            System.exit(1);
        } finally {
            System.out.println("Hello from finally");
        }

        System.out.println("Happy end");
    }
}
