import java.util.*;
class Show {
    private Movie movie;
    private Date showTime;
    private Screen screen;
    private List<Seat> seats;

    public Show(Movie movie, Date showTime, Screen screen, int totalSeats) {
        this.movie = movie;
        this.showTime = showTime;
        this.screen = screen;
        this.seats = new ArrayList<>(totalSeats);
        for (int i = 0; i < totalSeats; i++) {
            seats.add(new Seat(i + 1));  // Initialize seats
        }
    }

    public Movie getMovie() {
        return movie;
    }

    public Date getShowTime() {
        return showTime;
    }

    public List<Seat> getSeats() {
        return seats;
    }
}