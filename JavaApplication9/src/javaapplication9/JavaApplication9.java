package javaapplication9;


public class JavaApplication9 {
    private static class tt
    {
        public void hello()
        {
            System.out.println("Hello");
        }
    }
    
    private static class yo
    {
        public int x;
    }
    
    public static void main(String args[])
    {
//        JavaApplication9.tt a = new JavaApplication9.tt();
          tt a = new tt();
          a.hello();
          
          yo b = new yo();
          
          b.x = 25;
          System.out.println(b.x);
          display();
          JavaApplication9 jj = new JavaApplication9();
          JavaApplication9 kk = new JavaApplication9();
          jj.display();
          kk.display();
    
        
    }
    
    public static void display()
    {
        System.out.println("Hari Krishna Shah");
    }  
    
    
}
