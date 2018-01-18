
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        
        System.out.println("seconds: ");
        int s =	reader.nextInt();
        System.out.println("minutes: ");
        int m = reader.nextInt();
        System.out.println("hours: ");
        int h = reader.nextInt();
        
        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);
        
        int i = 0;
        while (i < 121) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            
            if (seconds.getValue() == 59) {
                if (minutes.getValue() == 59) {
                    hours.next();
                }
                minutes.next();
                seconds.next();
            } else {
                seconds.next();
            }
            i++;
        }
        
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment

    }
}
