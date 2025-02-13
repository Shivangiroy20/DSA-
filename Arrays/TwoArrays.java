public class TwoArrays{
    public static int Arrays(int arr1[] , int arr2[]){
        for(int i =0; i < arr1.length; i++){
            for(int j=0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    return arr1[i];
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr1[] = {2,4,6,8};
        int arr2[] ={3,4,6,7};
        System.out.println("The nummber is : " + Arrays(arr1,arr2));
    }
}