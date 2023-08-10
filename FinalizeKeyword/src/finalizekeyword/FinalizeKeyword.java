package finalizekeyword;

public class FinalizeKeyword {

    protected void finalize()
    {
        try{
            System.out.println("Finalize method is called before destroying object");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
       
        //Creating object
        FinalizeKeyword f = new FinalizeKeyword();
        System.out.println("Hash Code of object f is " + f.hashCode());
        f = null;
        
        //Garbage Collector is called to destroy the unrefereced objects
        System.gc();
        System.out.println("The unreferenced objects are destroyed.");
    }
    
}
