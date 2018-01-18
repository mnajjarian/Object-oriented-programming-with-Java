
package moving.domain;

import java.util.*;

public class Box implements Thing {
    private List<Thing> box = new ArrayList<Thing>();
    private int max;
    
    public Box(int maximumCapacity) {
        this.max = maximumCapacity;
    }
    public boolean addThing(Thing thing) {
        int val = thing.getVolume() + getVolume();
        if(val <= this.max) {
            this.box.add(thing);
            return true;
        } else {
        return false;
    }
        
    }
    @Override
    public int getVolume() {
        int v = 0;
        for(Thing t : this.box) {
            v += t.getVolume();   
        }
        return v;
    }
    
}
