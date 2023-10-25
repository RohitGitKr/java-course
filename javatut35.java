// Question Break Continue
// Keep entering numbers till user enters a multiple of 10.
import java.util.*;
public class javatut35 {
    public static void main(String args[]){
        Scanner obj = new Scanner (System.in);
        do{
            System.out.println("Enter your Number: ");
            int n = obj.nextInt();
            if(n%10 ==0){
                break;
            }
            System.out.println(n);
        }while(true);
    }
}
