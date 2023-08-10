package inheritance;

import java.util.*;

public class computer {
    
    int price;
    String model;
    
    public void get()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the model of the computer: ");
        this.model = s.nextLine();
        System.out.println("Enter the price of the computer:  ");
        this.price = s.nextInt();
       
    }
    
    public void display()
    {
        System.out.println("Price: " + this.price);
        System.out.println("Model: " + model);
    }
            
   
    
}
