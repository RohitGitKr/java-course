// print the largest of 3 num
import java.util.*;
public class javatut19 {
    public static void main (String args[]){
        Scanner obj = new Scanner(System.in);
        int A = obj.nextInt();
        int B = obj.nextInt();
        int C = obj.nextInt();

        if(A>=B && A>=C){
            System.out.println("A is a Largest number");
        }
        else if(B>=C){
            System.out.println("B is a Largest Number ");
        }
        else{
            System.out.println("C is a largest number");
        }
    }
    
}
