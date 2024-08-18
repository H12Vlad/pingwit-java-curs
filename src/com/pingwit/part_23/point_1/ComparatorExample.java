package com.pingwit.part_23.point_1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>();

        books.add(new Book("Potter", "Pushkin", 2012));
        books.add(new Book("Potter", "Dostoevskiy", 2012));
        books.add(new Book("Potter", "Aushkin", 2012));
        books.add(new Book("Potter", "Aushkin", 2012));
        books.add(new Book("Potter", "Aushkin", 2005));

        System.out.println(books);
        System.out.println(books.size());


        Comparator<Book> customComparator = new BookYearComparator()
                .thenComparing(new BookNameComparator())
                .reversed();

        Set<Book> customBooks = new TreeSet<>(customComparator);
        customBooks.add(new Book("Evgeniy Onegin", "Pushkin", 2000));
        customBooks.add(new Book("Potter", "Dostoevskiy", 2012));
        customBooks.add(new Book("Potter", "Aushkin", 2012));
        customBooks.add(new Book("Potter", "Aushkin", 2022));
        customBooks.add(new Book("Potter", "Aushkin", 2005));

        System.out.println(customBooks);
        System.out.println(customBooks.size());

    }
}