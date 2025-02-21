public class findRotationCount{
    public static int findRotationCount(int arr[], int n){
        int minIndex = 0;
        for(int i=1; i<n; i++){
            if(arr[i] < arr[minIndex]){
            minIndex = i;
        }
    }
        return minIndex;

    }
    public static void main(String args[]){
        int arr[] = {2,1,4,5,6,7};
        int n = arr.length;
        int rotations = findRotationCount(arr, n);
        System.out.println("The array is rotated " + rotations + "times.");

    }
}