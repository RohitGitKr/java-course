/* type conversion :- It is convert one type of data to another type of datatype 
Eg:- int <--> long (correct 4byte -> 8byte) 
but  long <--> int  (not possible 8 byte -> 4 byte)
*/
/*
import java.util.*; 
public class javatut6 {
    public static void main(String args[]){
        Scanner obj = new Scanner (System.in); */
        /* 
        int a = 25;
        long b = a;
        System.out.println(b); // output no error --> print 25 but 
        */
  

      /*  long a = 25;
        int b = a;
        System.out.println(b);   output error: incompatible types: possible lossy conversion from long to int
        int b = a;  
                ^
                 */

               //int num =  obj.nextFloat(); //error but 
              /*  float num = obj.nextInt(); // no error
                System.out.println("num = "+num);
 */



          /*     // for character
               
    }
    
}
*/  
import java.util.*;
public class javatut6{
  public static void main (String args[]){
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter any character & Check Characters value");
    char ch=obj.next().charAt(0);
    int num=ch;
    System.out.println(ch + " num= "+num);
    System.out.println( " ASCII code of " +ch + " = "+num);
  }
}