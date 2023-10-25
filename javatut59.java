//Pattern (Part-11)-Advanced
//Print Hollow REctangle Pattern
import java.util.*;
public class javatut59{
    public static void hollow_rectangle(int totRows, int totCols ){
        // Outer loop 
        for(int i=1; i<=totRows; i++){
            // inner loop
            for(int j=1; j<=totCols; j++){
                // now we are cell -(i;j)
                //Boundary cells
                if(i==1 || i==totRows || j==1 ||j==totCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        hollow_rectangle(4,5 );
        

    }
}