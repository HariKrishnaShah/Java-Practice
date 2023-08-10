package students;

//Coded by Hari Krishna Shah
import java.util.Scanner;

public class students{
    private int roll;
    public int subject[];
    private int total = 0;
    
    public students()
    {
        subject = new int[3];
    }
    
    public void read()
    {
        System.out.print("Enter roll number: ");
        Scanner f = new Scanner(System.in);
        roll = f.nextInt();
        System.out.println("Enter 3 subject marks: ");
        
        for(int i = 0; i<3; i++)
        {
            System.out.print("Enter subject " + i + " marks: ");
            subject[i] = f.nextInt();
        }
        for(int i = 0; i<3; i++){
            total += subject[i];
        }
    }
    
    public void display()
    {
        System.out.println("Roll number: " + roll);
        for(int i = 0; i<3; i++)
        {
            System.out.println("Subject " + i +  " marks :" + subject[i]); 
        }
        System.out.println("Total Marks: " + total);
    }
    
    public int sub1()
    {
        return subject[0];
    }
    public int sub2()
    {
        return subject[1];
    }
    public int sub3()
    {
        return subject[2];
    }
    public int total()
    {
        return total;
    }
    public int roll()
    {
        return roll;
    }
    
}