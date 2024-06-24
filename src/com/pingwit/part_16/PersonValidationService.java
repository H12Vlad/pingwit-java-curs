package com.pingwit.part_16;

public class PersonValidationService {
    private final PersonNameValidationService nameValidationService;

    public PersonValidationService(PersonNameValidationService nameValidationService) {
        this.nameValidationService = nameValidationService;
    }

    public boolean validate(ValidatedPerson person) throws IllegalAccessException {
        return nameValidationService.validate(person);
    }
}