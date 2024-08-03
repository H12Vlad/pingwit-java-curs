package com.pingwit.part_21.homework.task_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BenchmarkArrayListAndLinkedList {
    public static void main(String[] args) {
        int numElements = 100000;

        List<Integer> arrayList = new ArrayList<>(numElements);
        for (int i = 0; i < numElements; i++) {
            arrayList.add(i);
        }

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < numElements; i++) {
            linkedList.add(i);
        }

        long startTime = System.nanoTime();
        while (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() / 2);
        }
        long endTime = System.nanoTime();
        long arrayListDuration = endTime - startTime;

        startTime = System.nanoTime();
        while (!linkedList.isEmpty()) {
            linkedList.remove(linkedList.size() / 2);
        }
        endTime = System.nanoTime();
        long linkedListDuration = endTime - startTime;

        System.out.println("Время удаления всех элементов из середины ArrayList: " + arrayListDuration / 1_000_000 + " ms");
        System.out.println("Время удаления всех элементов из середины LinkedList: " + linkedListDuration / 1_000_000 + " ms");
    }
}