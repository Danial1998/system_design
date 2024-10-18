import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FantasyLeague {
    private static FantasyLeague instance;
    private List<User> users;
    private List<Match> matches;

    private FantasyLeague() {
        users = new ArrayList<>();
        matches = new ArrayList<>();
    }

    public static FantasyLeague getInstance() {
        if (instance == null) {
            instance = new FantasyLeague();
        }
        return instance;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addMatch(Match match) {
        matches.add(match);
    }

    public void calculateUserPoints() {
        for (User user : users) {
            user.updatePointsFromPlayer();
        }
    }

    public void showLeaderboard() {
        users.sort(Comparator.comparingInt(User::getTotalPoints).reversed());
        for (User user : users) {
            System.out.println(user.getName() + " - Total Points: " + user.getTotalPoints());
        }
    }
}
