package com.pingwit.part_11.homework.rask_2;

public class TestMonkeyCode {
        public static void main(String[] args) {
            Branch bananaTree = new Branch(10, 0);
            Branch bananaBranch1 = new Branch(5, 0);
            Branch bananaBranch2 = new Branch(3, 0);
            bananaTree.addSubBranch(bananaBranch1);
            bananaTree.addSubBranch(bananaBranch2);
            Branch bananaSubBranch1 = new Branch(2, 0);
            bananaBranch1.addSubBranch(bananaSubBranch1);

            Branch coconutTree = new Branch(0, 8);
            Branch coconutBranch1 = new Branch(0, 4);
            Branch coconutBranch2 = new Branch(0, 6);
            coconutTree.addSubBranch(coconutBranch1);
            coconutTree.addSubBranch(coconutBranch2);
            Branch coconutSubBranch1 = new Branch(0, 2);
            coconutBranch1.addSubBranch(coconutSubBranch1);

            Monkey bananaCounterMonkey = new BananaCounterMonkey();
            Monkey coconutCounterMonkey = new CoconutCounterMonkey();
            Monkey smartMonkey = new SmartMonkey();

            MonkeyManager manager = new MonkeyManager();

            System.out.println("Подсчет бананов:");
            manager.askMonkeyToCountFruits(bananaCounterMonkey, bananaTree);

            System.out.println("\nПодсчет кокосов:");
            manager.askMonkeyToCountFruits(coconutCounterMonkey, coconutTree);

            System.out.println("\nУмная обезьяна считает бананы на дереве с бананами:");
            manager.askMonkeyToCountFruits(smartMonkey, bananaTree);

            System.out.println("\nУмная обезьяна считает кокосы на дереве с кокосами:");
            manager.askMonkeyToCountFruits(smartMonkey, coconutTree);
        }
    }