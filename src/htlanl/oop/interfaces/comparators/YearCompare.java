package htlanl.oop.interfaces.comparators;

import htlanl.oop.interfaces.Movie;

import java.util.Comparator;

public class YearCompare implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {
        if (m1.getYear() > m2.getYear()) return 1;
        if (m1.getYear() < m2.getYear()) return -1;
        return 0;

        // More efficient method
        // Integer.compare(m1.getYear(), m2.getYear());
    }
}
