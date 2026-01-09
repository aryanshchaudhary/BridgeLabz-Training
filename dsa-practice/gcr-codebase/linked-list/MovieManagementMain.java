package doubly_linked_list;
class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie prev;
    Movie next;

    Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}

class MovieManagementSystem {
    private Movie head;
    private Movie tail;

    public void addAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
        System.out.println("Movie added at beginning.");
    }

    public void addAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
        System.out.println("Movie added at end.");
    }

    public void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position <= 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        Movie temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
        } else {
            Movie newMovie = new Movie(title, director, year, rating);
            newMovie.next = temp.next;
            newMovie.prev = temp;
            temp.next.prev = newMovie;
            temp.next = newMovie;
            System.out.println("Movie added at position " + position);
        }
    }

    public void removeByTitle(String title) {
        Movie temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
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
                System.out.println("Movie removed: " + title);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found.");
    }

    public void searchByDirector(String director) {
        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found for this director.");
        }
    }

    public void searchByRating(double rating) {
        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating == rating) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found with this rating.");
        }
    }

    public void updateRating(String title, double newRating) {
        Movie temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated for movie: " + title);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found.");
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("No movies available.");
            return;
        }

        Movie temp = head;
        System.out.println("\nMovies (Forward Order):");
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movies available.");
            return;
        }

        Movie temp = tail;
        System.out.println("\nMovies (Reverse Order):");
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    private void displayMovie(Movie movie) {
        System.out.println(
                "Title: " + movie.title +
                ", Director: " + movie.director +
                ", Year: " + movie.year +
                ", Rating: " + movie.rating
        );
    }
}
public class MovieManagementMain {
	public static void main(String[] args) {
		MovieManagementSystem system = new MovieManagementSystem();

        system.addAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        system.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        system.addAtEnd("Titanic", "James Cameron", 1997, 7.8);
        system.addAtPosition(2, "Avatar", "James Cameron", 2009, 7.9);

        system.displayForward();
        system.displayReverse();

        System.out.println("\nSearch by Director:");
        system.searchByDirector("Christopher Nolan");

        System.out.println("\nSearch by Rating:");
        system.searchByRating(7.9);

        system.updateRating("Titanic", 8.0);

        system.removeByTitle("Avatar");

        system.displayForward();
	}
}
