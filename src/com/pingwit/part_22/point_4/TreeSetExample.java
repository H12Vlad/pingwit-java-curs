package com.pingwit.part_22.point_4;
import com.sun.source.tree.Tree;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);

        System.out.println(numbers);

        Set<Piano> pianos = new TreeSet<>();
        pianos.add(new Piano("YAMAHA", "black", true));
    }
}
