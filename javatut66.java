// Hollow Rhombus Print
import java.util.*;
public class javatut66 {
    public static void hollow_rhombus(int n){
        // Outer loop 1 to n
        for(int i=1; i<=n; i++){
            // inner loop for spaces(1 to n-i)
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // inner loop Hollow rectangle 1 to  n condition(row= 1,5 or column= 1,5)
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{System.out.print(" ");}
            }
            System.out.println();

        }
    }
    public static void main(String args[]){
        hollow_rhombus(5);
    }
}
/*    
     *****
   *   *
  *   *
 *   *
***** 
  
 
 */
