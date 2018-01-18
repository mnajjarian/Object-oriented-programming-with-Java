
package moving.logic;

import java.util.*;
import moving.domain.*;

public class Packer {
    private int boxesVolume;
    private List<Box> all;
    
    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
        this.all = new ArrayList<Box>();
    }
    public List<Box> packThings(List<Thing> things) {
        for(Thing t : things) {
            Box box = new Box(this.boxesVolume);
            box.addThing(t);
            this.all.add(box);
        }
        return this.all;
    }
}
