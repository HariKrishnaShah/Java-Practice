/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructors;

/**
 *
 * @author Hari
 */
public class cars {
        
    int price;
    String model;
    
    cars()
    {
        this.price = 100000;
        this.model = "Sedan x80";
        
    }
    
    cars(int p, String n)
    {
        this.price = p;
        this.model = n;
    }
    
    cars(cars i)
    {
        this.price = i.price;
        this.model = i.model; 
    }
    
    public void modify(cars i)
    {
        i.price = 10000;
        i.model = "Modified";
    }
    
    public void display()
    {
        System.out.println("Price: " + this.price);
        System.out.println("Model: " + this.model);
        
    }
     
}
