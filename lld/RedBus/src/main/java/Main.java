import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create Routes
        Route route1 = new Route("Delhi", "Chandigarh");

        // Step 2: Create Buses for the Routes
        Bus bus1 = new Bus("DL01A1234", route1, 50); // Bus with 50 seats
        Bus bus2 = new Bus("DL01A5678", route1, 30); // Another bus for same route with 30 seats

        // Step 3: Create RedBusService and add Buses
        RedBusService redBusService = new RedBusService();
        redBusService.addBus(bus1);
        redBusService.addBus(bus2);

        // Step 4: User searches for buses
        User user1 = new User("John Doe");
        List<Bus> availableBuses = redBusService.searchBuses("Delhi", "Chandigarh", new Date());

        // Step 5: Book tickets if buses are available
        if (!availableBuses.isEmpty()) {
            Bus selectedBus = availableBuses.get(0);  // Assuming user picks the first bus
            user1.bookTicket(selectedBus, 10, new Date());  // Book seat 10 on selected bus
            user1.bookTicket(selectedBus, 15, new Date());  // Book seat 15 on selected bus
        }

        // Step 6: Print user's bookings
        System.out.println("Bookings for " + user1.getBookings().size() + " seats confirmed.");
    }
}
