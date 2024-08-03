package com.pingwit.part_21.point_3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
//        for (int i = 0; i < 22; i++) {
//            numbers.add(i);
//        }

        numbers.add(2);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println(numbers);
    }
}
