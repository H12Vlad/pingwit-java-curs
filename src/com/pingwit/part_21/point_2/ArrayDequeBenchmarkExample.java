package com.pingwit.part_21.point_2;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
public class ArrayDequeBenchmarkExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        int count = 10;

        long startArrayDeque = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            arrayDeque.add(i);
        }

        long finishArrayDeque = System.currentTimeMillis();
        System.out.println("ArrayDeque add: " + (finishArrayDeque - startArrayDeque));


        List<Integer> arrayList = new ArrayList<>();
        long startArrayList = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            arrayList.add(i);
        }

        long finishArrayList = System.currentTimeMillis();
        System.out.println("ArrayList add: " + (finishArrayList - startArrayList));


//        long startRemoveArrayDeque = System.currentTimeMillis();
//        for (int i = 0; i < count; i++) {
//            arrayDeque.removeFirst();
//        }
//        long finishRemoveArrayDeque =  System.currentTimeMillis();
//        System.out.println("ArrayDeque removeFirst: " + (finishRemoveArrayDeque - startRemoveArrayDeque));


        long startRemoveArrayList = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            arrayList.remove(0);
        }
        long finishRemoveArrayList =  System.currentTimeMillis();
        System.out.println("ArrayList remove: " + (finishRemoveArrayList - startRemoveArrayList));


        System.out.println(arrayDeque);
        arrayDeque.removeFirst();
        arrayDeque.remove(Integer.valueOf(3));
        System.out.println(arrayDeque);
    }
}
