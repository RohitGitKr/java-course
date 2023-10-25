// Print Sum of n natural number
import java.util.*;
public class javatut28 {
    public static void main(String args[]){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter First n natural No: ");
        int n=obj.nextInt();
        int sum=0;
        int i =1;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("Sum of first " +n + " natural number: " +sum);
    }
}
