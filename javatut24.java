import java.util.*;

public class javatut24 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        /*
         * *****************************************************************************
         * ***************************************************************
         */
        // Q1. write a java program to get a number from the user and print whether it
        // is positive or Negative

        /*
         * Scanner obj=new Scanner(System.in);
         * System.out.println("Enter any number");
         * int num=obj.nextInt();
         * if(num>0){
         * System.out.println("It is positive Number");
         * }else{
         * System.out.println("It is a negative Number");
         * }
         */
        // ***********************************************************************************************************************************************************
        // */

        // Q2. Finish the following code so that it prints you have a fever if your
        // temperature is above 100 and otherwise print You don't have fever.

        /*
         * double temp = 103.5;
         * if(temp>100){
         * System.out.println("You have a fever.");
         * }
         * else{
         * System.out.println("You don't have a fever.");
         * }
         */

        /*
         * *****************************************************************************
         * *****************************************************************************
         * **
         */
        // Q3. Write a java program to input week name(1-7) using switch case.
        /*
         * System.out.println("Enter Any week Number");
         * int num= obj.nextInt();
         * switch(num){
         * case 1:System.out.println("Monday");
         * break;
         * case 2:System.out.println("Tuesday");
         * break;
         * case 3:System.out.println("Wednesday");
         * break;
         * case 4:System.out.println("Thursday");
         * break;
         * case 5:System.out.println("Friday");
         * break;
         * case 6:System.out.println("Saturday");
         * break;
         * case 7:System.out.println("Sunday");
         * break;
         * default:System.out.println("Please Enter valid Week Num(1-7)" );
         * }
         * 
         */

        // ******************************************************************************************************************************************************************

        // Q4. What will be the value of x & y in the following Program.
        /*
        int a = 63, b = 36;
        boolean x = (a > b) ? true : false;
        int y = (a > b) ? a : b;
        System.out.println(x); // output --> true
        System.out.println(y); // output--> 63
 */


 /****************************************************************************************************************************************** */
   
        // Q5. write a java program that takes a year from the user and print whether that is a leap year or Not.

        System.out.println("Enter Any  Year & check Is it leap Year?");
        int year = obj.nextInt();
        boolean x= ((year%4)==0);
        boolean y= ((year%100)!=0);
        boolean z= ((year%100==0) && (year%400==0));
        if(x && (y || z)){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }



}
}
