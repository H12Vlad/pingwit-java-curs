package com.pingwit.part_23.homework.task_1;

import java.util.Comparator;
import java.util.TreeSet;

public class SortReverse {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());

        treeSet.add(22);
        treeSet.add(233);
        treeSet.add(123);
        treeSet.add(01);
        treeSet.add(2);
        treeSet.add(25);
        treeSet.add(52);
        treeSet.add(21);
        treeSet.add(23);

        System.out.println("TreeSet в обратном порядке: " + treeSet);
    }
}