package inheritance;
import java.util.*;

public class desktop extends computer {
    int PSU_rating;
    
    public void get()
    {
        Scanner s = new Scanner(System.in);
        super.get();
        System.out.println("Enter the PSU rating: ");
        this.PSU_rating = s.nextInt();
    }
    
    public void display()
    {
       super.display();
       System.out.println("PSU rating: " + this.PSU_rating);
    }
}
