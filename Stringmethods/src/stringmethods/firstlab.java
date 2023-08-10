package stringfunctions;
import java.util.*;
public class firstlab {
 public static void main(String args[])
 {
 String s1 = new String("Hello Hello thello I am ");
 String s2 = new String("Hari");
 String s3 = String.format("Name is %s", s2);
 String s4 = s3.intern();
 byte b[] = s1.getBytes();
 char c[] = new char[20];
 s1.getChars(7, 10, c, 5);
 char e[] = new char[20];
 int a = 100;
 
 System.out.println("Are both strings equal" + s1.equals(s2));
 System.out.println("Both Strings combined forms " + s1.concat(s2));
 System.out.println("The character in the string 1 at index 3 is " + s1.charAt(3));
 System.out.println("Difference between the two strings " + s1.compareTo(s2));
 System.out.println("Does String 1 contain Hari" + s1.contains("Hari"));
 System.out.println("Does string 2 end with letter r " + s1.endsWith("r"));
 System.out.println("Are both Strings equal is case is ignored? " + s1.equalsIgnoreCase(s2));
 System.out.println("Formatted String to print name is :"+ s3);
 System.out.println("The value of byte b are given below:");
 for(int i = 0; i<b.length; i++)
 {
 System.out.println(b[i]);
 }
 System.out.println("The get char is printed as " + Arrays.toString(c));
 System.out.println("The index of r in Hari is " + s1.indexOf("H", 0));
 System.out.println("Are string s3 and s4 pointing to same, (using string intern) " + s3.equals(s4));
 System.out.println("Is string 1 empty? " + s1.isEmpty());
 System.out.println("Joined String is "+String.join("/", "11", "Dec", "2001"));
 System.out.println("Last index of l in String 1 is " + s1.lastIndexOf("l"));
 System.out.println("The length of String 1 is " + s1.length());
 System.out.println("Hello is replaced with Hi using replace function." + s1.replace("Hello", "Hi,"));
 System.out.println("Replacing all l in String 1 with t " + s1.replaceAll("l", "t"));
 System.out.println("Spliting String 1 into words using split method. The words are printed");
 String words [] = s1.split("\\s");
 for(String t:words)
 {
 System.out.println(t);
 }
 System.out.println();
 System.out.println("Does String 1 start with b? " + s1.startsWith("b"));
 System.out.println("The substring of String 1 from index 2 to 6 is " + s1.substring(2,6)); 
 e = s1.toCharArray();
 System.out.println("The character array is printed as " + Arrays.toString(e));
 System.out.println("String 1 in Lower Case is " + s1.toLowerCase());
 System.out.println("String 2 in Upper Case is " + s1.toUpperCase());
 System.out.println("The String 1 joined with Manas using trim is " + (s1.trim() + "Manas"));
 System.out.println("The String 1 joined with Manas without using trim is " + (s1 + "Manas"));
 System.out.println("The value of integer 100 as a String is " + String.valueOf(a));
 }
}