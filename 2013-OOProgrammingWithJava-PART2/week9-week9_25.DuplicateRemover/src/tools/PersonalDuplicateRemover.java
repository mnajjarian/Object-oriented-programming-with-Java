
package tools;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private List<String> dupList;
    private int i;
    
    public PersonalDuplicateRemover() {
        this.dupList = new ArrayList<String>();
        this.i = 0;
    }

    @Override
    public void add(String characterString) {
        if(this.dupList.contains(characterString)) {
            i++;
            return;
        } 
            this.dupList.add(characterString);
        
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.i;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        Set<String> uniqList = new HashSet<String>();
        for(String s : this.dupList) {
            if(!uniqList.contains(s)) {
                uniqList.add(s);
            }
        }
        return uniqList;
    }

    @Override
    public void empty() {
        this.dupList.removeAll(dupList);
        
        this.i = 0;
    }
    
}
