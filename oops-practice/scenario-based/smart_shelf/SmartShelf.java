package smart_shelf;

public class SmartShelf {
	private Book[] books;
    private int count;

    SmartShelf(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(Book newBook) {

        int i = count - 1;

        while (i >= 0 && books[i].getTitle()
                .compareToIgnoreCase(newBook.getTitle()) > 0) {
            books[i + 1] = books[i];
            i--;
        }

        books[i + 1] = newBook;
        count++;

        System.out.println("Added: " + newBook.getTitle());
    }

    public void displayShelf() {
        System.out.println("\n📚 Smart Shelf (Sorted):");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + books[i].getTitle());
        }
    }
}
