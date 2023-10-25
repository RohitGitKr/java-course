//Check if a student will pass or fail
// with the help of ternary operator
import java.util.*;
public class javatut21 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks =sc.nextInt();
        String status =(marks>=33) ? "Pass" : "Fail";
        System.out.println(status);


    }
    
}
