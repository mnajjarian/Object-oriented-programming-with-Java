import java.util.ArrayList;
public class Box implements ToBeStored {
    private ArrayList<ToBeStored> boxes;
    private double maxWeight;
    
    public Box(double maxWeight) {
        this.boxes = new ArrayList<ToBeStored>();
        this.maxWeight = maxWeight;
    }
    public void add(ToBeStored box) {
        if (box.weight() + this.weight() < this.maxWeight) {
            this.boxes.add(box);
        }
    }
    public int howManyBox() {
        return this.boxes.size();
    }
    @Override
    public double weight() {
        double weight = 0;
        for(ToBeStored store : this.boxes) {
            weight += store.weight();
        }
        return weight;
    }
    @Override
    public String toString() {
        return "Box: " + howManyBox() + " things, " + "total weight " + weight() + " kg";
    }
    
}
