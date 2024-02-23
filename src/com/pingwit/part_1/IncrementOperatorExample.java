package com.pingwit.part_1;

public class IncrementOperatorExample {
    public static void main(String[] args) {
        int x = 0;
        x = x +1;

       x++;
        System.out.println(x);

        ++x;
        System.out.println(x);

        System.out.println("===");
        System.out.println(x++);
        System.out.println(x);
    }
}
