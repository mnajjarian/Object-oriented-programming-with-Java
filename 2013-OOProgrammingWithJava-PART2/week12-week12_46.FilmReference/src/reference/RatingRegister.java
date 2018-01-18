
package reference;

import reference.domain.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class RatingRegister {
    private final Map<Film, List<Rating>> filmRatings;
    private final Map<Person, Map<Film, Rating>> personRatings;
    
    public RatingRegister() {
        this.filmRatings = new HashMap<Film, List<Rating>>();
        this.personRatings = new HashMap<Person, Map<Film, Rating>>();
    }
    public void addRating(Film film, Rating rating) {
        if(filmRatings.containsKey(film)) {
            filmRatings.get(film).add(rating);
        } else {
            filmRatings.put(film, new ArrayList());
            filmRatings.get(film).add(rating);
        }
    }
    public List<Rating> getRatings(Film film) {
        return filmRatings.get(film);
    }
    public Map<Film, List<Rating>> filmRatings() {
        return filmRatings;
    }
    public void addRating(Person person, Film film, Rating rating) {
        if(!personRatings.containsKey(person)) {
            Map<Film, Rating> filmRating = new HashMap<Film, Rating>();
            personRatings.put(person, filmRating);  
        } else {
            personRatings.get(person).put(film, rating);
            addRating(film, rating);
        }
    }
    public Rating getRating(Person person, Film film) {
        if(personRatings.get(person).containsKey(film)) {
            return personRatings.get(person).get(film);
        }
        return Rating.NOT_WATCHED;
    }
    public Map<Film, Rating> getPersonalRatings(Person person) {
        if(!reviewers().contains(person)) {
            personRatings.put(person, new HashMap());
        }
        return personRatings.get(person);
    }
    public List<Person> reviewers() {
        List<Person> reviwers = new ArrayList<Person>();
        reviwers.addAll(personRatings.keySet());
        return reviwers;
    }
    
    public int getHighestRatingForFilm(Film film) {
        int highestRating = -5;
        for (Rating rating : getRatings(film)) {
            if (rating.getValue() > highestRating) {
                highestRating = rating.getValue();
            }
        }
        return highestRating;
    }
    public List<Film> getPersonsFilms(Person person) {
        List<Film> films = new ArrayList<Film>();
        if (!getPersonalRatings(person).isEmpty()) {
            films.addAll(getPersonalRatings(person).keySet());
        }
        return films;
    }
}
