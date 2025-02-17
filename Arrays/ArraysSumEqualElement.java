public class ArraysSumEqualElement{
    public static boolean ArraysSumEqualElement(int arr[]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum == 30;
    }
    public static void main(String args[]){
        int arr[] = {2,3,4,5,6,7,8,3,5,6};
        System.out.println(ArraysSumEqualElement(arr));
    }
}