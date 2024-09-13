import java.util.ArrayList;
import java.util.List;

public class Store {
    private String id;
    private Location location;
    private List<Vehicle> vehicleList;
    private List<Reservation> reservationList;

    public Store(String id, Location location) {
        this.id = id;
        this.location = location;
        this.vehicleList = new ArrayList<>();
        this.reservationList = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }

    public void addReservation(Reservation reservation){
        reservationList.add(reservation);
    }

    //similar remove functions for vehicle & reservation

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }
}
