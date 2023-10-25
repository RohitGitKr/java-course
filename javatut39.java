//      Loop Practice Questions

import java.util.*;

public class javatut39 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        // ****************************************************************************************************************
        // */
        // Q1. How many times 'Hello ' is Printed ?

        /*
         * for (int i = 0; i < 5; i++) {
         * System.out.println("Hello");
         * i += 2;
         * }
         * // Output times Hello is printed
         * /*
         * Hello
         * Hello
         */

        // ******************************************************************************************************************
        // */

        // Q2. write a program that reads a set of a integers and the prints the of even
        // and odd integers
        /*
         * int number, choice, evensum=0, oddsum=0;
         * do{
         * System.out.println("Enter the Number");
         * number = obj.nextInt();
         * if(number%2==0){
         * evensum +=number;
         * }else{
         * oddsum +=number;
         * }
         * System.out.println("Do you want to continue press 1 or 0 for No");
         * choice=obj.nextInt();
         * }while(choice==1);
         * System.out.println( "Sum of Even Number : "+ evensum);
         * System.out.println( "Sum of Odd Number : " + oddsum);
         */

        // *****************************************************************************************************************************
        // */

        // */
        /* Q3. Write a program to find the factorial of any number entered by user. */
        /*
         * System.out.print("Enter any Number & Find Factoril: ");
         * int num = obj.nextInt();
         * int fact = 1;
         * for(int i = 1; i<=num; i++){
         * fact *=i;
         * 
         * }
         * System.out.println(" Factorial of " + num + " : " +fact);
         */
        // ****************************************************************************************************************************
        // Q4. Write a program to print the multiplication table of a number N,entered
        // by the user.
        /*
         * System.out.print("Enter the table of Number: ");
         * int table=obj.nextInt();
         * for(int i=1; i<=10;i++){
         * 
         * System.out.println(table + " * " + i + " : "+ table*i);
         * }
         */

        // ****************************************************************************************************************************

        // .Q5 :What is wrong in the following program?
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        // System.out.println(" i after the loop = " +i);
        /*
        // Answer 

         * Scope of variable is referred to the part of the program where the variable
         * can be used.
         * 
         * 
         * 
         * In this program variable i is declared in the for loop. So scope of variable
         * i is limited to the for loop only that is between { and } of the for loop.
         * There is a display statement after the for loop where variable i is used
         * which means i is used out of scope. This leads to compilation errors.
         * 
         * The program given will not run and give an error instead. To correct the proram
         * needs to be declared outside the for loop.
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         */
    }

}
