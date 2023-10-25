// print number from 1 to n here n is a user input
import java.util.*;
public class javatut27 {
    public static void main(String args[]){
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter any number");
        int n= obj.nextInt();
        int counter = 1;
        while(counter<=n){
            System.out.print(counter + " ");
            counter ++;
        }
        System.out.println();
    }
}
