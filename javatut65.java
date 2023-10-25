// Solid Rhombus print
import java.util.*;
public class javatut65 {
    public  static void solid_rhombus(int n){
        // outer loop
        for(int i=1; i<=n; i++){
            // inner loop for spaces(1 to n-i)
            for( int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // inner loop for stars 1to n
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        solid_rhombus(5);
    }
}
/*   output

    *****
   *****
  *****
 *****
*****

 */
