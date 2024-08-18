package com.pingwit.part_23.point_1;

record Book(String name, String author, Integer year) implements Comparable<Book> {
    @Override
    public int compareTo(Book book) {
        int nameResult = this.name.compareTo(book.name);

        if (nameResult != 0) {
            return nameResult;
        }

        int authorResult = this.author.compareTo(book.author);
        if (authorResult != 0) {
            return authorResult;
        }

        return this.year - book.year;
    }
}
