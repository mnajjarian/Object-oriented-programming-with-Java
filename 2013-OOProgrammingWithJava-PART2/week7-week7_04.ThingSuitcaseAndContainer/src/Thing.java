
public class Thing {
    private final String name;
    private final int weight;
    public Thing(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String getName() {
        return this.name;
    }
    public int getWeight() {
        return this.weight;
    }
    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }
  
}
