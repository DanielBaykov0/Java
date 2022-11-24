import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {

    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public List<Player> getPlayers() {
        return Collections.unmodifiableList(this.players);
    }

    private void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String s) {
        int index = -1;
        for (int i = 0; i < this.players.size(); i++) {
            if (this.players.get(i).getName().equals(s)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            this.players.remove(index);
        } else {
            throw new IllegalArgumentException(String.format("Player %s is not in %s team.", s, this.name));
        }
    }

    public int getRating() {

        return (int) Math.round(this.players.stream()
                .mapToDouble(Player::overallSkillLevel)
                .average()
                .orElse(0.00));
    }
}
