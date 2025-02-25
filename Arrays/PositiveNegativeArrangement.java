import java.util.Arrays;

public class PositiveNegativeArrangement{
    public static void PositiveNegativeArrangement(int arr[]){
        int left = arr.length-1, right = 0;

        while(left  < right){
            while(arr[left] >= 0 && left  > right){
                left++;
            }
            while(arr[right] < 0 && left > right){
                right--;
            }
        }
        if(left > right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }
    public static void main(String args[]){
        int arr[] = {2,-1,6,-5,-4,-9};
        System.out.println("Original Array:" + Arrays.toString(arr));
        PositiveNegativeArrangement(arr);
        System.out.println("Rearranged Array:" + Arrays.toString(arr));
    }
}