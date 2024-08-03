package com.pingwit.part_21.point_2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.addLast(2);
        list.addFirst(0);

        System.out.println(list);

        System.out.println(list.peek());
        System.out.println(list);
        System.out.println(list.poll());
        System.out.println(list);

        System.out.println(list.pollLast());
        System.out.println(list);

        System.out.println(list.pollLast());
        System.out.println(list.pollLast());
        System.out.println(list.peekLast());
        System.out.println(list.peek());

        System.out.println(list.element());
    }
}