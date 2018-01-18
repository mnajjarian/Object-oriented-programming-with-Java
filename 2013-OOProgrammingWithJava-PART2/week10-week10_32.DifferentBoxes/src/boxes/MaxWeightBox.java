
package boxes;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box {
    private final List<Thing> box;
    private final int max;
    
    public MaxWeightBox(int maxWeight) {
        this.box = new ArrayList<Thing>();
        this.max = maxWeight;
    }

    @Override
    public void add(Thing thing) {
        int weight = 0;
        for(Thing t : box) {
            weight += t.getWeight();
        }
        if(weight + thing.getWeight() <= max) {
            box.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return box.contains(thing);
    }
    
}
