import java.util.Arrays;
public class FourCombination{
    public static int[] FourCombination(int arr[] , int target){
        for(int i=0; i<arr.length-3; i++){
            for(int j=i+1;j<arr.length-2; j++){
                for(int k=j+1;k<arr.length-1; k++){
                    for(int l= k+1; l<arr.length; l++){
                        if(arr[i] + arr[j] + arr[k] + arr[l] == target){
                            return new int[] {arr[i] , arr[j] , arr[k], arr[l]};
                        }
                    }
                }
            }
            
        }
        return null;
    }
    public static void main(String args[]){
        int arr[] = {2,4,5,6,7,8,3};
        int target = 20;
        int result[] = FourCombination(arr, target);
        System.out.println("the element are : " + Arrays.toString(result));
    }
}