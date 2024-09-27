package com.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> availableBooks;

    public Library() {
        availableBooks = new ArrayList<>();
    }

    public void addBook(Book book) {
        availableBooks.add(book);
    }

    public List<Book> getAvailableBooks() {
        return availableBooks;
    }
}
