
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        
        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.equals("")) {
                break;
            } 
                System.out.print("studentnumber: ");
                String studentNumber = reader.nextLine();
                Student person = new Student(name, studentNumber);
                list.add(person);
            }
        for (Student i : list) {
            System.out.println(i.toString());
        }
        System.out.println("Given search term: ");
        String term = reader.nextLine();
        System.out.println("Result: ");
        
        for (Student l : list) {
            if (l.getName().contains(term)) {
                System.out.println(l);
            }
        }
        // write here the main program
    }
}