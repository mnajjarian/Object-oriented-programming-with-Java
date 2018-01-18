import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int read = Integer.parseInt(reader.nextLine());
        
        int result = 1;
        int number = 1;
        
        while (number <= read) {
            result *= number;
            number++;
        }
        System.out.println("Factorial is " + result);

    }
}
