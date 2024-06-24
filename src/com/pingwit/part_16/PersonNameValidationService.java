package com.pingwit.part_16;

import java.lang.reflect.Field;

public class PersonNameValidationService {
    public boolean validate(ValidatedPerson person) throws IllegalAccessException {
        Field[] declaredFields = person.getClass().getDeclaredFields();

        for (Field declaredField : declaredFields) {
            NameValidation annotation = declaredField.getAnnotation(NameValidation.class);
            if (annotation != null) {
                declaredField.setAccessible(true);
                String string = (String) declaredField.get(person);

                int length = string.length();
                return length > annotation.min() && length < annotation.min();
            }
        }
        return true;
    }
}