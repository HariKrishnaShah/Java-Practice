import java.util.*;
public class eligible {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int age1 = s.nextInt();
        int age2 = s.nextInt();
        
        int greater;
        greater = (age1>age2)?age1:age2;
        System.out.println("The greater age is " + greater);
        
    }
}
