import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private int rank;
    private List<String> players;


    public Team(String teamName) {
        name = teamName;
        players = new ArrayList<>();
    }

    public void setRank(int newRank) {
        rank = newRank;
    }

    public void addPlayer(String playerName) {
        players.add(playerName);
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hold: ").append(name).append("  Rang: ").append(rank);
        if (!players.isEmpty()) {
            sb.append("\nSpillere:");
            for (String p : players) {
                sb.append("\n- ").append(p);
            }
        }
        return sb.toString();
    }
}
