package MultipleInheritance;
import java.util.*;

public class spectacle implements frame, lens
{
    double power;
    String color;
    public void getpower()
    {
        {
            this.greetlens();
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the power of the spectacle: ");
            this.power = s.nextDouble(); 
        }
        
    }
    
    public void getcolor()
    {
        this.greetframe();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the color of the spectacle: ");
        this.color = s.nextLine();
    }
    
    public void displaypower()
    {
        System.out.println("The power of the lens is " + this.power);
    }
    
    public void displaycolor()
    {
        System.out.println("The color of the frame is " + this.color);
    }
    
    public void display()
    {
        this.displaycolor();
        this.displaypower();
    }
        
    
    public static void main(String args[])
    {
        System.out.println("Spectacle Details");
        spectacle s = new spectacle();
        s.getpower();
        s.getcolor();
        s.display();
        
        System.out.println("\nDemonstration of static method in JAVA");
        frame.hello();
    }
}