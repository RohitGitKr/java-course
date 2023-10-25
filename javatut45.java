
// Functions Practice Question
import java.util.*;

public class javatut45 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Q1. Write a java method to complete the average pf three numbers

        // System.out.print("Enter the First Number");
        // double x=sc.nextDouble();
        // System.out.print("Enter the 2nd Number");
        // double y=sc.nextDouble();
        // System.out.println("Enter the 3rd Number");
        // double z=sc.nextDouble();
        // System.out.println("The Average of the Number is:" + Avg(x, y, z)+"\n");
        // }
        // public static double Avg(double x, double y, double z){
        // return (x+y+z)/3;


        //******************************************************************************************************************** */
        
        
        // Q2. Write a method named isEven that accepts an int argument. The method
        // should return true if the argument is even, or false otherwise. Also write a
        // program to test your
        // method

    //     System.out.println("Enter Any Integer Number: ");
    //     int num = sc.nextInt();

    //     if (isEven(num)) {

    //         System.out.println("Number is Even");
    //     } else {
    //         System.out.println("Number is Odd");
    //     }

    // }

    // public static boolean isEven(int number) {
    //     if (number % 2 == 0) {
    //         return true;
    //     } else {
    //         return false;
    //     }}
    // 
//******************************************************************************************************************************************************************************************** */

 /* Q3. Write a Java program to check if a number is a palindrome in Java? ( 121 is a
palindrome, 321 is not)
A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
palindrome because the reverse of 321 is 123, which is not equal to 321.  */



    //     System.out.println("Please Enter a Number ");
    //     int palindrome =sc.nextInt();

    //     if(isPalindrome(palindrome)){
    //         System.out.println("Number : " + palindrome + " is a palindrome number");
    //     }
    //     else{
    //         System.out.println("Number : " + palindrome + " is not a palindrome number");
    //     }
    // }
    //     public static boolean isPalindrome(int num){
    //         int Palindrome=num; // copied number into variable;
    //         int reverse=0;
    //         while(Palindrome != 0){

    //             int remainder = Palindrome % 10;
    //             reverse=reverse *10+remainder;
    //             Palindrome=Palindrome/10;
    //         }
    //         if(num==reverse){
    //             return true;
    //         }
    //         else{
    //             return false;
    //         }
    //     }
        
        //***************************************************************************************************************************** */
/* 
            Q4. READ & CODE EXERCISE
            Search about(Google) & use the following methods of the Math class in Java:
            a. Math.min( )
            b. Math.max( )
            c. Math.sqrt( )
            d. Math.pow( )
            e. Math.avg( )
            f. Math.abs( )
            Free reading resource (https://www.javatpoint.com/java-math)
            Please feel free to look for more resources/websites on your own.*/
            



           //*********************************************************************************************************************** */

            // Q5. Write a Java method to compute the sum of the digits in an integer.
            // (Hint : Approach this question in the following way :
            // a. Take a variable sum = 0
            // b. Find the last digit of the number
            // c. Add it to the sum
            // d. Repeat a & b until the number becomes 0 )

            System.out.println("Input an integer : ");
            int  digits =  sc.nextInt();
            System.out.println("The sum is " +SumDigits(digits));


    }

    public static  int SumDigits(int n){
        int sumofDigits=0;
        while(n>0){
            int lastDigit=n%10;
            sumofDigits += lastDigit;
            n /=10;
        }
        return sumofDigits;
    }

}  

