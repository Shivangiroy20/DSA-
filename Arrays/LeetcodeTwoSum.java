public class LeetcodeTwoSum{
    public static int[] TwoSum(int arr[], int target){
        int n = arr.length;
        for(int i=0; i< n-1; i++){
            for(int j= i+ 1;j< n; j++ ){
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String args[]){
        int arr[] = {2,7,11,15};
        int target = 9;
        int[] Result = TwoSum(arr, target);
        System.out.println("Indexes are : " Arrays.toString(Result));
    }
}
