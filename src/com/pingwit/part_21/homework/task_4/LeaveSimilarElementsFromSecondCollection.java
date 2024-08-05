package com.pingwit.part_21.homework.task_4;

import java.util.ArrayList;
import java.util.List;

public class LeaveSimilarElementsFromSecondCollection {
    public static void main(String[] args) {
        List<String> collections1 = new ArrayList<>();// collections1 -> teamAlfa
        collections1.add("Merry");
        collections1.add("Joi");
        collections1.add("Dev");
        collections1.add("Ola");
        collections1.add("Rick");

        List<String> collections2 = new ArrayList<>();// collections2 -> teamBeta, лучше что-то такое чем collections_2/3...
        collections2.add("Merry");
        collections2.add("Bin");
        collections2.add("Dev");
        collections2.add("Anna");
        collections2.add("Rick");

        System.out.println("Первая коллекция до удаления элементов:");
        System.out.println(collections1);

        collections1.retainAll(collections2);

        System.out.println("Первая коллекция после удаления элементов:");
        System.out.println(collections1);
    }
}