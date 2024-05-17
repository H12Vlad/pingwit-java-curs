package com.pingwit.part_11.homework.rask_2;

public class BananaCounterMonkey extends Monkey {

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
        return 0; // Не умеет считать кокосы
    }
}