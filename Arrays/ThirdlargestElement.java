import java.util.Arrays;
public class ThirdlargestElement{
  public static int Thirdlargest(int arr[]){
    int largest = Integer.MIN_VALUE;
    int seclargest = Integer.MIN_VALUE;
    int thirdlargest = Integer.MIN_VALUE;

    for(int i=0; i<arr.length; i++){
      if(arr[i] > largest)
      largest = arr[i];
    }
    for(int i=0; i<arr.length; i++){
      if(arr[i] > seclargest && arr[i] < largest){
        seclargest = arr[i];
      }
     
        }
         for(int i=0 ;i<arr.length; i++){
        if(arr[i] > thirdlargest && arr[i] < seclargest){
          thirdlargest = arr[i];
      }
    }
    return thirdlargest;
    
  }
  public static void main(String args[]){
    int arr[] = {12,35,1,10,34,1};
    System.out.println("the third largest element is :" + Thirdlargest(arr));
    
  }
}