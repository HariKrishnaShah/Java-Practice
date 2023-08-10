package abstractprogram;


//Coded by Hari Krishna Shah

/**
 *
 * @author Hari
 */
public class MainclassAbstract {
    
    public static void main(String args[])
    {
        System.out.println("Creating and Running ChildClass object");
        ChildClass c = new ChildClass();
        c.increasecount();
        c.show_details();
        c.price();
        
        System.out.println("Calling the static method.");
        ChildClass.static_method();
        
        System.out.println("\nCreating and Running ChildClass2 object");
        ChildClass2 c2 = new ChildClass2();
        c2.increasecount();
        c2.price();
        
        System.out.println("\nCreating and Running ChildClass3 object");
        ChildClass3 c3 = new ChildClass3();
        c3.increasecount();
        c3.price();
        
        
        //Observation Construction is called when an object of ChildClass is created because the ChildClass also inherits the constructor.
       
    }
}
