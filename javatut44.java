// functions/Method
import java.util.*;

public class javatut44 {
    // function definition
    // Find Factorial of n with the help of function
    public static int factorial(int num){
        int f = 1;
        for(int i = 1; i<=num; i++){
            f =f*i;
        }return f;// factorial of n
    }
    public static int binCoeff(int n, int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int binCoeff=fact_n/(fact_r * fact_nmr);
        return binCoeff;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int r= sc.nextInt();
        System.out.println(binCoeff(n, r));
    }
}
