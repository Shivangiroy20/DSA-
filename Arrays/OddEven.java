public class OddEven{
    public static int  OddEven(int arr[]){
      for(int i=0; i<arr.length; i++){
        if(arr[i] % 2 == 0){
          System.out.println("The even numbers are :" + arr[i]);
        }else{
          System.out.println("The odd Number are :" + arr[i]);
        }
      }
      return -1 ;
      
    }
    public static void main(String args[]){
      int arr[] = {2,4,5,6,8,9,3};
      System.out.println(OddEven(arr));
      
    }
  }