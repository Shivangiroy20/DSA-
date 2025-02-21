public class pairInSortedRotated{
    public static boolean pairInSortedRotated(int arr[], int sum){
        int n = arr.length;
        int pivot = -1;
        
        for(int i=0; i<n-1; i++){
          if(arr[i] > arr[i+1]){
            pivot = i;
            break;
          }
        }
        int low = (pivot + 1)% n;
        int high = pivot;
        
        while(low != high){
          int currentSum = arr[low] + arr[high];
          
          if(currentSum == sum)
          low = (low + 1)% n;
          
          else
          high = (high - 1 + n)% n;
        }
        return false;
      }
    
    public static void main(String args[]){
        int arr[] = {4,5,6,1,2,3};
    int sum = 10;
    
    if(pairInSortedRotated(arr, sum))
    System.out.println("pair exists");
    else
    System.out.println("no such pair exists");
        
    }
}