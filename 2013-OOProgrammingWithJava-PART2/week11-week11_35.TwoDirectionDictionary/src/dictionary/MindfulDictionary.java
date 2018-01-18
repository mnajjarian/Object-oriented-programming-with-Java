
package dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class MindfulDictionary {
    private Map<String, String> dic = new HashMap<String, String>();
    private Scanner reader;
    private File file;
    
    public MindfulDictionary() {
    }
    public MindfulDictionary(String file) {
        this.file = new File(file);
    }
    public boolean load() {
        try {
            reader = new Scanner(this.file);
            while(reader.hasNextLine()) {
                String line = reader.nextLine();
                String [] parts = line.split(":");
                dic.put(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean save() {
        try {
        FileWriter writer = new FileWriter(file);
        for(String key : dic.keySet()) {
        writer.write(key + ":" + dic.get(key));
        writer.write("\n");
        }
        writer.close();
        return true;
        } catch (Exception e) {
            return false;
        }
    }
    public void add(String word, String translation) {
        if(!dic.containsKey(word)) {
            dic.put(word, translation);
        }
    }
    public String translate(String word) {
        if(dic.containsKey(word)) {
            return dic.get(word);
        }
        if(dic.containsValue(word)) {
            for(String key : dic.keySet()) {
                if(dic.get(key).equals(word)) {
                    return key;
                }
            }
        }
        return null;
    }
    public void remove(String word) {
        if(dic.containsKey(word)) {
            dic.remove(word);
        }
        if(dic.containsValue(word)) {
            List<String> keys = new ArrayList<String>();
            for(String key : dic.keySet()) {
                if(dic.get(key).equals(word)) {
                    keys.add(key);
                }
            }
            for(String key : keys) {
                dic.remove(key);
            }
        }
    }
}