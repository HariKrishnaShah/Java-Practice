
package MultipleInheritance;


interface frame
{
   
    default void greetframe()
    {
        System.out.println("Choose the frame");
    }
    void getcolor();
    void displaycolor();   
    static void hello()
    {
        System.out.println("Hello");
    }
}