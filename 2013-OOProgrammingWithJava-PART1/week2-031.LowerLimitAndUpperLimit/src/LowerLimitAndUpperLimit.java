
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
        
         System.out.print("Last: ");
         int last = Integer.parseInt(reader.nextLine());
         
         int number = first;
         while (number >= first && number <= last) {
             System.out.println(number);
             number++;
         }

    }
}
