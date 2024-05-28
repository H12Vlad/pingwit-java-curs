package com.pingwit.part_11.homework.task_2;

public class BananaMonkey implements Monkey {

    @Override
    public int countFruits(Branch branch) {
        int totalBananas = branch.getBananas();
        for (Branch subBranch : branch.getSubBranches()) {
            totalBananas += countFruits(subBranch);
        }
        return totalBananas;
    }
}