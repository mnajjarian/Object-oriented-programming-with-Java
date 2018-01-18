
package boxes;

import java.util.ArrayList;
import java.util.List;

public class BlackHoleBox extends Box {
    private final List<Thing> blackBox;
    
    public BlackHoleBox() {
        this.blackBox = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        blackBox.add(thing);
        
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
    
}
