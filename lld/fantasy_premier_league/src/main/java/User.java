import java.util.List;

public class User {
    private String name;
    private Team team;
    private int totalPoints;

    public User(String name) {
        this.name = name;
        this.team = new Team();
        this.totalPoints = 0;
    }

    public String getName() {
        return name;
    }

    public Team getTeam() {
        return team;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void updatePoints(int points) {
        this.totalPoints += points;
    }

    // Called when any player's points are updated
    public void updatePointsFromPlayer() {
        this.totalPoints = team.calculateTotalPoints();
    }
}
