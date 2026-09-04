package library;

import java.time.LocalDate;
import java.util.List;

public class LibraryTest {
    public static void main(String[] args) {
        try {
            Library library = new Library();

            library.addBook(new Book("978-1", "Clean Code", LocalDate.of(2026, 1, 10)));
            library.addBook(new Book("978-2", "Effective Java", LocalDate.of(2026, 1, 5)));

            try {
                library.addBook(new Book("978-1", "Duplicate Clean Code", LocalDate.of(2026, 1, 15)));
            } catch (DuplicateBookException e) {
                System.out.println("Rejected: " + e.getMessage());
            }

            try {
                library.returnBook("978-99");
            } catch (BookNotFoundException e) {
                System.out.println("Not found: " + e.getMessage());
            }

            List<Book> overdue = library.getOverdueBooks(LocalDate.of(2026, 2, 1));
            for (Book b : overdue) {
                System.out.println(b);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}