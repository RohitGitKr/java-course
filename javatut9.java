//  problems variables & DataTypes Questions
import java.nio.channels.ClosedSelectorException;
import java.util.*;// package
public class javatut9 {
    public static void main(String args[]){
    Scanner obj = new Scanner(System.in);
     /*
    // Q1. In a program, input 3 numbers:A,B and C.You have to output the average of these 3 numbers.
    //(Hint: Average of N numbers is sum of those numbers divided by N)
    System.out.println("Enter any three numbers:");
    float a =obj.nextFloat();
    float b = obj.nextFloat();
    float c=obj.nextFloat();
    float Avg= (a+b+c)/3;
    System.out.println("Average of three Number = "+Avg);
    
    */
//********************************************************************************************************************** */
  /* 
// Q2.In a program, input the side of a square. You have to output the area of the square.
  //(Hint: area of a square is (side * side) )
    System.out.println("Enter the side of a Square");
    int side = obj.nextInt();

    int Area=side*side;
    System.out.println("Area of a Square = "+Area);
*/

// ***********************************************************************************************

// Q3. Enter cost of 3 items from the user (Using float data type )- a pencil, a pen, and an eraser.You have to output the total cost of the items back to the user as their bill.
//(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

System.out.println("Enter the price of a pencil,pen and an eraser:");
float pencil=obj.nextFloat();
float pen=obj.nextFloat();
float eraser=obj.nextFloat();
float total=pencil+pen+eraser;

System.out.println("Bill is = "+total);

// Add on with 18% gst tax

float newTotal=+total+(total*0.18f);
System.out.println("Bill With 18% gst tax = "+newTotal);
}
}
          