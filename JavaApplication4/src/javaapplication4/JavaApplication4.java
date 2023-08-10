
package javaapplication4;

/**
 *
 * @author Hari
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      try{
          int arr[] = {6,4,2,3,5};
          Class c = arr.getClass();
          String s = c.getName();
          System.out.println("The name of array is " + s);
      }catch(Exception e ){System.out.println(e);}
    }
    
}
