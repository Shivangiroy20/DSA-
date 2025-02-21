import java.util.Arrays;
public class cyclicRotate{
    public static void cyclicRotate(int arr[]){
        if(arr.length == 0)
        return;
        int lastElement = arr[arr.length-1];

        for(int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = lastElement;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        System.out.println("the original array is:" + Arrays.toString(arr));
        cyclicRotate(arr);
        System.out.println("the rotated array is:" + Arrays.toString(arr));
    }
}