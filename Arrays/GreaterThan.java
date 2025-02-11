public class GreaterThan{
    public static int greaterThan(int arr[], int x, int n){
        int count =0;
        for(int i=0; i< n; i++){
            if(arr[i] > x)
            count++;
        }
        return count;

    }
    public static void main(String args[]){
        int arr[] = {4,5,3,1,2};
        int n = 5;
        int x = 3;
        System.out.println("count of number greater than " + x + ":" + greaterThan(arr, n, x));
        
    }
}