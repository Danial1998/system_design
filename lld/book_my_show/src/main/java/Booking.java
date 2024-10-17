import java.util.*;

class Booking {
    private Show show;
    private List<Seat> bookedSeats;

    public Booking(Show show) {
        this.show = show;
        this.bookedSeats = new ArrayList<>();
    }

    public boolean bookSeat(int seatNumber) {
        Seat seat = show.getSeats().get(seatNumber - 1);
        if (!seat.isBooked()) {
            seat.bookSeat();
            bookedSeats.add(seat);
            return true;
        } else {
            System.out.println("Seat " + seatNumber + " is already booked.");
            return false;
        }
    }

    public List<Seat> getBookedSeats() {
        return bookedSeats;
    }
}