
import hangman.Hangman;
import java.util.Scanner;

public class HangmanUserInteface {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("***********");
        System.out.println("* HANGMAN  *");
        System.out.println("***********");
        System.out.println("");
        printMenu();
        System.out.println("");
        
       
        while (hangman.gameOn()){
            System.out.println("Type a command: ");
            String comm = reader.nextLine();
           
             if (comm.equals("quit")) {
                 System.out.println("Thank you for playing!");
                         break;
             } else if(comm.length() == 1) {
                 hangman.guess(comm);
                 hangman.printMan();
                 hangman.printWord();
                 
             } else if (comm.equals("")) {
                         printMenu();
                         
                         
             } else if (comm.equals("status")) {
                 hangman.printStatus();
             System.out.println("");
             
             }
             hangman.printMan();
             hangman.printWord();
        }
            
        }

         
        // PROGRAM YOUR SOLUTION HERE


        //System.out.println("Thank you for playing!");


    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}

