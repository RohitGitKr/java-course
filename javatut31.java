// Print Reverse of a Number
import java.util.*;
public class javatut31 {
    public static void main(String args[]){
        Scanner obj =new Scanner (System.in);
        System.out.print("Enter Any number :");
        int n = obj.nextInt();
        while(n>0){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n/10;
        }
        System.out.println();  // output --> Enter Any number :10899
                                  //99801
    }
}
