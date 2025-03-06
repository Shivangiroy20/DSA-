public class MaxConsecutive{
    public static int  MaxConsecutive(int arr[]){
        int maxcount =0 , count = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }else{
                maxcount = Math.max(maxcount, count);
                count = 1;
            }
        }
                return Math.max(maxcount, count);
    }
    public static void main(String args[]){
        int arr[] = {1,1,0,0,1,0,1,0,1,1,1,1};
        System.out.println("The total number are :" + MaxConsecutive(arr));
        }
}