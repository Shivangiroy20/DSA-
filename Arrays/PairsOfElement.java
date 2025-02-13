public class PairsOfElement{
    public static int[] PairsOfElement(int arr[] , int target){
        for(int i=0; i<arr.length; i++){
            for(int j= i+1; j< arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{arr[i] , arr[j]};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,7,1,3,3};
        int target = 6;
        int result[] = PairsOfElement(arr, target);
        System.out.println("The pairs are : [" + result[0] + ", " + result[1] + "]");
            }
}