import java.util.*;

public class User {
    private String name;
    private List<Booking> bookings;

    public User(String name) {
        this.name = name;
        this.bookings = new ArrayList<>();
    }

    public void bookTicket(Bus bus, int seatNumber, Date date) {
        Booking booking = new Booking(bus, date);
        if (booking.bookSeat(seatNumber)) {
            Payment.makePayment(booking.getTotalAmount());
            bookings.add(booking);
            System.out.println("Booking confirmed for " + bus.getRoute().getSource() + " to " + bus.getRoute().getDestination());
        } else {
            System.out.println("Seat " + seatNumber + " is already booked.");
        }
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void cancelBooking(Booking booking) {
        bookings.remove(booking);
        System.out.println("Booking cancelled.");
    }
}
