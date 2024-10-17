import java.util.*;

// Movie Class
class Movie {
    private String title;
    private String genre;
    private int durationInMinutes;

    public Movie(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.durationInMinutes = duration;
    }

    public String getTitle() {
        return title;
    }
}