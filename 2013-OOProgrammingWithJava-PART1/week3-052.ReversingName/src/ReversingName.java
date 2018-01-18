import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        System.out.print("In reserve order: ");
        
        int i = 1;
        while (i <= name.length()) {
            System.out.print(name.charAt(name.length()-i));
            i++;
        }
        System.out.println();
    }
}
