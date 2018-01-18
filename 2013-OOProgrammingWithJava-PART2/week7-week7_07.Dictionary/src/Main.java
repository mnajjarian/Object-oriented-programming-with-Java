
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TextUserInterface t = new TextUserInterface(new Scanner(System.in), 
        new Dictionary());
        t.start();
        
            /*Scanner reader = new Scanner(System.in);
	    Dictionary dict = new Dictionary();

	    TextUserInterface ui = new TextUserInterface(reader, dict);
	    ui.start();*/
    }
}
