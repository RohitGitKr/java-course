// Logical  Operator
import java.util.*;
public class javatut13 {
    public static void main (String agrs[]){
        // AND Operators(&&) ek bhi f-->f
        System.out.println(3>2 && 5>0);// T T --> T
        System.out.println(3<2 && 5<0); // F F --> F
        System.out.println(3>2 && 5<0);// T F --> F
        System.out.println(3<2 && 5>0);// F T --> F
// ***********************************************************************
      // OR Operators (||) ek bhi true --> true
      System.out.println(3>2 || 5>0); // T T -->T
      System.out.println(3>2 || 5<0);// T F  --> T
      System.out.println(3<2 || 5>0);// F T  --> T
      System.out.println(3<2 || 5<0);// F F  --> F

//  ***********************************************************************
      // NOT Operators (!) alternate T -->F or F --> T
      System.out.println(!(3>2)); // T --> F
      System.out.println(!(3<2)); // F --> T 







    






















    }
    
}
