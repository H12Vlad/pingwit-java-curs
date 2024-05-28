package com.pingwit.part_11.homework.task_2;

public class CoconutMonkey implements Monkey {

    @Override
    public int countFruits(Branch branch) {
        int totalCoconuts = branch.getCoconuts();
        for (Branch subBranch : branch.getSubBranches()) {
            totalCoconuts += countFruits(subBranch);
        }
        return totalCoconuts;
    }
}