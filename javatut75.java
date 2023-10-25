// Binary Search
import java.util.*;

public class javatut75 {
    public static int binarySearch(int numbers[], int key){
        int start=0 , end =numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            // Comparisions
            if(numbers[mid]==key){
                return mid;// when key will be found
            }
            if(numbers[mid]<key){
                start=mid+1;// update start in right side
            }
            else{
                end = mid-1;// update end in left side
            }
        }
        return -1;//  Key Not exist in arrray
    }

    public static void main (String  args[]){
        int numbers[]={2, 4, 6, 8, 10, 12, 14};
        int key=15;
        System.out.println("Index for key is :" + binarySearch(numbers, key));

    }
}
