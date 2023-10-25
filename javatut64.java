// Print Butterfly Pattern
import java.util.*;
public class javatut64 {
    public static void butterfly(int n){
        //outer loop for 1st Half
        for (int i=1; i<=n; i++){
            //  stars- (i)

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

             //spaces- 2*(n-i)

            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
           
            //Stars- (i)
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // outer loop  for 2nd Half
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

             //spaces- 2*(n-i)

            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
           
            //Stars- (i)
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        butterfly(4);
    }
}
