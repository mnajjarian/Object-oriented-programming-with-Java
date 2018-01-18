
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class NhlStatisticsPart2 {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");

        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                System.out.println("");
                NHLStatistics.sortByPoints();
                NHLStatistics.top(10);
                
                
    
                // Print the top ten players sorted by points.
            } else if (command.equals("goals")) {
                System.out.println("");
                
                NHLStatistics.sortByGoals();
                NHLStatistics.top(10);
                
                // Print the top ten players sorted by goals.
            } else if (command.equals("assists")) {
                System.out.println("");
                
                NHLStatistics.sortByAssists();
                NHLStatistics.top(10);
               
                //  Print the top ten players sorted by assists.
            } else if (command.equals("penalties")) {
                System.out.println("");
                
                NHLStatistics.sortByPenalties();
                NHLStatistics.top(10);
                
               
                //  Print the top ten players sorted by penalties.
            } else if (command.equals("player")) {
                System.out.print("Which player: ");
                String playerName = reader.nextLine();
                NHLStatistics.searchByPlayer(playerName);
                NHLStatistics.sortByPoints();
                // Ask the user first which player's statistics are needed and then print them.
            } else if (command.equals("club")) {
                System.out.print("Which club: ");
                String clubName = reader.nextLine();
                NHLStatistics.teamStatistics(clubName);
                NHLStatistics.sortByPoints();
                
                // Ask the user first which club's statistics are needed and then print them.
                // Note: When printing statistics they should be ordered by points (so the players with the most points come first).
            }

        }
    }
}
