import java.util.Arrays;

public class MoveZeroesOnes{
    public static void MoveZeroesOnes(int arr[]){

        int count = 0;
        
        for(int num : arr){
            if(num == 1)
                count++;
            }
            for(int i= 0; i<count; i++){
                arr[i] = 1;
            }
            for(int i=count; i<arr.length; i++){
                arr[i] = 0;
            }
        }
    
    public static void main(String args[]){
        int arr[] = {1,0,0,0,1,0,0,1,0,1,0};
        MoveZeroesOnes(arr);
        System.out.println("Segregated array is :" + Arrays.toString(arr));
    }
}