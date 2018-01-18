import java.util.ArrayList;
public class Container {
    
    private ArrayList<Suitcase> suitcase = new ArrayList<Suitcase>();
    private int max;
    
    public Container(int max) {
        this.max = max;
    }
    public void addSuitcase(Suitcase suitcase) {
        int weight = totalWeight();
        weight += suitcase.totalWeight();
        if (weight <= this.max) {
            this.suitcase.add(suitcase);
        }
    }
    public String toString() {
        int weight = totalWeight();
        return suitcase.size() + " suitcases " + "(" + weight + " kg)";
    }
    public int totalWeight() {
        int weight = 0;
        for (Suitcase ss : suitcase) {
            weight += ss.totalWeight();
        }
        return weight;
    }
    public void printThings() {
        for(Suitcase s : this.suitcase) {
            s.printThings();
        }
    }
}
