
package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

public class FilmComparator implements Comparator<Film> {
    private final Map<Film, List<Rating>> ratings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }
    private int getAverageRating(Film film) {
        int sumRatings = 0;
        for (Rating rating : ratings.get(film)) {
            sumRatings += rating.getValue();
        }
        return sumRatings/ratings.get(film).size();
    }

    @Override
    public int compare(Film o1, Film o2) {
        return getAverageRating(o2) - getAverageRating(o1);
    }
    
}
