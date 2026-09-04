package library;

import java.time.LocalDate;
import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) throws DuplicateBookException {
        if (books.contains(book)) {
            throw new DuplicateBookException("Duplicate ISBN: " + book.isbn);
        }
        books.add(book);
    }

    public void returnBook(String isbn) {
        boolean removed = books.removeIf(b -> b.isbn.equals(isbn));
        if (!removed) {
            throw new BookNotFoundException("Book with ISBN " + isbn + " not found.");
        }
    }

    public List<Book> getOverdueBooks(LocalDate today) {
        List<Book> overdue = new ArrayList<>();
        for (Book b : books) {
            if (b.dueDate.isBefore(today)) {
                overdue.add(b);
            }
        }
        Collections.sort(overdue);
        return overdue;
    }
}