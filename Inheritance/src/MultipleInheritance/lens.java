package MultipleInheritance;


interface lens
{
   
    default void greetlens()
    {
        System.out.println("Choose the Lens:");
    }
    void getpower();
    void displaypower();
    
    
    
}
