package inheritance;
import java.util.*;

public class ConvertibleLaptop extends laptop {
    
    int number_of_sim;
    
    
    public void get()
    {
        Scanner s = new Scanner(System.in);
        super.get();
        System.out.println("Enter the number of sims supported: ");
        this.number_of_sim = s.nextInt();
    }
    
    public void display()
    {
        super.display();
        System.out.println("The number of sims supported is " + this.number_of_sim);
    }
}
