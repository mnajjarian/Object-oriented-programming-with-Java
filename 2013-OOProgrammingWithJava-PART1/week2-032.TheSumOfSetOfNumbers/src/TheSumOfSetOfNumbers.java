
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Until what? ");
        int read = Integer.parseInt(reader.nextLine());
        
        int result = 0;
         int number = 1;
          while (number <= read) {
              System.out.println(number);
              result += number;
              number++;
          }
          System.out.println("Sum is " + result);

    }
}
