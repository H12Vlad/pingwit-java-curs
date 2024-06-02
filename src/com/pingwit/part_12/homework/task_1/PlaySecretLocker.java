package com.pingwit.part_12.homework.task_1;

import java.lang.reflect.Field;

public class PlaySecretLocker {
    public static void main(String[] args) throws Exception {
        SecretLocker locker = new SecretLocker("old_Passcode");
        System.out.println("Before: " + locker);

        Field passcodeField = SecretLocker.class.getDeclaredField("passcode");
        passcodeField.setAccessible(true);

        passcodeField.set(locker, "new_passcode");
        System.out.println("After: " + locker);
    }
}