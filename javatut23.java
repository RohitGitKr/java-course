
// Calculater in switch case
import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class javatut23 {
    public static void main (String args[]){
        Scanner obj = new Scanner (System.in);
       
        int a  = obj.nextInt();
        char operator = obj.next().charAt(0);// charAt(0) --> used for get character value  --> clearly define in next string chapter
        int b = obj.nextInt();
                
    
        switch(operator){
            case '+' :
               System.out.println(a+b);
               break;

            case '-' :
               System.out.println(a-b);
               break;
            case '*' : 
            System.out.println(a*b);
               break;
            case '/' : System.out.println(a/b );
               break;
            case '%' : System.out.println(a%b);
               break;
               default : System.out.println("Please Enter Correct Operator");

            
        }


    }

}
