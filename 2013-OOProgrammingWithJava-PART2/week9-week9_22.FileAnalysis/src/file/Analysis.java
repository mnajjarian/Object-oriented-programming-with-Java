
package file;

import java.util.Scanner;
import java.io.File;

public class Analysis {
    private final File file;
    
    public Analysis(File file) {
        this.file = file;
        
    }
    public int lines() throws Exception {
        Scanner reader = new Scanner(this.file);
        int i = 0;
        
        while(reader.hasNext()) {
            String r = reader.nextLine();
            i++;
        }
        reader.close();
        return i;
    }
    public int characters() throws Exception {
        Scanner read = new Scanner(this.file);
        int count = lines();
        
        while(read.hasNextLine()) {
            String s = read.useDelimiter("").nextLine();
            count += s.length();
        }
        read.close();
        return count;
    }
    
}
