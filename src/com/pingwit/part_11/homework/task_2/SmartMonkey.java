package com.pingwit.part_11.homework.task_2;

public class SmartMonkey implements Monkey {
    @Override
    public int countFruits(Branch branch) {
        int totalFruits = branch.getCoconuts() + branch.getBananas();
        for (Branch subBranch : branch.getSubBranches()) {
            totalFruits += countFruits(subBranch);
        }
        return totalFruits;
    }
}