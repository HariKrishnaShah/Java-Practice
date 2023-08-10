import java.io.*;
import java.util.*;

class program {
    public static void main(String args[])
    {
        Integer a[] = {1,4,8,9, 50,0};
        
       // Arrays.sort(a); // Sort in Ascending Order
         Arrays.sort(a, Collections.reverseOrder());
        System.out.println("Array is " + Arrays.toString(a));
        
    }
            
}
