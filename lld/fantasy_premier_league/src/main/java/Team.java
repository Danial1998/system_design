import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Player> players;

    public Team() {
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player, User user) {
        if (players.size() < 11) {  // Assuming team of 11 players
            players.add(player);
            player.addObserver(user);  // User observes the player's point changes
        } else {
            System.out.println("Team already has 11 players.");
        }
    }

    public List<Player> getPlayers() {
        return players;
    }

    public int calculateTotalPoints() {
        int totalPoints = 0;
        for (Player player : players) {
            totalPoints += player.getPoints();
        }
        return totalPoints;
    }
}
