package com.pingwit.part_7.homework.task_1;

public class ExecutionQueue {
    public static String msg; //в примере это поле private, в данном случае не критично, но будь внимательнее

    static {
        msg = "static block";
    }

    {
        msg = "regular init block";
    }

    public ExecutionQueue() {
        msg = "constructor value";
    }

    public static void main(String[] args) {
        ExecutionQueue executionQueue = new ExecutionQueue();

        System.out.println(executionQueue.msg);
    }
}

