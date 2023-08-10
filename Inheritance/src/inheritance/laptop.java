package inheritance;

import java.util.*;

public class laptop extends computer {
    int battery_size;
    
    public void get()
    {
        Scanner s = new Scanner(System.in);
        super.get();
        System.out.println("Enter the battery size: ");
        this.battery_size = s.nextInt();
    }
    
    public void display()
    {
        super.display();
        System.out.println("The battery size is: " + this.battery_size);
    }
}
