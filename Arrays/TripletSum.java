import java.util.Arrays;
public class TripletSum{
    public static int[] TripletSum(int arr[] , int target){
        for(int i=0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
                for(int  k = j+1; k<arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        return new int [] {arr[i] , arr[j], arr[k]};
                    }
                }
            }
        }
        return new int[] {-1, -1, -1};
    }
    
    public static void main(String args[]){
        int arr[] ={1,-2,0,5,-1,-4};
        int target = 2;
        int[] result = TripletSum(arr, target);
        System.out.println("The pairs are : " + Arrays.toString(result));
    }
}