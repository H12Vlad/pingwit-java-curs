package com.pingwit.part_11.homework.task_2;

public class BananaMonkey extends Monkey {

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
        return 0;
    }
}