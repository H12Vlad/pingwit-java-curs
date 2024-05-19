package com.pingwit.part_11.homework.rask_2; // rask_2 -> task_2

import java.util.ArrayList;
import java.util.List;

public class Branch {
    private int bananas;
    private int coconuts;
    private List<Branch> subBranches; // subBranches -> branches

    public Branch(int bananas, int coconuts) {
        this.bananas = bananas;
        this.coconuts = coconuts;
        this.subBranches = new ArrayList<>();
    }

    public void addSubBranch(Branch branch) {
        subBranches.add(branch);
    }

    public int getBananas() {
        return bananas;
    }

    public int getCoconuts() {
        return coconuts;
    }

    public List<Branch> getSubBranches() {
        return subBranches;
    }
}