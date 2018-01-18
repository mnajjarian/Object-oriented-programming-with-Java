import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {
    private Map<String, String> dictionary;
    
    public Dictionary() {
        this.dictionary = new HashMap<String, String>();
    }
    public String translate(String word) {
        if(this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }
        return null;
    }
    public void add(String word, String translation) {
        this.dictionary.put(word, translation);
    }
    public int amountOfWords() {
        return this.dictionary.size();
    }
    public ArrayList<String> translationList() {
        ArrayList<String> transList = new ArrayList<String>();
        
        for(String key : this.dictionary.keySet()) {
            String value = this.dictionary.get(key);
            
            String add = key + " = " + value;
            transList.add(add);
        }
        return transList;
    }
    
}
