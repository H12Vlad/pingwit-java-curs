package com.pingwit.part_1;

public class typeCastingExample {
    public static void main(String[] args) {
        //повышение
        byte myByte = 127;
        int myInt = myByte;
        System.out.println(myInt);


        double myDouble = myInt;
        System.out.println(myDouble);

         //понижение
        int hiInt = 200;
        byte hiByte = (byte) hiInt;
        System.out.println(hiByte);

        double hiDouble = 100.9;
        hiInt = (int) hiDouble;
        System.out.println(hiInt);

    }
}
