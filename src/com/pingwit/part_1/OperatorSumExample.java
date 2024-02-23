package com.pingwit.part_1;

public class OperatorSumExample {
    public static void main(String[] args) {
        byte  num1 = 100;
        byte num2 = 100;

       byte sum = (byte) (num1 + num2);
        System.out.println(sum);

       short num3 = 100;
       short num4 = 100;

       int shortSum = num3 + num4;

       int num5 = 200;
       int num6 = 200;
       int intSum = num5 + num6;

       long longNum = 300;
       long longSum  = intSum + longNum;

       double doubleNum = 100;
       double doubleSum = longSum + doubleNum;
        System.out.println(doubleSum);

        long result = num5 - longNum;

    }
}
