// ternary operator
import java.util.*;
public class javatut20 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Any Number");
        int num =sc.nextInt();
        String type = ((num%2) ==0 ) ? "Even" : "odd" ;
        System.out.println(type);
    }
    
}
