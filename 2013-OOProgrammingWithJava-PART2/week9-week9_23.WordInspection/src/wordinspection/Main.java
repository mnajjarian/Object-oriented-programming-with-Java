package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        

        File file = new File("src/shortList.txt");
        WordInspection s = new WordInspection( new File("src/shortList.txt") );
        s.wordsContainingZ();
        // all words are in file src/wordList.txt

    }
}
