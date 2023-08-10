package inheritance;

public class test {
    public static void main(String args[])
    {
        System.out.println("Laptop Details");
        laptop l = new laptop();
        l.get();
        l.display();
        
        System.out.println("\nDesktop Details");
        desktop d = new desktop();
        d.get();
        d.display();
        
        System.out.println("\nConvertible Laptop");
        ConvertibleLaptop cl = new ConvertibleLaptop();
        cl.get();
        cl.display();
        
    }
}
