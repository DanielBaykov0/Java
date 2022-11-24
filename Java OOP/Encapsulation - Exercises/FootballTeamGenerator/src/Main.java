import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Team> teams = new HashMap<>();

        String line = scanner.nextLine();
        while (!line.equals("END")) {
            String[] tokens = line.split(";");
            String command = tokens[0];
            String teamName = tokens[1];

            switch (command) {
                case "Team":
                    try {
                        Team team = new Team(teamName);
                        teams.putIfAbsent(teamName, team);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Add":
                    String playerName = tokens[2];
                    int endurance = Integer.parseInt(tokens[3]);
                    int sprint = Integer.parseInt(tokens[4]);
                    int dribble = Integer.parseInt(tokens[5]);
                    int passing = Integer.parseInt(tokens[6]);
                    int shooting = Integer.parseInt(tokens[7]);

                    try {
                        if (!teams.containsKey(teamName)) {
                            throw new IllegalArgumentException("Team " + teamName + " does not exist.");
                        } else {
                            Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                            teams.get(teamName).addPlayer(player);
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Remove":
                    String playerName2 = tokens[2];
                    try {
                        teams.get(teamName).removePlayer(playerName2);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Rating":
                    try {
                        if (!teams.containsKey(teamName)) {
                            throw new IllegalArgumentException("Team " + teamName + " does not exist.");
                        } else {
                            System.out.println(teamName + " - " + teams.get(teamName).getRating());
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
            line = scanner.nextLine();
        }
    }
}