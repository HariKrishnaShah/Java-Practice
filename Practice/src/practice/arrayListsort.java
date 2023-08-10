import java.io.*;
import java.util.*;
import java.util.stream.*;
public class arrayListsort {
    public static void main(String args[])
    {
        ArrayList <String> arr = new ArrayList();
        arr.add("Hari");
        arr.add("Hot");
        arr.add("Helicopter");
        
        Collections.sort(arr);
        System.out.println(arr);
        
        System.out.println("The element at index 0 is " + arr.get(0));
        
        
        
    }
}
