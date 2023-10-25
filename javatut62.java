// Floyd's Triangle
import java.util.*;
public class javatut62 {
    public static void floyds_triangle(int n){
        int counter =1;
        // outer loop
        for(int i=1; i<=n; i++){
            // inner- how many times counter be printed
            for(int j=1; j<=i; j++){
                System.out.print(counter + " ");
                counter ++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        floyds_triangle(5);
    }
}
