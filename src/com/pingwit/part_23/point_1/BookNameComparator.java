package com.pingwit.part_23.point_1;

import java.util.Comparator;

public class BookNameComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o2.name().compareTo(o1.name());
    }
}
