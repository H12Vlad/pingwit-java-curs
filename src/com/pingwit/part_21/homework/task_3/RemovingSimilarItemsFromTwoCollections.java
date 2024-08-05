package com.pingwit.part_21.homework.task_3;

import java.util.ArrayList;
import java.util.List;

public class RemovingSimilarItemsFromTwoCollections {
    public static void main(String[] args) {
        List<String> collections1 = new ArrayList<>(); // collections1 -> names
        collections1.add("Merry");
        collections1.add("Joi");
        collections1.add("Dev");
        collections1.add("Ola");
        collections1.add("Rick");

        List<String> collections2 = new ArrayList<>(); // collections2 -> namesToRemove
        collections2.add("Merry");
        collections2.add("Bin");
        collections2.add("Dev");
        collections2.add("Anna");
        collections2.add("Rick");

        System.out.println("Первая коллекция до удаления элементов:");
        System.out.println(collections1);

        collections1.removeAll(collections2);

        System.out.println("Первая коллекция после удаления элементов:");
        System.out.println(collections1);
    }
}