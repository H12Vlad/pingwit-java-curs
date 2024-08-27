package com.pingwit.part_24.homework.task_1;

import java.util.function.BinaryOperator;

public class LambdaExpression {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(3, 5));
    }
}