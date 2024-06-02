package com.pingwit.part_12;

import java.lang.reflect.Constructor;

public class PrivateClubPrivateConstructorExample {
    public static void main(String[] args) throws Exception {
        PrivateClub privateClub = null;

        Class<PrivateClub> privateClubClass = PrivateClub.class;
        Constructor<?>[] declaredConstructors = privateClubClass.getDeclaredConstructors();

        for (Constructor<?> declaredConstructor : declaredConstructors) {
            Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();

            for (Class<?> parameterType : parameterTypes) {
                if (String.class.getName().equals(parameterType.getName()) && parameterTypes.length == 1) {
                    declaredConstructor.setAccessible(true);
                    privateClub = (PrivateClub) declaredConstructor.newInstance("Dinamo Dog");

                }

            }

        }
        System.out.println(privateClub);
    }
}
