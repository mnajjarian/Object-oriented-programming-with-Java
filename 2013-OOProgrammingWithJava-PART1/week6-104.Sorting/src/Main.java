import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("smallest: " + smallest(values));
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
    }
    public static int smallest(int[] array) {
        int small = array[0];
        for(int i = 0; i < array.length; i++) {
            if(small > array[i]) {
                small = array[i];
            }
        }
            return small;
        }
    public static int indexOfTheSmallest(int[] array) {
        int index = 0;
        int small = array[0];
        for(int i = 0; i < array.length; i++) {
            if(small > array[i]) {
                small = array[i];
                index = i;
            }
        }
        return index;
    }
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int small = array[index];
        for(int i = index; i < array.length; i++) {
            if(small <= array[i]) {
                
            } else {
                small = array[i];
                index = i;
            }
        }
        return index;
    }
    public static void swap(int[] array, int index1, int index2) {

        int swap1 = array[index1];
        int swap2 = array[index2];
        
        array[index1] = swap2;
        array[index2] = swap1;
    }
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int smallestIndex = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallestIndex);
        }
    }
}
