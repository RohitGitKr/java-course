// else if statements
import java.util.*;
public class javatut17 {
    public static void main(String args[]){

        Scanner obj = new Scanner (System.in);
        int age = obj.nextInt();
        if(age>=18){
            System.out.println("Adult");
        }
            else if(age>=13 && age<18){
                System.out.println("Teenager");

            }
            else{
                System.out.println("Child");
            }
        
    
    }
}

