import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics all = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        
        System.out.println("Type numbers: ");
        
        int num = 0;
        while (num != -1) {
            num = Integer.parseInt(reader.next());
    
            if (num != -1) {
                all.addNumber(num);
                
                if (num %2 == 0) {
                    even.addNumber(num);
                } else {
                    odd.addNumber(num);
                }
                }
        }
                System.out.println("Sum: " + all.sum());
                System.out.println("Sum of even: " + even.sum());
                System.out.println("Sum of odd: " + odd.sum());
            }
            
        } 
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order

