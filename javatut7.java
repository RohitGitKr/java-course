//Type casting
import java.util.*;
public class javatut7 {
    public static void main(String args[]){
        Scanner obj = new Scanner (System.in);

// Eg ->1
       /* float a = 25.88f;
        //int b = a;// error lossy conversion --> loss of data
        int b = (int)a; // no error but loss of data
        System.out.println(b);

 */
// Eg ->2
float marks  = 99.999f;
int  marks2 = (int)marks;// data loss but no error
System.out.println("marks = "+marks2); 

// eg-3
char ch1 = 'a';
char ch2 = 'b'; 
int num1 = ch1;
int num2 = ch2;
System.out.println("num1  : "+num1); // output 97
System.out.println("num2 : " +num2); // output 98





    }
    
}
