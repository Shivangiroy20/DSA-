public class InsertElementAtLast{
    public static int InsertElement(int arr[], int element,int sizeOfArray){
        arr[sizeOfArray-1] = element;
        return element;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int sizeOfArray = 5;
        int element = 90;
        System.out.println("Inserted Element is : " + InsertElement(arr, element, sizeOfArray));
        System.out.print("Updated Array is : ");
        for( int num : arr){
            System.out.print( num + " ");
        }
    }
}