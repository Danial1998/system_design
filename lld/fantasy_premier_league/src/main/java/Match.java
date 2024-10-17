import java.util.List;

public class Match {
    private String teamA;
    private String teamB;
    private List<Player> playersInvolved;

    public Match(String teamA, String teamB, List<Player> playersInvolved) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.playersInvolved = playersInvolved;
    }

    public void updatePlayerStats(String playerName, int points) {
        for (Player player : playersInvolved) {
            if (player.getName().equals(playerName)) {
                player.updatePoints(points);
            }
        }
    }
}
