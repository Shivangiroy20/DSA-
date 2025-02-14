public class FindDifference{
    public static int FindDifference(int arr[]){
        if(arr.length == 0){
            System.out.println("Array is empty");
            return -1;
        }
        int max = arr[0];
        int min = arr[0];
        
        // finding max and min in the array
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];

            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return max - min;
    }
    public static void main(String args[]){
        int arr[] ={5,1,9,3,7,2};
        System.out.println("Difference between largest and smallest element: " + FindDifference(arr));

    }
}