// Type Promation in Expressions -> java convert all dataTypes (byte, short, float, char, int ) to Integer Datatypes
import java.util.*;
public class javatut8 {
    public static void main(String args[]){
        Scanner obj = new Scanner (System.in);
        // rule no 1

    // char a = 'a';
     //    char b = 'b';
        // char c = b-a;//error  here c is a character value so dont convert integer(b-a) to character (c)
         //System.out.println((int)(b)); // output --> 98  type casting
         //System.out.println((int)(a));// output --> 97   type casting
         //System.out.println(a); output -> a // because type promotion happens with only experssions eg- b-a
       //  System.out.println("b-a = " + (b-a));// output 1
          

//**************************************************************************************
         // Eg - 2 
        /* short a = 5;
         byte b = 35;
         char c = 'c';
       //  byte bt = a + b + c; error  incompatible types: possible lossy conversion from int to byte(all data convert  in integer)
       byte bt = (byte) (a + b + c); // but u can use typecasting (no error)
       System.out.println(bt); // output --> -117
 */

//*********************************************************************************************************************************************
// rule no 2
/* if yoy have long, float,double vale than convert  to long or double or float */

 int a = 10;
float b = 20.25f;
long c = 25;
double d = 30;
double ans = a + b + c + d;// no error but
//int ans = a + b + c + d; // error : incompatible types: possible lossy conversion from double to int
System.out.println("ans : "+ans);



// Eg 
/*
byte b = 5;
// byte a = b*2; // error incompatible types: possible lossy conversion from int to byte
// but u can use with the help of type casting
byte a = (byte)(b*2);
System.out.println(a); // output 10

  */

 

    }
}
