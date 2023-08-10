package code;
import java.util.*;
import java.io.*;

/**
 *
 * @author Hari
 */
public class Code {
    String name, id;
    
    void get()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = s.nextLine();
         System.out.println("Enter Id: ");
        id = s.nextLine();
        
    }
    
    void display()
    {
        System.out.println("Name is " + name + " and Id is " + id);
    }
    public static void main(String[] args) {
        Code c1 = new Code();
        c1.get();
        c1.display();
    }
    
}
