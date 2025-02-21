import java.util.Arrays;

public class SmallestAndsecondSmallest{
    public static void SmallestAndsecondSmallest(int arr[]){
        if(arr.length < 2){
            System.out.println("Array should have atleast two element");
            return;
        }
        Arrays.sort(arr);
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > smallest){
                secondSmallest = arr[i];
                break;
            }
        }
        if(secondSmallest == Integer.MAX_VALUE){
            System.out.println("No second smallest found int the given array");
        }else{
            System.out.println("Smallest number: " + smallest);
            System.out.println("Second Smallest number :" + secondSmallest);
        }
    }
    public static void main(String args[]){
        int arr[] = {1,5,4,5,8,9,5,2};
        SmallestAndsecondSmallest(arr);
        
    }
}