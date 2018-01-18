
package reference.domain;

public class Person {
    private final String name;
    
    public Person(String name) {
        this.name = name;
        
    }
    public String getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
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
        final Person other = (Person) obj;
        return !((this.name == null) ? (other.name != null) : !this.name.equals(other.name));
    }
    
}
