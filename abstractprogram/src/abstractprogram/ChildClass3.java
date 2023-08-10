package abstractprogram;

//Coded by Hari Krishna Shah

import static abstractprogram.Abstractprogram.count;

/**
 *
 * @author Hari
 */
public class ChildClass3 extends Abstractprogram{
    
    void increasecount()
    {
        count++;
         System.out.println("The count is increased to " + count);
    }
    
    public void price()
    {
        System.out.println("The price is 1500");
    }
}
