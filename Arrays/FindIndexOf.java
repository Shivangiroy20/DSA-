public class FindIndexOf{
    public static int FindIndex(int arr[] , int target){
      for(int i=0; i< arr.length; i++){
        if(arr[i] == target){
          return i;
        }
      }
      return -1;
    }
    public static void main(String ars[]){
      int arr[] = {4,5,6,7,0,1,2};
      int target = 0;
      System.out.println("Index : " + FindIndex(arr, target));
    }
  }