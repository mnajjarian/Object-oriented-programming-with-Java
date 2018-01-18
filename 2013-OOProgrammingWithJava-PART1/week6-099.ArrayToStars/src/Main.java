
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int star = array[i];
            for(int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println("");
        } 
    }
}
