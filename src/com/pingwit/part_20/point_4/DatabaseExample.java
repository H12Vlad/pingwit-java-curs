package com.pingwit.part_20.point_4;

public class DatabaseExample {
    public static void main(String[] args) {
        Worker[] firstTeam = {
                new Developer(),
                new QA()
        };

        QA[] secondTeam = {
                new QA(),
                new QA()
        };

        Database<Worker> database = new Database<>(firstTeam);
        Database<QA> newDatabase = new Database<>(secondTeam);

        /*
        QA implements Worker
        Database<QA> != Database<Worker>
         */
        database.addAll(newDatabase);
    }
}