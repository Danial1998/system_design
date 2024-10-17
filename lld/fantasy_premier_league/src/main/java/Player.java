import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private String position;
    private int points;
    private List<User> observers;

    public Player(String name, String position) {
        this.name = name;
        this.position = position;
        this.points = 0;
        this.observers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getPoints() {
        return points;
    }

    public void updatePoints(int points) {
        this.points += points;
        notifyObservers();
    }

    public void addObserver(User user) {
        observers.add(user);
    }

    public void removeObserver(User user) {
        observers.remove(user);
    }

    private void notifyObservers() {
        for (User observer : observers) {
            observer.updatePointsFromPlayer();
        }
    }
}
