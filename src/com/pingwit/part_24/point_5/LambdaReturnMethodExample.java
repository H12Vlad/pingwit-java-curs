package com.pingwit.part_24.point_5;

import java.util.function.BinaryOperator;

class LambdaReturnMethodExample {
    public static void main(String[] args) {
        Operation multiply = operationStrategy(Operator.MULTIPLY);
        Integer multiplyResult = multiply.process(2, 3);
        System.out.println(multiplyResult);

        Operation sum = operationStrategy(Operator.SUM);
        System.out.println(sum.process(multiplyResult, 3));

        Operation calculator = sum.andThen(multiply, 10)
                .andThen(operationStrategy(Operator.DIVIDE), 2)
                .andThen(operationStrategy(Operator.SUBTRACT), 1);

        System.out.println(calculator.process(3, 4));

        BinaryOperator<Integer> biFunctionMultiplier = operationStrategyBiFunction(Operator.MULTIPLY);
    }

    private static Operation operationStrategy(Operator operator) {
        return switch (operator) {
            case SUM -> (x, y) -> x + y;
            case SUBTRACT -> (x, y) -> x - y;
            case MULTIPLY -> (x, y) -> x * y;
            case DIVIDE -> (x, y) -> x / y;
            default -> throw new IllegalArgumentException("Unknown operator");
        };
    }

    private static BinaryOperator<Integer> operationStrategyBiFunction(Operator operator) {
        return switch (operator) {
            case SUM -> (x, y) -> x + y;
            case SUBTRACT -> (x, y) -> x - y;
            case MULTIPLY -> (x, y) -> x * y;
            case DIVIDE -> (x, y) -> x / y;
            default -> throw new IllegalArgumentException("Unknown operator");
        };
    }
}