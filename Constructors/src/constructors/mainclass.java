/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructors;

/**
 *
 * @author Hari
 */
public class mainclass {
    public static void main(String args[])
    {
        cars obj1 = new cars();
        System.out.println("Default Constructor");
        obj1.display();
        
        cars obj2 = new cars(800000, "XUV 780");
        System.out.println("\nParameterized Constructor");
        obj2.display();
        
        cars obj3 = new cars(obj2);
        System.out.println("\nCopy Constructor");
        obj3.display();
        
        
        System.out.println("\nModify obj3 by calling modfiy method through obj2");
        obj2.modify(obj3);
        obj3.display();
        
    }
}
