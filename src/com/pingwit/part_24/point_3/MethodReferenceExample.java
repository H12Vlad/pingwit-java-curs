package com.pingwit.part_24.point_3;

import java.awt.*;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        CommonFilter commonFilter = new CommonFilter();

        Filter filter_1 = commonFilter::filter;
        Filter filter_2 = CommonFilter::staticFilter;

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, -20, 50, 5, 100, 200);
        Datastore datastore = new Datastore(numbers);

        List<Filter> filters = List.of(
                commonFilter::filter,
                CommonFilter::staticFilter
        );

        System.out.println(numbers);
        List<Integer> filteredResult = datastore.getData(filters);
        System.out.println(filteredResult);
    }
}
