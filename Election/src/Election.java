import java.util.*;

public class Election {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Will you vote Modi in next election? ");
       Scanner s = new Scanner(System.in);
       String choice = s.nextLine();
       
       switch(choice)
       {
           case "yes": System.out.println("Seems like you are a Modi Supporter.");
                        break;
           case "no": System.out.println("Seems like you are not a Modi supporter.");
                       break;
           case "maybe": System.out.println("Seems like you are confused.");
                          break;
           default: System.out.println("Seems like you are not interested in politics");
           
           
       }
       
       
    }
    
}
