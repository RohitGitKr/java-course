//  Print Number Pyramid
import java.util.*;
public class javatut68 {
    public static void numberPyramid(int n){
        // Outer loop 1 to n
        for(int  i=1; i<=n; i++){
            // inner loop for spaces 1 to n-i
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // inner loop for number 1 to i
            for (int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();// nextLine
        }
    }
    public static void main(String args[]){
        numberPyramid(5);
    }
}

/* Output
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5  

*/
