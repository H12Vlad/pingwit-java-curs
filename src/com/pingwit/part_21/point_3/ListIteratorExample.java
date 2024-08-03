package com.pingwit.part_21.point_3;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListIteratorExample {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(0);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);

        ListIterator<Integer> iterator = numbers.listIterator();

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.add(77);
            }
        }

        System.out.println(numbers);
    }
}