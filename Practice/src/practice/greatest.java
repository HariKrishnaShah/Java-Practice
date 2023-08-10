package practice;

public class greatest {
    public static void main(String args[])
    {
        int a, b, c, greatest;
        
        a = 1;
        b = 12;
        c = 4;
        
        greatest = a>b?(a>c?a:c):(b>c?b:c);
        
        System.out.println("The greatest number is : " + greatest);
        
    }
}
