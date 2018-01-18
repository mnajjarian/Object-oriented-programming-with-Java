
public class Main {
    public static void main(String[] args) {
        Thing t = new Thing("Book", 4); 
        t.toString(); 
    }
    public static void addSuitcasesFullOfBricks(Container container) {
        int i = 0;
        while(i < 100){
            Thing brick = new Thing ("brick", i + 1);
            Suitcase ss = new Suitcase(101);
            ss.addThing(brick);
            container.addSuitcase(ss);
            i++;
    }
    }
}
