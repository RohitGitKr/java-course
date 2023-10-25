import java.util.Scanner;

//Nested lOOP 
// Print Star pattern
/*
 * 
 *  *
 *  * *
 *  * * *
 *  * * * *
 */
import java.util.*;
public class javatut40 {
 public static void main(String args[]){
    Scanner obj = new Scanner(System.in);
    for(int line=1; line<=4; line++){
        for(int star=1; star<=line; star++){
            System.out.print(" * ");

        }
        System.out.println();// for nextLine
    }
 }
}
