
package javaapplication4;

/**
 *
 * @author Hari
 */
public class cloningArray {
    public static void main(String args[])
    {
        try{
            int a[] = {6,4,2,3,5};
            for(int i = 0; i<5; i++)
            {
                System.out.println("The orginal array is " + a[i] );
            }
            int b[] = a.clone();
            for(int j = 0; j<5; j++)
            {
                System.out.println("The cloned array is " + b[j]);
            }
            System.out.println("are the array equal?");
            System.out.println(a==b);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
