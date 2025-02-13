public class SumOfArrays{
    public static int[] SumOfArrays(int arr1[] , int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int newArr[] = new int [n * m] ;
        int k =0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
            newArr[k] = arr1[i] + arr2[j];
            k++;
            }
        }
        return newArr;
    }
    public static void main(String args[]){
        int arr1[] = {2,3,4,5};
        int arr2[] = {6,7,8,9};
        int newArr[] = SumOfArrays(arr1, arr2);
        System.out.println("The new Array is : " );
        for(int num : newArr){
            System.out.print(num + " ");
        }
    }
}