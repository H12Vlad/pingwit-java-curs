package com.pingwit.part_11.homework.task_2;

public class Monkey {
    public enum FruitType {
        BANANA,
        COCONUT
    }

    public int countFruits(Branch branch, FruitType fruitType) {
        int count = 0;
        switch (fruitType) {
            case BANANA:
                count = countBananas(branch);
                break;
            case COCONUT:
                count = countCoconuts(branch);
                break;
        }
        return count;
    }

    public int countBananas(Branch branch) {
        return 0;
    }

    public int countCoconuts(Branch branch) {
        return 0;
    }
}