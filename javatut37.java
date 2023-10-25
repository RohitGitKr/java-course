
//Question continue Keyword
// Display all numbers entered by user except multiples of 10
import java.util.*;
public class javatut37 {
    public static void main(String args[]){
       Scanner obj = new Scanner (System.in);
       do{
        System.out.print("Enter your Number : ");
        int n = obj.nextInt();
        if(n % 10 ==0){
            continue;
        }
        System.out.println("Your Number Was: " + n);
    } while(true);
    }
}
