import java.util.ArrayList;
public class Suitcase {
    private ArrayList<Thing> things = new ArrayList<Thing>();
    private int max;
    //private int weight;
    
    public Suitcase(int max) {
        things = new ArrayList<Thing>();
        this.max = max;
    }
    public void addThing(Thing thing) {
        int weight = totalWeight(); 
        weight += thing.getWeight();
        if (weight <= this.max) {
            this.things.add(thing);
        }
    }
    public String toString() {
        int weight = totalWeight();
        if (things.size() == 0) {
            return "empty " + "(" + weight + " kg)";
        } else if (things.size() == 1) {
        return things.size() + " thing " + "(" + weight + " kg)";
    }
        return things.size() + " things " + "(" + weight + " kg)";
    }
    public void printThings() {
        for(Thing t : this.things) {
            System.out.println(t);
        }
    }
    public int totalWeight() {
        int weight = 0;
        for (Thing thing : things) {
            weight += thing.getWeight();
        }
        return weight;
    }
    public Thing heaviestThing() {
        Thing heaviest = null;
        if(things.size() > 0) {
            heaviest = things.get(0);
            for(Thing thing : things) {
                if(heaviest.getWeight() < thing.getWeight()) {
                    heaviest = thing;
                }
            }
        }
        return heaviest;
    }
}
