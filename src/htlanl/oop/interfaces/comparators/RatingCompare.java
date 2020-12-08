package htlanl.oop.interfaces.comparators;

import htlanl.oop.interfaces.Movie;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {
        if (m1.getRating() > m2.getRating()) return 1;
        if (m1.getRating() < m2.getRating()) return -1;
        return 0;
    }
}
