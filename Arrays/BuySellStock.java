import java.util.Arrays;
public class BuySellStock{
    public static int BuySellStock(int arr[]){
        int res = 0;
       for(int i= 0; i< arr.length - 1; i++){
        for(int j= i+1; j<arr.length; j++){
            res = Math.max(res, arr[j] - arr[i]);
        }
       }
       return res;
    }
    public static void main(String args[]){
        int arr[] = {7,10,1,3,6,9,2};
        System.out.println(BuySellStock(arr));

    }
}