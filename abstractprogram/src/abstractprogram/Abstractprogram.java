package abstractprogram;

//Coded by Hari Krishna Shah


abstract class Abstractprogram {
    
    static int count = 1;

    void show_details()
    {
        System.out.println("Show Details method is called");
    }
    
    public Abstractprogram()
    {
        System.out.println("Constructor Called.");
    }
    
    abstract void price();
    
    static void static_method()
    {
        System.out.println("This is static method");
    }
    
}
