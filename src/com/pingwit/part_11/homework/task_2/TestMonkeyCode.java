package com.pingwit.part_11.homework.task_2;

public class TestMonkeyCode {
    public static void main(String[] args) {
        Branch tree = new Branch(10, 5);
        Branch branch1 = new Branch(5, 2);
        Branch branch2 = new Branch(3, 6);
        tree.addSubBranch(branch1);
        tree.addSubBranch(branch2);

        Branch subBranch1 = new Branch(2, 0);
        branch1.addSubBranch(subBranch1);

        Monkey bananaCounterMonkey = new BananaMonkey();
        Monkey coconutCounterMonkey = new CoconutMonkey();
        Monkey smartMonkey = new SmartMonkey();

        MonkeyManager manager = new MonkeyManager();

        System.out.println("Подсчет бананов:");
        manager.askMonkeyToCountFruits(bananaCounterMonkey, tree);

        System.out.println("\nПодсчет кокосов:");
        manager.askMonkeyToCountFruits(coconutCounterMonkey, tree);

        System.out.println("\nУмная обезьяна считает бананы на дереве с бананами,кокосами:");
        manager.askMonkeyToCountFruits(smartMonkey, tree);
    }
}