import java.util.ArrayList;
public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;
    
    public Team(String name) {
        this.name = name;
        this.maxSize = 16;
        this.players = new ArrayList<Player>();
    }
    public String getName() {
        return this.name;
    }
    public void addPlayer (Player player) {
        this.players.add(player);
    }
    public void printPlayers() {
        if (this.players.size() < this.maxSize) {
        for (Player players : this.players) {
            System.out.println(players);
        }
    }
    }
    public void setMaxSize(int maxSize) {
       this.maxSize = maxSize;
    }
    public int size() {
        if (this.maxSize < this.players.size()) {
        return this.maxSize;
        } else {
        return this.players.size();
    }
    }
    public int goals() {
        int i = 0;
        for (Player p: this.players) {
            i += p.goals();
        }
        return i;
    }
}
