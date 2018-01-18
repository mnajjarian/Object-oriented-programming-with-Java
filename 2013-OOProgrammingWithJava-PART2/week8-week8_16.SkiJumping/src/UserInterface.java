
import java.util.Scanner;


public class UserInterface {
    private Scanner reader;
    private Jumpers jumper;
    private int round = 0;
    
    public UserInterface() {
        this.reader = new Scanner(System.in);
        this.jumper = new Jumpers();
        
        
    }
    public void skiJumping() {
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants"
                + "one at a time; an empty string brings you to the jumping phase.");
        while(true) {
            System.out.print("Participant name: ");
            String name = reader.nextLine();
            if(name.isEmpty()) {
                break;
                //jumper.print();
            }
            jumper.addJumper(name);
            
        }
        tournament();
    }

    private void tournament() {
        System.out.println("\nThe tournament begins!\n");
        while(true) {
        System.out.print("Write \"jump\" to jump; otherwise you quit: ");
        String choice = reader.nextLine();
        if(choice.equals("quit")) {
            System.out.println("Thanks!");
            result();
        }
        round++;
        rounds();
        
        }
    }

    private void result() {
        
        System.out.println("Position    Name");
        System.out.println(round + "           " + jumper.getPoints() + "points");
    }

    private void rounds() {
        System.out.println("Round " + round);
        System.out.println("Jumping order: ");
        jumper.printJumpingOrder();
        System.out.println("Results of round " + round);
        for (String jumper : jumper.jumperNames()) {
            System.out.println(jumper);
        }
        
    }
}