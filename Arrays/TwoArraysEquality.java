import java.util.Arrays;
public class TwoArraysEquality{
    public static boolean TwoArraysEquality(int arr1[] , int arr2[]){
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String args[]){
        int arr1[]={2,4,6,8};
        int arr2[]={2,4,6,8};
        if(TwoArraysEquality(arr1, arr2)){
            System.out.println("Both arrays are equal.");
           }else{
             System.out.println("Both arrays are not equal");
           }

    }
}