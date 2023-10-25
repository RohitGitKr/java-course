
// Sum of a & b (input from User)
/*
import java.util.*;
public class javatut3 {
    public static void main (String args[]){
        Scanner obj = new Scanner(System.in);
        int a, b, sum;
        System.out.print("Enter the first num : ");
        a = obj.nextInt();
        System.out.print(" Enter the 2nd num : ");
        b = obj.nextInt();
        sum = a+b;
        System.out.println("  Sum of two num is : " +sum);
    }
}
*/
import java.util.*;
public class javatut3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1..");
        int num1=sc.nextInt();
        System.out.println("Enter the num2..");
        int num2=sc.nextInt();

        int sum= num1+num2;
        System.out.println("Sum ="+sum);

    }
}