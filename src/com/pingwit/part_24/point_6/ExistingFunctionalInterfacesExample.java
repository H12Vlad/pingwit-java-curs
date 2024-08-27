package com.pingwit.part_24.point_6;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("SpellCheckingInspection")
public class ExistingFunctionalInterfacesExample {
    public static void main(String[] args) {
     /*
        1. Predicate<T>
        Функциональный интерфейс Predicate<T> проверяет соблюдение некоторого условия. Если оно соблюдается, то возвращается значение true.
        В качестве параметра лямбда-выражение принимает объект типа T

        2. Consumer<T>
        Consumer<T> выполняет некоторое действие над объектом типа T, при этом ничего не возвращая

        3. Function<T,R>
        Функциональный интерфейс Function<T,R> представляет функцию перехода от объекта типа T к объекту типа R

        4. Supplier<T>
        Supplier<T> не принимает никаких аргументов, но должен возвращать объект типа T

        5. UnaryOperator<T>
        UnaryOperator<T> принимает в качестве параметра объект типа T, выполняет над ним операции и возвращает результат операций в виде объекта типа T

        6. BinaryOperator<T>
        BinaryOperator<T> принимает в качестве параметра два объекта типа T,
        выполняет над ними бинарную операцию и возвращает ее результат также в виде объекта типа T:
         */

        List<Integer> integers = new ArrayList<>(List.of(10, 20, 30));

        integers.forEach(System.out::println);

        integers.removeIf(x -> x < 20);
        System.out.println(integers);
    }
}