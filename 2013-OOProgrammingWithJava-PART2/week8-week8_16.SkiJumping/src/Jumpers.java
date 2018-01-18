
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class Jumpers {
    private String name;
    private int point;
    private Random random;
    private int totalPoints;
    private Map<String, Integer> jumpersInfo;
    private final ArrayList<String> jumpers;
    
    public Jumpers() {
        this.name = name;
        this.point = 0;
        this.random = new Random();
        this.totalPoints = 0;
        this.jumpers = new ArrayList<String>();
        this.jumpersInfo = new HashMap<String, Integer>();
    }
    public String getName() {
        return this.name;
    }
    public int jumpingLength() {
        int length = random.nextInt(120 - 60) + 60;
        return length;
    }
    public void addJumper(String name) {
        jumpers.add(name);
        //jumpersInfo.put(name, getPoints());
    }
    public List<Integer> judgesScores() {
        List<Integer> points = new ArrayList<Integer>();
        int i = 0;
        while(i < 5) {
            points.add(random.nextInt(20-10) + 10);
            i++;
        }
        Collections.sort(points);
        this.totalPoints += points.get(1) + points.get(2) + points.get(3);
        return points;
    }
    public void reverse() {
        Collections.reverse(jumpers);
    }
    public List<String> jumperNames() {
        List<String> names = new ArrayList<String>();
        String s = "";
        for(String jump : jumpers)
            s += jump + "\n" + "   length: " + jumpingLength() + "\n" + "   judge votes: " + judgesScores() + "\n";
            names.add(s);
        return names;
    }
    public void addPoints(int points) {
        this.totalPoints += points;
    }

    public int getPoints() {
        return totalPoints;
    }

    public void printJumpingOrder() {
        int order = 1;
        sort();
        for(String jumper : jumpers) {
            System.out.println("   " + order + "." + jumper + " (" + getPoints() + " points)");
            order++;
        }
    }

    private void sort() {
        Collections.sort(jumpers);
    }
    @Override
    public String toString() {
        return  " (" + totalPoints + ")";
    }
}
