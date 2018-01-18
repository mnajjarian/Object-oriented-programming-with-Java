import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Give a string: ");
        String string = reader.nextLine();
        clockTime(string);
    }
    public static boolean isAWeekDay(String string) {
        if(string.matches("(mon|tue|wed|thu|fri|sat|sun)")) {
            System.out.println("The form is fine.");
            return true;
        }
        System.out.println("The form is wrong.");
        return false;
    }
    public static boolean allVowels(String string) {
        if(string.matches("[aeiouäö]*")) {
            System.out.println("The form is fine.");
            return true;
        }
        System.out.println("The form is wrong.");
        return false;
    }
     public static boolean clockTime(String string) {
         if(string.matches("([01][0123456789]|2[0123]):[012345][0123456789]:[012345][0123456789]")) {
             
             System.out.println("The form is fine.");
             return true;
             }
         
         System.out.println("The form is wrong");
         return false;
    
     }
         
}
