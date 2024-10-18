import java.util.*;

public class Main {
    public static void main(String[] args) {
        FantasyLeague fantasyLeague = FantasyLeague.getInstance();

        // Create Players
        Player player1 = new Player("Player 1", "Forward");
        Player player2 = new Player("Player 2", "Midfielder");

        // Create Users and their Fantasy Teams
        User user1 = new User("John");
        User user2 = new User("Jane");

        user1.getTeam().addPlayer(player1, user1); // Adding player1 to user1's team
        user2.getTeam().addPlayer(player2, user2); // Adding player2 to user2's team

        // Add Users to FantasyLeague
        fantasyLeague.addUser(user1);
        fantasyLeague.addUser(user2);

        // Create a Match
        List<Player> matchPlayers = Arrays.asList(player1, player2);
        Match match = new Match("Team A", "Team B", matchPlayers);

        // Add Match to FantasyLeague
        fantasyLeague.addMatch(match);

        // Update Player Stats
        match.updatePlayerStats("Player 1", 10);  // Player 1 scored 10 points
        match.updatePlayerStats("Player 2", 7);   // Player 2 scored 7 points

        // Calculate Points and Display Leaderboard
        fantasyLeague.calculateUserPoints();
        fantasyLeague.showLeaderboard();
    }
}
