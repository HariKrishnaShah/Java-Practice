package substringprogram;

import java.util.*;
import java.io.*;

public class SubstringArrayList {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int count = 0;
        int num = 0;
        int i = 0;
        System.out.println("Enter the number of strings to put in the array: ");
        num = s.nextInt(); 
        
        ArrayList<String> arr = new ArrayList<String>();
        
        ArrayList<String> lastarr = new ArrayList<String>();
        
        ArrayList<String> sortedarr = new ArrayList<String>();
        
        String temp;
        
        System.out.println("Solving Buffer problem:");
        s.nextLine();
        while(count<num)
        {
            System.out.print("Enter the String number " + (count+1) +" :");
            temp = s.nextLine();
            
            if(temp.substring(2,4).equals("TN"))
            {
                arr.add(temp);
                count++; 
            }
            else
            {
                System.out.println("The car is not from Tamilnadu.");
            }
            
        }
        
        int tempint, tempint2;
        
        for(i = 0; i<arr.size(); i++)
        {
            
            tempint = arr.get(i).length()-4;
            tempint2 = arr.get(i).length();     
            lastarr.add(arr.get(i).substring(tempint, tempint2));
        }
        
        Collections.sort(lastarr);
        
        for(int x = 0; x<lastarr.size(); x++)
        {
            for(int y = 0; y<arr.size(); y++)
            {
                tempint = arr.get(y).length()-4;
                tempint2 = arr.get(y).length();
                if(lastarr.get(x).equals(arr.get(y).substring(tempint, tempint2)))
                {
                    sortedarr.add(arr.get(y));
                }
            }
        }
        
        System.out.println("The sorted String array according to the last 4 character is " + sortedarr);      
    }
}
