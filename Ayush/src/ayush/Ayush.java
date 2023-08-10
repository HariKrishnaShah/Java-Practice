package ayush;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ayush {
    public static void main(String[] args) {
        int limit = 0;
        String l;
        int term, term1 = 0, term2 = 1;
        int i = 1;
   
        System.out.print("Enter the limit: ");
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(input);
        
        try {
            limit = Integer.valueOf(buff.readLine());
        } catch (IOException ex) {
           System.out.println(ex);
        }
        
        while(i<=limit)
        {
            if(i == 1){
                System.out.println(term1 + " ");
            }
            else if(i == 2){
                System.out.println(term2 + " ");
            }
            else{
                term = term1 + term2;
                term1 = term2;
                term2 = term;
                
                
                System.out.println(term + " ");
            }
            i = i +1;
        }
        
        
        
        
    }
    
}
