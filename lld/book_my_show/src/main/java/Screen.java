import java.util.*;

class Screen {
    private int screenNumber;
    private List<Show> shows;

    public Screen(int screenNumber) {
        this.screenNumber = screenNumber;
        this.shows = new ArrayList<>();
    }

    public void addShow(Show show) {
        shows.add(show);
    }

    public List<Show> getShows() {
        return shows;
    }
}