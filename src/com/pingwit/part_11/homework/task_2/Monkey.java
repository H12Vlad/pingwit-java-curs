package com.pingwit.part_11.homework.task_2;

public class Monkey {
    public enum FruitType { // enum в отдельный файл
        BANANA,
        COCONUT
    }

    public int countFruits(Branch branch, FruitType fruitType) { // этот метод нигде не используется, давай удалим
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