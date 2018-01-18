
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> dic;
    
    
    public PersonalMultipleEntryDictionary() {
    this.dic = new HashMap<String, Set<String>>();
}

    @Override
    public void add(String word, String entry) {
        if(!this.dic.containsKey(word)) {
            this.dic.put(word, new HashSet<String>());
        }
        Set<String> translate = this.dic.get(word);
        translate.add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        if(this.dic.containsKey(word)) {
            return this.dic.get(word);
        }
        return null;
    }

    @Override
    public void remove(String word) {
        this.dic.remove(word);
    }
    
}
