package javaapplication4;
import java.util.*;

//Hari Krishna Shah

public class StringProgram {
    public static void main(String args[])
    {
        try{
           char [] from = {'H', 'A', 'R', 'I' , 'K' , 'R', 'I', 'S', 'H', 'N', 'A'};
           char [] to = new char[11];
           System.arraycopy(from, 6, to, 0, 5 );
           System.out.println("The resultant array is " + String.valueOf(to));
           System.out.println(Arrays.toString(to));
        }
        catch(Exception e)
        {
            
        }
    }
}
