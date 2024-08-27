package com.pingwit.part_24.homework.task_3;

import java.util.ArrayList;
import java.util.List;

public class UserMain {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Pier", 23));
        users.add(new User("Jon", 27));
        users.add(new User("Boni", 30));
        users.add(new User("Klaid", 30));
        users.add(new User("Ella", 30));
        users.add(new User("Angelika", 30));

        System.out.println("Before deletion: " + users);

        users.removeIf(user -> user.getName().startsWith("A"));
        users.removeIf(user -> user.getName().startsWith("E"));
        users.removeIf(user -> user.getName().startsWith("P"));

        System.out.println("After deletion: " + users);
    }
}