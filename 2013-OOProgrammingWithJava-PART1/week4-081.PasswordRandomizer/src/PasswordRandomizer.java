import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        this.length = length;
        //this.random.nextInt(length);
        // Initialize the variable
    }

    public String createPassword() {
        String a = "";
        int i = 0;
        while (i < this.length) {
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(this.random.nextInt(26));
            i++;
            a += symbol;
        }
        
        // write code that returns a randomized password
        return a;
    
    }
}
