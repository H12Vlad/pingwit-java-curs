package com.pingwit.part_21.homework.task_3;

import java.util.ArrayList;
import java.util.List;

public class RemovingSimilarItemsFromTwoCollections {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Merry");
        names.add("Joi");
        names.add("Dev");
        names.add("Ola");
        names.add("Rick");

        List<String> namesToRemove = new ArrayList<>();
        namesToRemove.add("Merry");
        namesToRemove.add("Bin");
        namesToRemove.add("Dev");
        namesToRemove.add("Anna");
        namesToRemove.add("Rick");

        System.out.println("Первая коллекция до удаления элементов:");
        System.out.println(names);

        names.removeAll(namesToRemove);

        System.out.println("Первая коллекция после удаления элементов:");
        System.out.println(names);
    }
}