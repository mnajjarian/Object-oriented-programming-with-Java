import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print(" Type the first number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        
        System.out.print(" Type the second number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        
        System.out.println("");
        
        if (firstNumber > secondNumber) {
            System.out.println(" Greater number: " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println(" Greater number: " + secondNumber);
        } else {
            System.out.println(" The numbers are equal! ");
        }

    }
}
