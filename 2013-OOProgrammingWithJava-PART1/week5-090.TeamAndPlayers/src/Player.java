
public class Player {
    private String playerName;
    private int amountOfGoals;
    
    public Player(String playerName) {
        this.playerName = playerName;
    }
    
    public Player(String playerName, int amountOfGoals) {
            this.playerName = playerName;
            this.amountOfGoals = amountOfGoals;
        }
    public String getName() {
        return this.playerName;
    }
    public int goals() {
        return this.amountOfGoals;
    }
    public String toString() {
        return "" + this.playerName + ", " + this.amountOfGoals;
    }
    
}
