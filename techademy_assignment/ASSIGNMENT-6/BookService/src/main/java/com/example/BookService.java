package com.example;


import java.util.ArrayList;
import java.util.List;

public class BookService {
    private List<Book> bookCatalog = new ArrayList<>();

    public void addBook(Book book) {
        bookCatalog.add(book);
    }

    public Book getBookByTitle(String title) {
        for (Book book : bookCatalog) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;  // Return null if book with given title is not found
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(bookCatalog);
    }
}


