package com.pingwit.part_4;

public class ReturnExample {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            if (i % 2 != 0){
                return;
            }
            System.out.println(i);
        }
        System.out.println("Happy end");
    }
}
