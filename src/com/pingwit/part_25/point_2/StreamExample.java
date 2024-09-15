package com.pingwit.part_25.point_2;

import java.util.List;
import java.util.stream.Stream;
@SuppressWarnings("SpellCheckingInspection")
public class StreamExample {
    public static void main(String[] args) {
 /*
        Collections Stream:
        1. Появились в Java 8
        2. Не изменяют входящую коллекцию
        3. Терминальнеы и промежуточные операции
           Промежуточные - все что возвращает Stream<>
        4. Промежуточные операции ленивые
        5. Нельзя использовать стрим, после терминальной операции
         */
        List<Integer> integers = List.of(1, 2, 3);

        Stream<Integer> stream = integers.stream();

        stream.forEach(System.out::println);

        long resultCount = stream.count();
    }
}
