//Print Character Pattern
/*
 * A
 * BC
 * DEF
 * GHIJ
 */
import java.util.*;

public class javatut43 {
   

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int n = 4;
        char ch = 'A';
        // outer Loop
        for (int line = 1; line <= n; line++) {
            // inner loop
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

}
