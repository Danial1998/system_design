import java.util.*;

class User {
    private String name;
    private List<Booking> bookings;  // Keeps track of user's bookings

    public User(String name) {
        this.name = name;
        this.bookings = new ArrayList<>();
    }

    public boolean bookTicket(Show show, int seatNumber) {
        Booking booking = new Booking(show);
        if (booking.bookSeat(seatNumber)) {
            double ticketPrice = 10.0;  // Simplified fixed price per ticket
            if (Payment.makePayment(ticketPrice)) {
                bookings.add(booking);  // Store the booking
                System.out.println(name + " successfully booked seat " + seatNumber + " for the movie " + show.getMovie().getTitle());
                return true;
            }
        }
        return false;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public String getName() {
        return name;
    }
}