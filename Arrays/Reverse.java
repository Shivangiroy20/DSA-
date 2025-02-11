public class Reverse{
    public static void Reverse(int arr[] , int n){
        int temp;
        int low = 0;
        int high = n-1;
        while(low < high){
          temp = arr[low];
          arr[low] = arr[high];
          arr[high] = temp;
          low++;
          high--;
          
        }
      }
    public static void main(String args[]){
        int n = 5; 
        int arr[] = {1,1,2,2,3};
        Reverse(arr, n);
        System.out.println("Reverse of an array :" );
        for(int num : arr){
          System.out.print(num + " ");
        }
        
    }
}