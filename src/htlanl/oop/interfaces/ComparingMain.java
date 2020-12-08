package htlanl.oop.interfaces;

import htlanl.oop.interfaces.comparators.NameCompare;
import htlanl.oop.interfaces.comparators.RatingCompare;
import htlanl.oop.interfaces.comparators.YearCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparingMain {
    public static void main(String[] args) {

        // Create a list of movies
        // Add movies to the list of movies created
        List<Movie> movies = new ArrayList<>();
        Collections.addAll(movies,
                new Movie("Star Wars", 4.5, 1977),
                new Movie("The Phantom Menace", 0.5, 1999),
                new Movie("The Empire Strikes Back", 5.0, 1980),
                new Movie("The Last Jedi", 4.0, 2017)
        );

        // Sorting using two types of interfaces
        // Split into methods for convenience
        sortingUsingComparable(movies);
        System.out.println("---------------------USING-COMPARATOR-------------------\n");
        sortingUsingComparator(movies);

    }

    private static void displayMovies(List<Movie> movies) {

        // Using method references to display each movie
        // Method References (https://www.baeldung.com/java-method-references)
        movies.forEach(System.out::println);
        System.out.println("\n");
    }

    private static void sortingUsingComparable(List<Movie> movies) {

        System.out.println("Before Sorting By Year");
        displayMovies(movies);

        Collections.sort(movies);

        System.out.println("After Sorting By Year");
        displayMovies(movies);
    }

    private static void sortingUsingComparator(List<Movie> movies) {

        // Using different methods to sort by different member variables for convenience and demonstration purposes
        sortByName(movies);
        sortByRating(movies);
        sortByYear(movies);
    }

    private static void sortByName(List<Movie> movies) {

        System.out.println("Before Sorting By Name");
        displayMovies(movies);

        movies.sort(new NameCompare());

        System.out.println("After Sorting By Name");
        displayMovies(movies);
    }

    private static void sortByRating(List<Movie> movies) {

        System.out.println("Before Sorting By Rating");
        displayMovies(movies);

        movies.sort(new RatingCompare());

        System.out.println("After Sorting By Rating");
        displayMovies(movies);
    }

    private static void sortByYear(List<Movie> movies) {

        System.out.println("Before Sorting By Year");
        displayMovies(movies);

        movies.sort(new YearCompare());

        System.out.println("After Sorting By Year");
        displayMovies(movies);

    }
}
