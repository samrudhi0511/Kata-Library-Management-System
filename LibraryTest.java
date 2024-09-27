package com.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("123456", "Effective Java", "Joshua Bloch", 2018);
        library.addBook(book);

        assertEquals(1, library.getAvailableBooks().size());
        assertTrue(library.getAvailableBooks().contains(book));
    }
}
