package com.pingwit.part_24.point_1;

public class FuncInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface printer = (String message) -> {
            System.out.println(message);
        };

        printer.print("Hello from lambda");

        System.out.println("After the lambda");

        MyPredicate comparingPredicate = (num1, num2) -> num1 < num2;

        System.out.println(comparingPredicate.test(1, 2));
        System.out.println(comparingPredicate.test(30, 10));
    }
}
