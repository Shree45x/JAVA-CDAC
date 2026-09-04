package library;

import java.time.LocalDate;
import java.util.Objects;

public class Book implements Comparable<Book> {
    protected String isbn;
    public String title;
    protected LocalDate dueDate;

    public Book(String isbn, String title, LocalDate dueDate) throws InvalidBookException {
        if (isbn == null || isbn.trim().isEmpty() || isbn.equals("N?A")) {
            throw new InvalidBookException("Invalid Book");
        }
        this.isbn = isbn;
        this.title = title;
        this.dueDate = dueDate;
    }

    public String getIsbn() {
        return this.isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public int compareTo(Book other) {
        int dateCompare = this.dueDate.compareTo(other.dueDate);
        if (dateCompare != 0) {
            return dateCompare;
        }
        return this.isbn.compareTo(other.isbn);
    }

    @Override
    public String toString() {
        return title + " (Due: " + dueDate + ", ISBN: " + isbn + ")";
    }
}