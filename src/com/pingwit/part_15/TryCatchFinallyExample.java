package com.pingwit.part_15;

import java.util.Scanner;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Please enter the number:");
                Scanner scanner = new Scanner(System.in);
                String text = scanner.next();
                Integer number = Integer.valueOf(text);
                System.out.println(number);
                break;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Hello from Exception catch");
//                return;
            } finally {
                System.out.println("Block finally");
                break;
            }
        }

        System.out.println("After all");

        // try-catch +
        // try-finally +
        // try
    }
}