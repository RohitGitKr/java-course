// Area of a circle
import java.util.*;

public class javatut5 {
    public static void main(String args[]){
        Scanner obj = new Scanner (System.in);
        System.out.print("Enter the Radius of a circle : ");
        float rad = obj.nextFloat();
        float Area = 3.14f * rad * rad;// formula of area of a circle is pi r square
        System.out.println("Area  of a circle is : "+Area);

    }
}

