 //Print Half- Pyramid Pattern
 /*
  * 1
    1 2
    1 2 3
    1 2 3 4
  */
 import java.util.*;
public class javatut42 {
    public static void main(String args[]){
        Scanner obj = new Scanner (System.in);
        int n=4;
        for(int line= 1; line<=n; line++){
            for(int number = 1; number<=line; number++){
                System.out.print(number);

            }

            System.out.println();// nextLine
        }
    }
}
