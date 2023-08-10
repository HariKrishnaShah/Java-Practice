
package practice;
import java.util.*;
public class subclass1 extends car{
    String subclass1data;
    void get()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter subclass data");
        subclass1data = s.nextLine();
    
        
    }
    void display()
    {
        System.out.println("The subclass2 data is " + subclass1data);
    }
}
