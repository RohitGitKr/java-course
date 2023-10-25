// Palndromic Pattern wtih Number
import java.util.*;
public class javatut69 {
    public static void palindromicpattern(int n){
        // Outer loop for 1 to n
        for(int i=1; i<=n; i++){
            // inner loop for sapces (1 to n-i)
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // inner lop for Descending Order (i to 1)
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            // inner loop for ascending order (2 to i)
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
    public static void main(String args[]){
        palindromicpattern(5);
    }
}
/*   Output 
    1
   212
  32123
 4321234
543212345 

*/