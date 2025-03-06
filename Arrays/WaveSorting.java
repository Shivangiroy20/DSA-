import java.util.Arrays;
public class WaveSorting{
    public static void WaveSorting(int arr[]){
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i+=2){
            int  temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
    public static void main(String args[]){
        int arr[] = {10,90,49,2,1,5,23};
        WaveSorting(arr);
        System.out.println("Wave from Sorted Array:" + Arrays.toString(arr));
    }
}