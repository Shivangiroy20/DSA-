public class MoveZeroes{
    public static void MoveZeroes(int arr[]){
      int n = arr.length;
      int nonZeroindex = 0;
      
      for(int i=0; i<n; i++){
        if(arr[i] != 0){
          arr[nonZeroindex] = arr[i];
          nonZeroindex++;
        }
      }
      while(nonZeroindex <n){
        arr[nonZeroindex] = 0;
        nonZeroindex++;
      }
    }
    public static void main(String args[]){
      int arr[] = {2,0,7,0,6,0,6};
      MoveZeroes(arr);
      System.out.print("Arrays after moving zeroes:");
      for(int num : arr){
        System.out.print(num + " ");
      }
    }
  }