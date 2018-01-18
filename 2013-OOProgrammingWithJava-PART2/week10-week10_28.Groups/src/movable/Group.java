
package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {
    private List<Movable> list = new ArrayList<Movable>();

    @Override
    public void move(int dx, int dy) {
        for(Movable m : this.list) {
            m.move(dx, dy);
        }
    }
    public String toString() {
        String s = "";
        for(Movable m : this.list) {
            s += m.toString();
            s += '\n';
        }
        return s;
    }
    public void addToGroup(Movable movable) {
        this.list.add(movable);
    } 
}
