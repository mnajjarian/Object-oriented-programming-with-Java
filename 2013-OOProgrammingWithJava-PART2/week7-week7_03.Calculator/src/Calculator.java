
public class Calculator {
    private Reader reader;
    private int i;
    
    public Calculator() {
        this.reader = new Reader();
    }
    public void start() {
        while(true) {
        System.out.println("command: ");
        String command = reader.readString();
        if(command.equals("end")) {
            break;
        }
        if(command.equals("sum")) {
            sum();
        } else if(command.equals("difference")) {
            difference();
        } else if (command.equals("product")) {
            product();
        }
    }
    statistics();
}

    private void sum() {
        System.out.println("value1: ");
        int v1 = reader.readInteger();
        System.out.println("value2: ");
        int v2 = reader.readInteger();
        int sum = v1 + v2;
        System.out.println("sum of values " + sum);
        i++;
   
    }
    private void difference() {
        System.out.println("value1: ");
        int v1 = reader.readInteger();
        System.out.println("value2: ");
        int v2 = reader.readInteger();
        int difference = v1 - v2;
        System.out.println("difference of values " + difference);
        i++;
    }
    private void product() {
        System.out.println("value1: ");
        int v1 = reader.readInteger();
        System.out.println("value2: ");
        int v2 = reader.readInteger();
        int product = v1 * v2;
        System.out.println("product of values " + product);
        i++;
    }
    private void statistics() {
        System.out.println("calculation done " + this.i);
    }
}
