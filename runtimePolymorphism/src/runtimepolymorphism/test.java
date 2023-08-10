package runtimepolymorphism;

public class test
{
    public static void main(String args[])
    {
        area a1 = new circle();
        area a2 = new rectangle();
        area a3 = new triangle();
        double x = a1.getarea();
        double y = a2.getarea();
        double z = a3.getarea();
        System.out.println("Demonstration of Runtime Polymorphism");
        System.out.println("Printing the values returned after calling getarea method by upcasted objects.");
        System.out.println("area of circle: " + x+"\n area of rectangle: "+y+"\n area of triangle: "+z);
       
          
        circle c = new circle();
        rectangle t = new rectangle();
        triangle tri = new triangle();
        
        //Overridding
        area a = new area();     // area object  
        area b = new circle();  // circle object upcasted to area object
        
        System.out.println("\narea object calling display method.");
        a.display();
        System.out.println("circle object upcasted to area object calling display method.");
        b.display();
        
        
        double i = c.getarea(30);
        double j = t.getarea(10,20);
        double k = tri.getarea(8,20);
        
        System.out.println("\nPrinting the values returned after calling getarea method(passing agruments) by non casted objects.");
        System.out.println("area of circle: " + i+"\n area of rectangle: "+j+"\n area of triangle: "+k);
        
        double l = c.getarea();
        double m = t.getarea();
        double n = tri.getarea();
        
        System.out.println("\nDemonstration of Compiletime Polymorphism");
        System.out.println("Printing the values returned after calling getarea method(without passing agruments) by non casted objects.");
        System.out.println("area of circle: " + l+"\n area of rectangle: "+m+"\n area of triangle: "+n);
        
        
    }
}