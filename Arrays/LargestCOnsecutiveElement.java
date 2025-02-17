public class LargestCOnsecutiveElement{
    public static int LargestCOnsecutiveElement(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
           if(arr[i] > max){
            max = arr[i];
           }
           
        }
        return max;
    }
    public static void main(String args[]){
        int arr[] = {49,1,3,200,2,4,70,50};
        int result = LargestCOnsecutiveElement(arr);
        System.out.println("The largest consecutive element is : " + result);
    }
}