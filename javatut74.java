// Find Largest And Smallest number in array
public class javatut74 {
    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;// -infinity
        int smallest=Integer.MAX_VALUE;// +infinity
        for(int i = 0; i<numbers.length; i++){
                if(largest < numbers[i]){
                    largest =  numbers[i]; // Update value or switch value when largest smaller than numbers
                }
                if(smallest > numbers[i]){
                    smallest = numbers[i]; // Update value or switch value when smallest smaller than numbers
                }
        }
        System.out.println("Smallest Value is : " + smallest);
        return largest;
    }
    public static void main(String args[]){
        int numbers[]= {1, 2, 6, 3, 5};
        System.out.println("Largest value is: " +getLargest(numbers));
    }
}
