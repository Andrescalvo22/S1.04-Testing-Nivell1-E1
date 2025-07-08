import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;

    @BeforeEach
    void setup() {
        library = new Library();
    }

    @Test
    void bookListNotNull() {
        assertNotNull(library.getBooks());
    }

    @Test
    void bookCorrectSize() {
        library.addBook("Book 1");
        library.addBook("Book 2");
        library.addBook("Book 3");
        assertEquals(3, library.getBookCount());
    }

    @Test
    void bookCorrectPosition() {
        library.addBook("Book 1");
        library.addBook("Book 2");
        List<String> books = library.getBooks();
        assertTrue(books.contains("Book 1"));
    }

    @Test
    void bookNotDuplicate() {
        library.addBook("Book 1");
        library.addBook("Book 2");
        assertEquals(1, library.getBookCount());
    }

    @Test
    void bookRetrievePosition() {
        library.addBook("Book 1");
        String book = library.getBookAt(0);
        assertEquals("Book 1", book);
    }

    @Test
    void addingBookPositionAffectList() {
        library.addBook("Book 1");
        library.addBook("Book 3");
        library.addBookAtPosition("Book 2", 1);
        List<String> books = library.getBooks();
        assertTrue(books.contains("Book 2"));
        assertEquals(3, books.size());
    }

    @Test
    void bookDecreaseSize() {
        library.addBook("Book 1");
        library.addBook("Book 2");
        library.removeBook("Book 1");
        assertEquals(1, library.getBookCount());
        assertFalse(library.getBooks().contains("Book 1"));
    }

    @Test
    void bookListAlphabetically() {
        library.addBook("Book 1");
        library.addBook("Book 2");
        library.addBook("Book 3");
        List<String> books = library.getBooks();
        assertEquals(List.of("Book 1", "Book 2", "Book 3"), books);
    }
}

