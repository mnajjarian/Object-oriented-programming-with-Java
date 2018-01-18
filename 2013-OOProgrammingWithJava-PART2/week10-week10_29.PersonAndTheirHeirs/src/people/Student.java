
package people;

public class Student extends Person {
    private int credit;
    
    public Student(String name, String address) {
        super(name, address);
    }
    public void study() {
        this.credit++;
    }
    public int credits() {
        return this.credit;
    }
    @Override
    public String toString(){
        return super.toString() + "\n" + "  " + "credits " + this.credit;
    }
    
}
