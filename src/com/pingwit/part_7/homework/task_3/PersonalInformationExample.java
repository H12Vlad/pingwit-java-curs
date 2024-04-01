package com.pingwit.part_7.homework.task_3;

public class PersonalInformationExample {
    public static void main(String[] args) {
        PersonalInformation[] people = new PersonalInformation[3];
        people[0] = new PersonalInformation("Alice", 25);
        people[1] = new PersonalInformation("Bob", 30);
        people[2] = new PersonalInformation("Charlie", 35);

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}
