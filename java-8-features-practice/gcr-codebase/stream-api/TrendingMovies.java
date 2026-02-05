package stream_API;
import java.util.*;
import java.util.stream.*;

class Movie{
	String name;
	double rating;
	int year;
	
	Movie(String name, double rating, int year) {
		this.name = name;
		this.rating = rating;
		this.year = year;
	}
}
public class TrendingMovies {
	public static void main(String[] args) {
		List<Movie> movies = Arrays.asList(new Movie("Movie A", 8.5, 2020), new Movie("Movie B", 7.2, 2019),
				new Movie("Movie C", 9.0, 2021), new Movie("Movie D", 6.8, 2018));

		List<String> trendingMovies = movies.stream().filter(m -> m.rating > 8.0)
				.sorted((m1, m2) -> Double.compare(m2.rating, m1.rating)).map(m -> m.name).collect(Collectors.toList());

		System.out.println("Trending Movies: " + trendingMovies);
	}
}
