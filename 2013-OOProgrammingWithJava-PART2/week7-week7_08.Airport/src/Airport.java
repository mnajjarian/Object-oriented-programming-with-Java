
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Airport {
    private final Scanner scanner;
    private final Map<String, String> planeList;
    private final List<String> routs;
    
    public Airport() {
       scanner = new Scanner(System.in);
       this.planeList = new HashMap<String, String>();
       this.routs = new ArrayList<String>();
    }
    public void start() {
        startPlane();
        flightService();
    }

    public void startPlane() {
       while(true) {
           System.out.println("Choose operation:\n" +
"[1] Add airplane\n" +
"[2] Add flight\n" +
"[x] Exit\n" +
">"); 
       String input = scanner.nextLine();
            if(input.equals("x")) {
                break;
            } else if(input.equals("1")) {
                plane();
            } else if(input.equals("2")) {
                flight();
            }
        }
    }

    public void plane() {
        System.out.print("Give plane ID: ");
        String id = scanner.nextLine();
        System.out.print("Give plane capacity: ");
        String capacity = scanner.nextLine();
        planeList.put(id, capacity);
    }

    public void flight() {
        System.out.print("Give plane ID: ");
        String id = scanner.nextLine();
        System.out.print("Give departure airport code: ");
        String dep = scanner.nextLine();
        System.out.print("Give destination airport code: ");
        String dest = scanner.nextLine();
        String rout = dep + "-" + dest;
        for(String plane : planes()) {
            if(plane.contains(id)) {
                this.routs.add(plane + " (" + rout + ")");
            }
        }  
    }

    public void flightService() {
        System.out.println("Flight service\n" +
"------------");
        
        while(true) {
            System.out.println("Choose operation:\n" +
"[1] Print planes\n" +
"[2] Print flights\n" +
"[3] Print plane info\n" +
"[x] Quit");
            String input = scanner.nextLine();
            if(input.equals("x")) {
                break;
            } else if(input.equals("1")) {
                printPlanes();
            } else if(input.equals("2")) {
                printFlights();
            } else if(input.equals("3")) {
                printInfo();
            }
        }
    }

    public ArrayList<String> planes() {
        ArrayList<String> print = new ArrayList<String>();
        for(String keys : this.planeList.keySet()) {
            String s = keys + " (" + this.planeList.get(keys) + " ppl)";
            print.add(s);
        }
        return print;
    }
    public void printPlanes() {
        for(String p : planes()) {
            System.out.println(p);
        }
        System.out.println("");
    }
    public void printFlights() {
        for(String p : this.routs) {
            System.out.println(p);
        }
        System.out.println("");
    }

    private void printInfo() {
        List<String> info = new ArrayList<String>();
        System.out.print("Give plane ID: ");
        String id = scanner.nextLine();
        String s = id + " (" + planeList.get(id) + " ppl)";
        info.add(s);
        for(String p : info) {
            System.out.println(p);
        }
    }
}
