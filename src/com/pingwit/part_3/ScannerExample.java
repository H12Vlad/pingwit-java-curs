package com.pingwit.part_3;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your name:");
        String name = scanner.next();

        System.out.println("How old r u?");
        int are = scanner.nextInt();

        System.out.println("Your name: " + name);
        System.out.println("Your are: " + are);
    }
}
