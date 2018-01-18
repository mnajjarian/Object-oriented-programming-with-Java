
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Mikael");
        printWithSmileys("Arto");
        //printWithSmileys("Beerbottle");
        //printWithSmileys("Interface");
    }
    private static void printWithSmileys(String characterString) {
        int length = characterString.length();
        String smile = ":)";
        if (length % 2 == 0 && length > 4) {
            printSmiley(length);
            System.out.println(smile + " " + characterString + " " + smile);
            printSmiley(length);
        } 
        if (length % 2 == 0 && length <= 4) {
            printSmiley(length + 1);
            System.out.println(smile + " " + characterString + " " + smile);
            printSmiley(length + 1);
        }
        if (length % 2 == 1) {
            printSmiley(length + 1);
            System.out.println(smile + " " + characterString + "  " + smile);
            printSmiley(length + 1);
        }
    }
    private static void printSmiley(int length) {
        String smile = ":)";
        for (int i = 0; i < length; i++) {
            System.out.print(smile);
        }
        System.out.println("");
}
}
