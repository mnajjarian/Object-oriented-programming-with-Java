
package reader.criteria;

import java.util.ArrayList;
import java.util.List;

public class AtLeastOne implements Criterion {
    private final List<Criterion> all;
    
    public AtLeastOne(Criterion... criterions) {
        this.all = new ArrayList<Criterion>();
        for(int i = 0; i < criterions.length; i++) {
            all.add(criterions[i]);
        }
    }

    @Override
    public boolean complies(String line) {
        for(Criterion c : all) {
            if(c.complies(line)) {
                return true;
            }
        }
        return false;
    }
    
}
