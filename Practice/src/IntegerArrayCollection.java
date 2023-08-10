import java.io.*;
import java.util.*;

public class IntegerArrayCollection {
    public static void main(String args[])
    {
        int a[] = {1,50,2,0,3};
        int i = 0;
        
        Integer b[] = new Integer[a.length];
        
        for(int c:a)
        {
           
            b[i] = c;
            i++;
        }
        
        
       
        Arrays.sort(b, Collections.reverseOrder());
        
        System.out.println("The sorted array in descending order is: " + Arrays.toString(b));
        
        
        
        
      
      
        
        
        
        
        
        
}
}
