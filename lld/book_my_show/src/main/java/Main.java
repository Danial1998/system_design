import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a Movie
        Movie movie1 = new Movie("Inception", "Sci-Fi", 148);

        // Step 2: Create a Theater and Screens
        Theater theater1 = new Theater("PVR Cinemas");
        Screen screen1 = new Screen(1);
        theater1.addScreen(screen1);

        // Step 3: Create Shows
        Show show1 = new Show(movie1, new Date(), screen1, 100);  // Show with 100 seats
        screen1.addShow(show1);

        // Step 4: Create a User and Book Tickets
        User user1 = new User("John Doe");
        user1.bookTicket(show1, 10);  // Booking seat number 10
        user1.bookTicket(show1, 11);  // Booking seat number 11

        // Attempt to rebook a booked seat
        user1.bookTicket(show1, 10);  // Already booked seat

        // Step 5: View User's Bookings
        System.out.println("Bookings made by " + user1.getName() + ":");
        for (Booking booking : user1.getBookings()) {
            System.out.println("Booked for Movie: " + booking.getBookedSeats());
        }
    }
}