
package practice;



public class billing extends car
{
    public static void main(String args[])
    {
        billing b = new billing();
        b.type = "car";
        b.name = "ford";
        b.model = "Sedan";
        
        System.out.println(b.type);
        System.out.println(b.name);
        System.out.println(b.model);
        System.out.println(b.price);
    }
}