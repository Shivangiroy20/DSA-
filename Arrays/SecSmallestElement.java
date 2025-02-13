import java.util.Arrays;
public class SecSmallestElement{
  public static void main(String args[]){
    int arr[] = {-1,0,4,8,-4};
    System.out.println("Original numeric array : " + Arrays.toString(arr));
    
    int min = Integer.MAX_VALUE;
    int second_min = Integer.MAX_VALUE;
    
    for(int i=0; i<arr.length; i++){
      if(arr[i] == min){
        second_min = min;
      }else if(arr[i] < min){
        second_min = min;
        min = arr[i];
        
      }else if(arr[i] < second_min){
        second_min = arr[i];
      }
    }
    System.out.println("the second smallest number is :" + second_min);
    }
}