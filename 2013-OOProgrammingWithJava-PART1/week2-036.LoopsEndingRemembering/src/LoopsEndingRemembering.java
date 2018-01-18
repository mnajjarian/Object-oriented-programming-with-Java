import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        
        int num = 0;
        double sum = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
        }
            sum += number;
            num++;
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            }
        System.out.println("Thank you and see you later!");
        int intsum = (int)sum;
        System.out.println("The sum is: " + intsum);
        double average = sum / num;
        System.out.println("How many numbers: " + num);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odds number: " + odd);
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

    }
}
