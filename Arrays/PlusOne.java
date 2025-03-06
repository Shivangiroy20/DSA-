import java.util.Arrays;

public class PlusOne{
    public static int[] plusOne(int arr[]){
        int n = arr.length;
        // traverse
        for(int i = n-1; i>=0; i--){
            if(arr[i] < 9){
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int newnumber[] = new int[n+1];
        newnumber[0] = 1;
        return newnumber;
    }
    public static void main(String args[]){
        int arr[] = {9,9,9};
        int result[] = plusOne(arr);

        System.out.println("Result:"  + Arrays.toString(result));

    }
}