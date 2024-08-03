package com.pingwit.part_21.point_2;
import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(77);
        arrayList.ensureCapacity(20);

        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        arrayList.add(0, 66);
        arrayList.set(11, 55);

        System.out.println(arrayList);
        System.out.println(arrayList.size());

        arrayList.remove(arrayList.size() - 1);
        arrayList.remove(Integer.valueOf(77));
        boolean removeResult = arrayList.remove(Integer.valueOf(100));
        System.out.println(removeResult);

        System.out.println(arrayList);

        arrayList.ensureCapacity(100);
        System.out.println("Size before trim = " + arrayList.size());
        arrayList.trimToSize();
        arrayList.ensureCapacity(100);

        List<Integer> list = List.of(1, 2, 3, 44, 55);
//        list.set(0, 55);
        System.out.println(list);

        System.out.println(arrayList);
        arrayList.retainAll(list);
        System.out.println(arrayList);
    }

    private static void print(List<Integer> input) {
    }
}