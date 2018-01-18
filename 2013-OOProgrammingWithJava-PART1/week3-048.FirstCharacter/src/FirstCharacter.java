import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String text = reader.nextLine();
        System.out.print("First character: " + firstCharacter(text));
    }
    public static char firstCharacter(String text) {
        return text.charAt(0);
    }
}
