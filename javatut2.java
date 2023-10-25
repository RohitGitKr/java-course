import java.util.*;//   here util is a

public class javatut2 {
     
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);// scanner object used to different-2 functions use and capture   of different-2 datatypes and store  in any varaibles // for input
      /*  System.out.println( "Enter your name");
      String input = obj.next();  // for get input no any space print  -> output Enter your name Rohit Kushwaha-> 
                                     //   only print Rohit through .next but you can print Rohit kushwaha use -> .nextLine
      System.out.println(input);
      */ 

//System.out.println("Enter your FullName");
  //   String name = obj.nextLine();// with space and sentences and paragraph you can print

    //  System.out.println(name);
/* 
      // for number(integer)
      System.out.println("Enter any number -");
      int number =obj.nextInt();
      System.out.println("output=" +number);

      // for float value
      System.out.println("Enter any float value:");
      float fltNum= obj.nextFloat();
      System.out.println("fltNum =" +fltNum);

      // for double 
      System.out.println("Enter any double value:");
      double doubleNum= obj.nextDouble();
      System.out.println("DoubleNum ="+doubleNum);
      */
    // for boolean
      System.out.println("Enter any boolean value:");
      //boolean boolValue= obj.nextBoolean();or 
      boolean boolValue= obj.hasNextInt();// hasNextInt this is check value is integer or not
     /*  boolean boolValue1= obj.hasNextFloat();// hasNextFloat this is check value is float or not
      boolean boolValue2= obj.hasNextDouble();// hasNextDouble this is check value is double or not
      boolean boolValue3= obj.hasNextShort();// hasNextShort this is check value is short or not
      boolean boolValue4= obj.hasNextLong();// hasNextLong this is check value is long or not
      */
      System.out.println("boolValue="+boolValue);

     
      
      /* 
      // for short 
      System.out.println("Enter any short value:");
      short shtValue= obj.nextShort();
      System.out.println("shtValue="+shtValue);
      
      // for long
      System.out.println("Enter any long value:");
      long lgvalue = obj.nextLong();
      System.out.println("lgValue="+lgvalue);
      
      //for byte
      System.out.println("Enter any byte value:");
      byte byt=obj.nextByte();
      System.out.println("byt="+byt);
      
      
      */


    }
}
