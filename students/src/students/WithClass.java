package students;

//Coded by Hari Krishna Shah

import java.util.*;

public class WithClass {
    public static void main(String args[])
    {
        int size;
        int sub1_max, sub1_max_index, sub2_max, sub2_max_index, sub3_max, sub3_max_index, total_max, total_max_index;
        sub1_max_index = 0;
        sub2_max_index = 0;
        sub3_max_index = 0;
        total_max_index = 0;
        System.out.print("Enter the number of students: ");
        Scanner scan = new Scanner(System.in);
        size = scan.nextInt();
        students s[] = new students[size];
        
        for(int i = 0; i<size; i++)
        {
            s[i] = new students();
        }
        
        
        
       
        for(int i = 0; i<size; i++)
        {
            System.out.println("Enter the details for student number " + (i+1) + " below ");
            s[i].read();
            System.out.println();
        }
        
        sub1_max = s[0].sub1();
        sub2_max = s[0].sub2();
        sub3_max = s[0].sub3();
        total_max = s[0].total();
        
        //Finding max for all three subject and max total
        for(int i = 0; i<size; i++)
        {
            if(sub1_max < s[i].sub1())
            {
                sub1_max = s[i].sub1();
                sub1_max_index = i;
            }
            if(sub2_max < s[i].sub2())
            {
                sub2_max = s[i].sub2();
                sub2_max_index = i;
            }
            if(sub3_max < s[i].sub3())
            {
                sub3_max = s[i].sub3();
                sub3_max_index = i;
            }
            if(total_max < s[i].total())
            {
                total_max = s[i].total();
                total_max_index = i;
            }  
        }
        System.out.println();
        System.out.println("Roll number " + s[sub1_max_index].roll() + " obtained max marks for Subject 1 is " + sub1_max);
        System.out.println("Roll number " + s[sub2_max_index].roll() + " obtained max marks for Subject 2 is " + sub2_max);
        System.out.println("Roll number " + s[sub3_max_index].roll() + " obtained max marks for Subject 3 is " + sub1_max);
        System.out.println();
        for(int i = 0; i<size; i++)
        {
            s[i].display();
            System.out.println();
        }
         
    }
}
