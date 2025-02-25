import java.util.Arrays;
public class Leetcode16{
    public static int threeSumClosest(int arr[], int target){
        Arrays.sort(arr);
        int closestSum = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            int left = i+1, right = arr.length-1;

            while(left < right){
                int currentSum = arr[i] +arr[left] + arr[right];

                if(Math.abs(target - currentSum) < Math.abs(target - closestSum)){
                    closestSum = currentSum;
                }
                if(currentSum < target){
                    left++;

                }else if(currentSum > target){
                    right--;
                }else{
                    return currentSum;
                }
            }
        }
        return closestSum;
    }
    public static void main(String args[]){
        int arr[] = {-1,2,1,4};
        int target = 2;
        int result = threeSumClosest(arr,target);
        System.out.println("The closest sum to target is:" + result);


    }
}