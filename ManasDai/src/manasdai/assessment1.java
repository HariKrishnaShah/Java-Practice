import java.util.*;
import java.io.*;
class assessment1 {
    public static void main(String args[]){
        String reg=new String();
        Scanner s = new Scanner(System.in);
        reg= s.nextLine();
        if(reg.charAt(3)=='C'&&reg.charAt(4)=='E'){
            System.out.print("The student joined in year 20"+reg.charAt(0)+""+reg.charAt(1)+",in Computer science and engineering with registtion number "+reg.charAt(5)+""+reg.charAt(6)+""+reg.charAt(7)+""+reg.charAt(8));
        }
        else if(reg.charAt(3)=='C'&&reg.charAt(4)=='I'){
            System.out.print("The student joined in year 20"+reg.charAt(0)+""+reg.charAt(1)+",in Computer science with spl in information SECURITY with registtion number "+reg.charAt(5)+""+reg.charAt(6)+""+reg.charAt(7)+""+reg.charAt(8));
        } 
        else if(reg.charAt(3)=='C'&&reg.charAt(4)=='T'){
            System.out.print("The student joined in year 20"+reg.charAt(0)+""+reg.charAt(1)+",in Computer science with spl in IOT with registtion number "+reg.charAt(5)+""+reg.charAt(6)+""+reg.charAt(7)+""+reg.charAt(8));
        } 
        else if(reg.charAt(3)=='B'&&reg.charAt(4)=='S'){
            System.out.print("The student joined in year 20"+reg.charAt(0)+""+reg.charAt(1)+",in Computer science with spl in business Systems with registtion number "+reg.charAt(5)+""+reg.charAt(6)+""+reg.charAt(7)+""+reg.charAt(8));
        } 
        else{
            System.out.println("Invalid");
        }
        
    }
}
