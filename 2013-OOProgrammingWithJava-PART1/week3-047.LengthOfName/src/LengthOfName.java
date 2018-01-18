
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
        int answer = calculateCharacters(name);
        System.out.println("Number of characters: " + answer);
        // call your method from here
    }
    
    // do here the method
    public static int calculateCharacters(String text) {
        int textLen;
        textLen = text.length();
        return textLen;
    }
    
}
