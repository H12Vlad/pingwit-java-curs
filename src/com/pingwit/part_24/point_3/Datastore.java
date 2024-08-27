package com.pingwit.part_24.point_3;

import java.util.ArrayList;
import java.util.List;

public class Datastore {
    private final List<Integer> numbers;

    public Datastore(List<Integer> numbers) {
        this.numbers = numbers;
    }

    List<Integer> getData(List<Filter> filters){
        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            boolean validationPassed = true;
            for (Filter filter : filters) {
                if (!filter.filter(number)){
                    validationPassed = false;
                }
            }
            if (validationPassed){
                result.add(number);
            }
        }
        return result;
    }
}
