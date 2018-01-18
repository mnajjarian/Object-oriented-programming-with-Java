
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        
        int result = (int) Math.pow(1, 1);
        int number = 1;
        
        while (number <= n) {
        result += Math.pow(2, number);
        number++;
    }
        System.out.println("The result is " + result);
    }
}
    

