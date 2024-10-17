import java.util.*;

public class Booking {
    private Bus bus;
    private Date date;
    private List<Seat> bookedSeats;
    private double totalAmount;

    public Booking(Bus bus, Date date) {
        this.bus = bus;
        this.date = date;
        this.bookedSeats = new ArrayList<>();
    }

    public boolean bookSeat(int seatNumber) {
        Seat seat = bus.getAvailableSeats(date).get(seatNumber - 1);
        if (!seat.isBooked()) {
            seat.bookSeat();
            bookedSeats.add(seat);
            totalAmount += 500;  // assuming a fixed rate
            return true;
        }
        return false;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
