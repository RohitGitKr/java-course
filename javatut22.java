// Switch Statement
import java.util.*;
public class javatut22 {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
         /*  int num = 2;
      switch(num){
            case 1 :System.out.println("Samosa");
                      break;
            case 2: System.out.println("Burger");
                     break;
            case 3: System.out.println("Pizza");
                     break;
            default : System.out.println("We relaize we are dreaming");
 */
            //************************************************************* */
            char ch =sc.next().charAt(0);
            switch(ch){
            case 'a' :System.out.println("apple");
                      break;
            case 'b': System.out.println("banana");
                     break;
            case 'c': System.out.println("corn");
                     break;
            default : System.out.println("We relaize we are dreaming");

        }
    }
}
