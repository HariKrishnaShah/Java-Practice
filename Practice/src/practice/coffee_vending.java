/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;
import java.util.*;
import java.io.*;
/**
 *
 * @author Hari
 */
public class coffee_vending {
    public static void main(String args[])
    {
        int option;
        do{
        System.out.println("Enter an option from menu below: ");
        System.out.println("Enter 1 to order Capacinno");
        System.out.println("Enter 2 to order regular coffee");
        System.out.println("Enter -1 to exit");
        System.out.print("Enter your option here: ");
        Scanner s = new Scanner(System.in);
        option = s.nextInt();
        
        switch(option)
        {
            case 1: System.out.println("Here is your Capacinno");
                    break;
            case 2: System.out.println("Here is your regular coffee");
                    break;
            case -1: System.out.println("Thank you for visitng us. See you Soon");
                    break;
            default: System.out.println("Please enter a valid option");
        }
        System.out.println();
       }
       while(option !=-1);
        
    }
}
