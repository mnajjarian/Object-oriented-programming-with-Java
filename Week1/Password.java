
import java.util.Scanner;

public class Password {

   
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot";
        
while (true) {
    System.out.print("Type the password: ");
    password = reader.nextLine();
    
     if (password.equals("carrot")) {
        System.out.println("Right!");
        System.out.println("The secret is: jryy qbar");
       break;
     }
         
     
         System.out.println("Wrong!");
}
    }
}

