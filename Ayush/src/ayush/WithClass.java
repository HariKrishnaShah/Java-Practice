package ayush;

import java.util.*;

public class WithClass {
    public static void main(String args[])
    {
        int size;
        int sub1_max, sub1_max_index, sub2_max, sub2_max_index, sub3_max, sub3_max_index, total_max, total_max_index;
        sub1_max_index = 0;
        sub2_max_index = 0;
        sub3_max_index = 0;
        System.out.println("Enter the number of students: ");
        Scanner scan = new Scanner(System.in);
        size = scan.nextInt();
        students s[] = new students[size];
       
        for(int i = 0; i<size; i++)
        {
            s[i].read();
        }
        
        sub1_max = s[0].sub1();
        sub2_max = s[0].sub2();
        sub3_max = s[0].sub3();
        total_max = s[0].total();
        
        //Finding max for all three subject and max total
        for(int i = 0; i<size; i++)
        {
            if(sub1_max < s[size].sub1())
            {
                sub1_max = s[size].sub1();
                sub1_max_index = size;
            }
            if(sub2_max < s[size].sub2())
            {
                sub2_max = s[size].sub2();
                sub2_max_index = size;
            }
            if(sub3_max < s[size].sub3())
            {
                sub3_max = s[size].sub3();
                sub3_max_index = size;
            }
            if(total_max < s[size].total())
            {
                total_max = s[size].total();
                total_max_index = size;
            }  
        }
        
        System.out.println("Roll number " + s[sub1_max_index] + " obtained max marks for Subject 1 is " + sub1_max);
        System.out.println("Roll number " + s[sub2_max_index] + " obtained max marks for Subject 2 is " + sub2_max);
        System.out.println("Roll number " + s[sub3_max_index] + " obtained max marks for Subject 3 is " + sub1_max);
        
        for(int i = 0; i<size; i++)
        {
            s[i].display();
            System.out.println();
        }
         
    }
}
