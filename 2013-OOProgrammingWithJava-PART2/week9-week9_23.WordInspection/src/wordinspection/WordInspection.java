
package wordinspection;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WordInspection {
    private final File file;
    
    public WordInspection(File file) {
        this.file = file;
    }
    public int wordCount() throws Exception {
        Scanner reader = new Scanner(this.file);
        int i = 0;
        while(reader.hasNextLine()) {
            String word = reader.nextLine();
            i++;
        }
        reader.close();
        return i;
    }
    public List<String> wordsContainingZ() throws Exception {
        List<String> w = new ArrayList<String>();
        Scanner r = new Scanner(this.file);
        
        while(r.hasNextLine()) {
            String s = r.nextLine();
            if(s.contains("z")) {
                w.add(s);
            }
            
        }
        r.close();
        return w;
    }
    public List<String> wordsEndingInL() throws Exception {
        List<String> l = new ArrayList<String>();
        Scanner read = new Scanner(this.file);
        
        while(read.hasNextLine()) {
            String d = read.nextLine();
            if(d.endsWith("l")) {
                l.add(d);
            }
        }
        read.close();
        return l;
        
    }
    public List<String> palindromes() throws Exception {
        Scanner t = new Scanner(this.file);
        List<String> p = new ArrayList<String>();
        
        while(t.hasNextLine()) {
            String pal = t.nextLine();
            String r = reverse(pal);
            if(pal.equalsIgnoreCase(r)) {
                p.add(pal);
            }
        }
        t.close();
        return p;
    }
    public List<String> wordsWhichContainAllVowels() throws Exception {
        Scanner fin = new Scanner(this.file);
        List<String> finnish = new ArrayList<String>();
        
        while(fin.hasNextLine()) {
            String f = fin.nextLine();
            if(f.contains("a") && f.contains("e") && f.contains("i") && f.contains("o")
                    && f.contains("u") && f.contains("y") && f.contains("ä") && f.contains("ö")) {
                finnish.add(f);
            }
            
        }
        fin.close();
       return finnish;
    }
    private String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String rev = sb.toString();
        return rev;
    }
   
}
