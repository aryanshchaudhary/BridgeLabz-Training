package collectors;
import java.util.*;
import java.util.stream.*;

class Book {
    String genre;
    int pages;

    Book(String genre, int pages) {
        this.genre = genre;
        this.pages = pages;
    }
}

public class BookStatistics {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Fiction", 300),
                new Book("Fiction", 450),
                new Book("Science", 500)
        );

        Map<String, IntSummaryStatistics> stats =
                books.stream()
                        .collect(Collectors.groupingBy(
                                b -> b.genre,
                                Collectors.summarizingInt(b -> b.pages)
                        ));

        stats.forEach((genre, s) -> {
            System.out.println(genre +
                    " -> Total: " + s.getSum() +
                    ", Average: " + s.getAverage() +
                    ", Max: " + s.getMax());
        });
    }
}
