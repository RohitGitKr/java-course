// Income Tax Calculator

import java.util.*;
import java.util.Scanner;

public class javatut18 {
    public static void main(String args[]){
        Scanner obj = new Scanner (System.in);
        int income = obj.nextInt();
        int tax;// default value o
        if(income<500000){
           tax = 0;
        }
        else if(income>=500000 && income <100000){
            tax = (int)(income*0.2);
        }
        else{
            tax = (int)(income*0.3);
        }
        System.out.println("Your tax is : "+tax);


    }
}
