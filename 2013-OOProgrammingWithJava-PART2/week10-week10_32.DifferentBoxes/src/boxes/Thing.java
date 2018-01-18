package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        this.name = name;
        if(weight < 0) {
            throw new IllegalArgumentException();
        }
        this.weight = weight;
    }

    public Thing(String name) {
        this(name, 0);
    } 

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    @Override
    public int hashCode() {
        if(this.name == null) {
            return 7;
        }
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Thing other = (Thing) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }

}
