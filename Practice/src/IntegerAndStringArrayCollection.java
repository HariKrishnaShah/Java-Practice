import java.io.*;
import java.util.*;
public class IntegerAndStringArrayCollection {
    public static void main(String args[])
    {
        Integer a[] = new Integer[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 5 Integer array elements");
        for(int i = 0; i<5; i++){
            a[i] = s.nextInt();
        }
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("Array is " + Arrays.toString(a));
        
        String z[] = {"Hari", "Krishna", "Shah"};
        
        Arrays.sort(z);
        System.out.println("The sorted array in ascending order is" +  Arrays.toString(z));
        Arrays.sort(z, Collections.reverseOrder());
        
        System.out.println("The String array sorted in reverse order is " + Arrays.toString(z));
       
    }
}
