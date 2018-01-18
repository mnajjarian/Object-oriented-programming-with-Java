import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a word: ");
        String text = reader.nextLine();
        
        System.out.print("Length of the word: ");
        int length = Integer.parseInt(reader.nextLine());
        
        int i = text.length() - length;
        System.out.println("Result: " + text.substring(i));
    }
}
