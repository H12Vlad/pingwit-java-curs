package com.pingwit.part_14.homework.task_4;

public class WordWarehouse {
    String word; // private
    int count; // private

    public WordWarehouse(String word) {
        this.word = word;
        this.count = 0; // эта строка не нужна, при создании WordWarehouse count станет 0, т.к. это примитив
    }
}