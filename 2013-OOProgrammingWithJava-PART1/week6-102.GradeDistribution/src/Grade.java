import java.util.Scanner;
public class Grade {
    String grade0 = "";
    String grade1 = "";
    String grade2 = "";
    String grade3 = "";
    String grade4 = "";
    String grade5 = "";
    int sum;
    double acrate;

public void doSomting(Scanner lukija) {
while (true) {
    int number = Integer.parseInt(lukija.nextLine());
    if (number == -1) {
        break;
    } else if (number >= 0 && number <= 29) {
        grade0 += "*";
    } else if (number >= 30 && number <= 34) {
        grade1 += "*";
    } else if (number >= 35 && number <= 39) {
        grade2 += "*";
    } else if (number >= 40 && number <= 44) {
        grade3 += "*";
    } else if (number >= 45 && number <= 49) {
        grade4 += "*";
    } else if (number >= 50 && number <= 60) {
        grade5 += "*";
    }
}
}
public void printStars() {
    System.out.println("Grade distribution: ");
    System.out.println("5: " + grade5);
    System.out.println("4: " + grade4);
    System.out.println("3: " + grade3);
    System.out.println("2: " + grade2);
    System.out.println("1: " + grade1);
    System.out.println("0: " + grade0);
}
public void sum() {
    sum = grade1.length() + grade2.length()
            + grade3.length() + grade4.length()
            + grade5.length() + grade0.length();

}
public void printAcceptance(){
    sum();
    if (sum == 0) {
        acrate = 0.0;
    } else {
        acrate = (sum - grade0.length()) * 100 / sum;
    }
    System.out.println("Acceptance percentage: " + acrate);
}
}
