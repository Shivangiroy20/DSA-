public class AverageofArray{
    public static double Average(int arr[]){
        int sum =0;
        for(int i =0; i < arr.length ; i++){
            sum = sum + arr[i];
        }
        double Average = sum / arr.length;
        return Average;
    }
    public static void main(String arg[]){
        int arr[] = {3,4,5,7,9};
        System.out.println("Average of an Array : " + Average(arr));
    }
}