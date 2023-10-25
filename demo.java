import java.io.*;

public class demo { 
    public String var2;//declare instance var
    public demo()// default constructor
    {
        this.var2= "Rohit Kushwaha";// initializing instance var
    }



    public static String var3= "Rohit Srivastav";//declaration static var
    
    
    // main method
    public static void main(String args[]) 
    { 
      int var= 10;//declared a local variable 
      // this var is local to this main method only
      System.out.println("local var:"+ var);



      // obj creation
      demo name = new demo();
      // displaying o/p
      System.out.println("Instance var Myname is : "+ name.var2);
    
    
      // var3 can be accessed without obj creation 
      // disp o/p
      //demo.var3 ---> using the static var 
      System.out.println("Static Var3 name is : "+demo.var3);
    } 


}