package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class LibraryApp {
    public static void main(String[] args) {
        // Load Spring application context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve BookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Add new books
        Book book1 = new Book("Thirukural", "Thiruvalluvar", "978-0134685991");
        Book book2 = new Book("Ramayanam", "kambar", "978-0132350884");

        bookService.addBook(book1);
        bookService.addBook(book2);

        // Retrieve and print book details
        Book retrievedBook = bookService.getBookByTitle("Ramayanam");
        if (retrievedBook != null) {
            System.out.println("Retrieved Book: " + retrievedBook.getTitle() + " by " +
                    retrievedBook.getAuthor() + " (ISBN: " + retrievedBook.getIsbn() + ")");
        } else {
            System.out.println("Book not found.");
        }

        // List all books in the catalog
        List<Book> allBooks = bookService.getAllBooks();
        System.out.println("All Books:");
        for (Book book : allBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " (ISBN: " + book.getIsbn() + ")");
        }
    }
}



