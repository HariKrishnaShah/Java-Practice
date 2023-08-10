import java.util.*;
  
class IntegerArray {
    public static void main(String[] args)
    {
  
        // Initializing the array
        Integer array[] = { 1, 2, 3, 4, 5 };
  
        // Sorting the array in descending order
        Arrays.sort(array, Collections.reverseOrder());
  
        // Printing the elements
        System.out.println("The sorted array in descending order is " + Arrays.toString(array));
    }
}