package com.pingwit.part_19;

import java.io.Serializable;

public class Work implements Serializable {
    private String workName;

    public Work(String workName) {
        this.workName = workName;
    }

    @Override
    public String toString() {
        return "Work{" +
                "workName='" + workName + '\'' +
                '}';
    }
}
