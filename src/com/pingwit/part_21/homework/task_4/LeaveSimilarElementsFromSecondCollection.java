package com.pingwit.part_21.homework.task_4;

import java.util.ArrayList;
import java.util.List;

public class LeaveSimilarElementsFromSecondCollection {
    public static void main(String[] args) {
        List<String> teamAlfa = new ArrayList<>();
        teamAlfa.add("Merry");
        teamAlfa.add("Joi");
        teamAlfa.add("Dev");
        teamAlfa.add("Ola");
        teamAlfa.add("Rick");

        List<String> teamBeta = new ArrayList<>();
        teamBeta.add("Merry");
        teamBeta.add("Bin");
        teamBeta.add("Dev");
        teamBeta.add("Anna");
        teamBeta.add("Rick");

        System.out.println("Первая коллекция до удаления элементов:");
        System.out.println(teamAlfa);

        teamAlfa.retainAll(teamBeta);

        System.out.println("Первая коллекция после удаления элементов:");
        System.out.println(teamAlfa);
    }
}