package com.pingwit.part_11.homework.task_2; // rask_2 -> task_2

import java.util.ArrayList;
import java.util.List;

public class Branch {
    private boolean fruit;
    private int bananas;
    private int coconuts;
    List<Branch> branches;

    public Branch(int bananas, int coconuts) {
        this.bananas = bananas;
        this.coconuts = coconuts;
        this.branches = new ArrayList<>();
    }

    public void addSubBranch(Branch branch) {
        branches.add(branch);
    }

    public int getBananas() {
        return bananas;
    }

    public int getCoconuts() {
        return coconuts;
    }

    public List<Branch> getSubBranches() {
        return branches;
    }

    public boolean isFruit() {
        return fruit;
    }

    public void setFruit(boolean fruit) {
        this.fruit = fruit;
    }
}