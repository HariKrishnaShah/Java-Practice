
package practice;
import java.util.*;
public class Subclass2 {
    String subclass2data;
    
    void get()
    {
        Scanner s = new Scanner(System.in);
        subclass2data = s.nextLine();
    }
    
    void display()
    {
       
        System.out.println("The subclass2 data is " + subclass2data);
    }
}
