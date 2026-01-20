package book_shelf;
import java.util.*;
public class BookShelf {
	private Map<String, LinkedList<Book>> catalog = new HashMap<>();
    private Set<String> bookSet = new HashSet<>();

    public void addBook(String genre, Book book) {
        if (bookSet.contains(book.title)) {
            System.out.println("Duplicate book not allowed");
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        bookSet.add(book.title);

        System.out.println("Book added: " + book);
    }

    public void removeBook(String genre, String title) {
        if (!catalog.containsKey(genre)) return;

        Iterator<Book> it = catalog.get(genre).iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (b.title.equals(title)) {
                it.remove();
                bookSet.remove(title);
                System.out.println("Book removed: " + title);
                return;
            }
        }
    }

    public void printCatalog() {
        for (String genre : catalog.keySet()) {
            System.out.println("Genre: " + genre);
            for (Book b : catalog.get(genre)) {
                System.out.println("  " + b);
            }
        }
    }
}
