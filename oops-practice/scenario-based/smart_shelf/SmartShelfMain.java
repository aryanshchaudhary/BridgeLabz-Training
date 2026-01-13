package smart_shelf;

public class SmartShelfMain {
	public static void main(String[] args) {
		SmartShelf shelf = new SmartShelf(10);

        shelf.addBook(new Book("Java Programming"));
        shelf.addBook(new Book("Data Structures"));
        shelf.addBook(new Book("Algorithms"));
        shelf.addBook(new Book("Computer Networks"));
        shelf.addBook(new Book("Operating Systems"));

        shelf.displayShelf();
	}
}
