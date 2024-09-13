import java.util.Date;

public class Reservation {
    private String id;
    private User user;
    private Vehicle vehicle;
    private Date fromDate;
    private Date toDate;

    public Reservation(String id, User user, Vehicle vehicle, Date fromDate, Date toDate) {
        this.id = id;
        this.user = user;
        this.vehicle = vehicle;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
