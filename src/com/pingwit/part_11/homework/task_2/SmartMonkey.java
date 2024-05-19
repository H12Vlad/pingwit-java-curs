package com.pingwit.part_11.homework.task_2;

public class SmartMonkey extends Monkey {
    @Override
    public int countBananas(Branch branch) {
        int totalBananas = branch.getBananas();
        for (Branch subBranch : branch.getSubBranches()) {
            totalBananas += countBananas(subBranch);
        }
        return totalBananas;
    }

    @Override
    public int countCoconuts(Branch branch) {
        int totalCoconuts = branch.getCoconuts();
        for (Branch subBranch : branch.getSubBranches()) {
            totalCoconuts += countCoconuts(subBranch);
        }
        return totalCoconuts;
    }
}