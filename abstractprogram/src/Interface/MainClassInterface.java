package Interface;


//Coded by Hari Krishna Shah

/**
 *
 * @author Hari
 */
public class MainClassInterface implements mainInterface {
    
    public void sayhi()
    {
        System.out.println("Hello");
    }
    
    public static void main(String args[])
    {
        MainClassInterface m = new MainClassInterface();
        m.sayhi();
        
        m.defaultmethod();
    }
            
}
