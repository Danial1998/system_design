import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class RentalSystem {
    private List<User> users;
    private List<Store> stores;

    RentalSystem(){
        this.users = new ArrayList<>();
        this.stores = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }

    public void addStore(Store store){
        stores.add(store);
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }

    public Store getSelectedStore(){
        return stores.get(0);
    }

    public Reservation createReservation(User user, Vehicle vehicle, Date fromDate, Date toDate, Store store){
        Reservation reservation = new Reservation(user.getId()+"_"+vehicle.getRegNo(),user,vehicle,fromDate,toDate);
        store.addReservation(reservation);
        System.out.println("Vehicle of type "+vehicle.getType()+" with Registration No. "+vehicle.getRegNo()+" is booked by "+user.getName()+" from Date: "+fromDate+" to Date: "+toDate+" from Store "+store.getId());
        return reservation;
    }

    public static void main(String[] args) {
        RentalSystem carApp = new RentalSystem();

        //create 2 users
        User user1 = new User("uid1","user1");
        User user2 = new User("uid2","user2");

        //create 2 locations
        Location loc1 = new Location("lid1","loc1");
        Location loc2 = new Location("lid2","loc2");

        //create 2 stores
        Store store1 = new Store("stid1",loc1);
        Store store2 = new Store("stid2",loc2);

        //create 2 vehicles
        Vehicle vehicle1 = new Vehicle("AS12","SUV",Status.AVAILABLE);
        Vehicle vehicle2 = new Vehicle("AS23","SEDAN",Status.AVAILABLE);

        //add 2 vehicles to store1
        store1.addVehicle(vehicle1);
        store1.addVehicle(vehicle2);

        //add stores and users to the app
        carApp.addStore(store1);
        carApp.addStore(store2);

        carApp.addUser(user1);
        carApp.addUser(user2);

        //User Interaction

        //searches for a location and selects a store, store will be fetched based on id
        Store selectedStore = carApp.getSelectedStore();

        //user books a car and will create a reservation
        Date fromDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fromDate);
        calendar.add(Calendar.DATE,15);
        Date toDate = calendar.getTime();

        Reservation user1Reservation = carApp.createReservation(user1,vehicle1,fromDate,toDate,selectedStore);
    }
}
