// Check if a number is prime or not
import java.util.*; //  



public class javatut38 {
    public static void main(String args[]){
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n = obj.nextInt();
        if(n==2){
            System.out.println("It is a Prime Number");
        }
        else{
            boolean isPrime = true;
          //  for(int i = 2; i<=n-1; i++){ 
            for(int i = 2; i<=Math.sqrt(n); i++){ // Math.sqrt() is a class for find any no of root and it is inside java.util.*; package.
                if(n%i==0){ // n is a multiple of i (i not equal to 1 or n)
                    isPrime=false;
                    
                }
            }
                if(isPrime==true){
                    System.out.println("It is a prime Number");
                }
                else{
                    System.out.println("It is not prime Number");
                }
            
        }
       
    }
}
