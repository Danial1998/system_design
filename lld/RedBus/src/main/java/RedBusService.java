import java.util.*;

public class RedBusService {
    private List<Bus> buses;

    public RedBusService() {
        this.buses = new ArrayList<>();
    }

    public void addBus(Bus bus) {
        buses.add(bus);
    }

    public List<Bus> searchBuses(String source, String destination, Date date) {
        List<Bus> matchingBuses = new ArrayList<>();
        for (Bus bus : buses) {
            if (bus.getRoute().getSource().equals(source) && bus.getRoute().getDestination().equals(destination)) {
                matchingBuses.add(bus);
            }
        }
        return matchingBuses;
    }
}
