import java.util.*;

public class Bus {
    private String busNumber;
    private Route route;
    private List<Seat> seats;
    private Map<Date, List<Seat>> availableSeatsByDate;

    public Bus(String busNumber, Route route, int totalSeats) {
        this.busNumber = busNumber;
        this.route = route;
        this.seats = new ArrayList<>(totalSeats);
        this.availableSeatsByDate = new HashMap<>();
        for (int i = 0; i < totalSeats; i++) {
            seats.add(new Seat(i + 1));
        }
    }

    public Route getRoute() {
        return route;
    }

    public List<Seat> getAvailableSeats(Date date) {
        return availableSeatsByDate.getOrDefault(date, seats);
    }

    public void bookSeat(int seatNumber, Date date) {
        Seat seat = seats.get(seatNumber - 1);
        seat.bookSeat();
        availableSeatsByDate.putIfAbsent(date, new ArrayList<>(seats));
    }
}
