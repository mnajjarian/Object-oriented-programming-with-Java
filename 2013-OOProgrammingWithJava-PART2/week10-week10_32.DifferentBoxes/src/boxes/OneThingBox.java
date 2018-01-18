
package boxes;

public class OneThingBox extends Box {
    private Thing oneThing;
    
     public OneThingBox() {
         this.oneThing = null;
     }

    @Override
    public void add(Thing thing) {
        if(this.oneThing == null) {
            this.oneThing = thing;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(this.oneThing == null || thing == null) {
            return false;
        }
        return this.oneThing.equals(thing);
    }
}
