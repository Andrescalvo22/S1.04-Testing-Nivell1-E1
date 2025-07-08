import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Library {
    private final List<String> books;

    public Library() {
        books = new ArrayList<>();
    }

    public List<String> getBooks() {
        return new ArrayList<>(books);
    }

    public void addBook(String title) {
        if (!books.contains(title)) {
            books.add(title);
            sortBooks();
        }
    }

    public void addBookAtPosition(String title, int position) {
        if (!books.contains(title) && position >= 0 && position <= books.size()) {
            books.add(position, title);
            sortBooks();
        }
    }

    public String getBookAt(int position) {
        if (position >= 0 && position < books.size()) {
            return books.get(position);
        }
        return null;
    }

    public void removeBook(String title) {
        books.remove(title);
    }

    private void sortBooks() {
        Collections.sort(books);
    }

    public int getBookCount() {
        return books.size();
    }
}


