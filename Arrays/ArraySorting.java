public class ArraySorting{
    public static int Sorting(int arr[], int n){
        if(n == 1)
        return 1;
        
        boolean increasing = true, decreasing = true;
        for(int i=1; i < n; i++){
          if(arr[i] > arr[i-1])
            decreasing = false;
          else if(arr[i] < arr[i - 1])
          increasing = false;
        }
        
        return(increasing || decreasing) ? 1 : 0;
      }
        
    
    public static void main(String args[]){
        int n = 5;
        int arr[] = {1,1,2,2,3};
        
        System.out.println("is the array sorted?" + Sorting(arr,n));
        
        


    }
}