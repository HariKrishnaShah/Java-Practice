package substringprogram;

import java.util.*;
import java.io.*;

public class SubstringProgram {

    
    public static void main(String[] args) {
        
        String temp;  
        Scanner s = new Scanner(System.in);
        int size = 0;
        int num = 0;
        System.out.println("Enter the number of elements of the string array: ");
        size = s.nextInt();
        
        String arr[] = new String[size];
        
        
        String lastarr[] = new String[size];
        String sortedarr[] = new String[size];
      
        
        
        System.out.println("Solving buffer problem.");
        s.nextLine();
        
        
         System.out.println("Enter the strings: ");
        while(num<size)
        {
            temp = s.nextLine();
            if(temp.substring(2,4).equals("TN"))
            {
                arr[num] = temp;
                num++;
            }
            else
            {
                System.out.println("The Car is not from Tamilnadu.");
            }
            
        }
        
        for(int i = 0; i<size; i++)
        {
            int tempint;
            tempint = arr[i].length() - 4;
            lastarr[i] = arr[i].substring(tempint, arr[i].length());
        }
        
       for(int i = 0; i < size; i++)
       {
           for(int y = i+1; y<size; y++)
           {
               if((lastarr[y].compareTo(lastarr[i]))<0)
               {
                   temp = lastarr[i];
                   lastarr[i] = lastarr[y];
                   lastarr[y] = temp;
               }
           }
       }
        
        System.out.println("The sorted subarray is " + Arrays.toString(lastarr));
        
        for(int i = 0; i<size; i++)
        {
            for(int j = 0; j<size; j++)
            {
                temp = arr[j].substring(arr[j].length()-4, arr[j].length());
                if(lastarr[i].equals(temp))
                {
                    sortedarr[i] = arr[j];
                }
            }
        }
        
        System.out.println("Sorted array is according to the last 4 digits is: " + Arrays.toString(sortedarr));
        
    }
    
}
