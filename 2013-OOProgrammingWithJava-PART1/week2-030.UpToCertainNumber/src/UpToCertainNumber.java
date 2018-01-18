
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Up to what number? ");
        int read = Integer.parseInt(reader.nextLine());
        
        int number = 1;
        while (number <= read) {
            System.out.println(number);
            number++;
        }
        
    }
}
