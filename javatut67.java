// Print Diamond 
import java.io.ObjectInputFilter.Status;
import java.util.*;
public class javatut67 {
    public static void diamond(int n){
        // outer  loop for 1st Half 1 to n
        for(int i=1; i<=n; i++){
            // inner loop for spaces (1 to n-i)
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // inner loop for star(1 to 2*i-1)
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Outer loop for mirror image n to 1
         for(int i=n; i>=1; i--){
              // inner loop for spaces (1 to n-i)
              for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // inner loop for star(1 to 2*i-1)
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
         }
    }

    public static void main(String args[]){
        diamond(4);
    }
}
