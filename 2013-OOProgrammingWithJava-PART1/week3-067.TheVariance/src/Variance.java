import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int l : list) {
            sum+=l;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double total = sum(list);
        double average = 0.0;
        return average = total / list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        double average = average(list);
        double var = 0.0;
        double varResult;
        
        for (int i : list) {
            var = var + Math.pow(i - average, 2);
        }
            varResult = var / (list.size() - 1);
        // write code here
        return varResult;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
