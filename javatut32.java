//Reverse the given Number
import java.util.*; 

public class javatut32 {
    public static void main(String args[]){
        Scanner obj = new Scanner (System.in);
        System.out.print("Enter any number: ");
        int n = obj.nextInt();
        int reverse = 0;
        while(n>0){
            int LastDigit = n%10;
            reverse = (reverse * 10) + LastDigit;
            n = n/10;
        }
        System.out.println(reverse);

    }
}
