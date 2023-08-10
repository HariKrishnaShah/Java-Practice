package ayush;
import java.io.*;
import java.util.*;

//Without using classes and object Written by Hari Krishna Shah

//Note: Using Classes and Object is a better approach for this problem, however due to question requirement I have done this way.

public class StudentRecord {
    public static void main(String args[])
    {
        int size;
        System.out.print("Enter the number of students: ");
        Scanner s = new Scanner(System.in);
        size = s.nextInt();
        int roll[], subject1[], subject2[], subject3[], total_mark[], max_sub1, max_sub2, max_sub3;
        int max1_index = 0, max2_index = 0, max3_index = 0, max_total, max_total_index = 0;
        roll = new int[size];
        subject1 = new int[size];
        subject2 = new int[size];
        subject3 = new int[size];
        total_mark = new int[size];
        
        for(int i = 0; i<size; i++){
            System.out.println("Enter the details for Student number " + (i+1) + " below:");
            System.out.print("Enter the Roll number: ");
            roll[i] = s.nextInt();
            System.out.print("Enter the mark of subject 1: ");
            subject1[i] = s.nextInt();
            System.out.print("Enter the mark of subject 2: ");
            subject2[i] = s.nextInt();
            System.out.print("Enter the mark of subject 3: ");
            subject3[i] = s.nextInt();
            total_mark[i] = subject1[i] + subject2[i] + subject3[i];
            System.out.println();
            
        }
        max_sub1 = subject1[0];
        max_sub2 = subject2[0];
        max_sub3 = subject3[0];
        max_total = 0;
        for(int i = 0; i<size; i++)
        {
           if(max_sub1<subject1[i])
           {
               max_sub1 = subject1[i];
               max1_index = i;
           }
           if(max_sub2<subject2[i])
           {
               max_sub2 = subject2[i];
               max2_index = i;
           }
           if(max_sub3<subject3[i])
           {
               max_sub3 = subject3[i];
               max3_index = i;
           }
           if(max_total<total_mark[i])
           {
               max_total = total_mark[i];
               max_total_index = i;
           }
           
        }
        try{
            System.out.println("\n");
            System.out.println("The max marks in subject1 is " + max_sub1 + " Roll number " + roll[max1_index] + " got the highest mark.");
            System.out.println("The max marks in subject2 is " + max_sub2 + " Roll number " + roll[max2_index] + " got the highest mark.");
            System.out.println("The max marks in subject3 is " + max_sub1 + " Roll number " + roll[max3_index] + " got the highest mark.");
            System.out.println("The max total marks is " + max_total + " Roll number " + roll[max_total_index] + " got the highest mark.\n\n");
            System.out.println("The details of students are displayed below.");
            
            for(int i = 0; i<size; i++)
            {
                System.out.println("Details of student number " + (i+1) + ": ");
                System.out.println("Roll number: " + roll[i]);
                System.out.println("Subject1 Marks: " + subject1[i]);
                System.out.println("Subject2 Marks: " + subject2[i]);
                System.out.println("Subject3 Marks: " + subject3[i]);
                System.out.println("Total Marks: " + total_mark[i]);
                System.out.println("\n");
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
       
        
    }
}
