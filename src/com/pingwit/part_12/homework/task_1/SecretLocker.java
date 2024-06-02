package com.pingwit.part_12.homework.task_1;

public class SecretLocker {
    private final String passcode;

    public SecretLocker(String passcode) {
        this.passcode = passcode;
    }

    public String getPasscode() {
        return passcode;
    }

    @Override
    public String toString() {
        return "SecretLocker{" +
                "passcode='" + passcode + '\'' +
                '}';
    }
}