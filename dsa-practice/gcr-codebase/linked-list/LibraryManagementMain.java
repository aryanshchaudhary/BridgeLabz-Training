package doubly_linked_list;
class Book {
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;
    Book next;
    Book prev;

    Book(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}

class LibraryManagementSystem {
    private Book head;
    private Book tail;

    public void addAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        System.out.println("Book added at beginning.");
    }

    public void addAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        System.out.println("Book added at end.");
    }

    public void addAtPosition(int position, String title, String author, String genre, int bookId, boolean isAvailable) {
        if (position <= 1) {
            addAtBeginning(title, author, genre, bookId, isAvailable);
            return;
        }

        Book temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, author, genre, bookId, isAvailable);
        } else {
            Book newBook = new Book(title, author, genre, bookId, isAvailable);
            newBook.next = temp.next;
            newBook.prev = temp;
            temp.next.prev = newBook;
            temp.next = newBook;
            System.out.println("Book added at position " + position);
        }
    }

    public void removeByBookId(int bookId) {
        Book temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {
                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println("Book removed with ID: " + bookId);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    public void searchByTitle(String title) {
        Book temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No book found with this title.");
        }
    }

    public void searchByAuthor(String author) {
        Book temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No books found by this author.");
        }
    }

    public void updateAvailability(int bookId, boolean status) {
        Book temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = status;
                System.out.println("Availability updated for Book ID: " + bookId);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        Book temp = head;
        System.out.println("\nLibrary Books (Forward):");
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }

        Book temp = tail;
        System.out.println("\nLibrary Books (Reverse):");
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    public int countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    private void displayBook(Book book) {
        System.out.println(
            "ID: " + book.bookId +
            ", Title: " + book.title +
            ", Author: " + book.author +
            ", Genre: " + book.genre +
            ", Available: " + (book.isAvailable ? "Yes" : "No")
        );
    }
}
public class LibraryManagementMain {
	public static void main(String[] args) {
		LibraryManagementSystem library = new LibraryManagementSystem();

        library.addAtBeginning("Java Basics", "James Gosling", "Programming", 101, true);
        library.addAtEnd("Data Structures", "Mark Allen", "Computer Science", 102, true);
        library.addAtEnd("Operating Systems", "Silberschatz", "CS", 103, false);
        library.addAtPosition(2, "DBMS", "Navathe", "Database", 104, true);

        library.displayForward();
        library.displayReverse();

        System.out.println("\nSearch by Title:");
        library.searchByTitle("DBMS");

        System.out.println("\nSearch by Author:");
        library.searchByAuthor("Mark Allen");

        library.updateAvailability(103, true);
        library.removeByBookId(102);

        library.displayForward();

        System.out.println("\nTotal Books: " + library.countBooks());
	}
}
