import java.util.Arrays;
public class ZeroBased{
    public static int[] insertElement(int[] arr, int element, int index){
        if(index < 0 || index > arr.length ){
            System.out.println("Invalid Index");
            return arr;
        }
        int[] newArr = new int[arr.length + 1];
        int j = 0;
        for( int i = 0; i< newArr.length; i++){
            if(i == index){
            newArr[i] = element;
        }else{
            newArr[i] = arr[j];
            j++;
        }
    }
    return newArr;
}
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        int element = 90;
        int index = 5;
        int[] updateArr= insertElement(arr, element, index);
        System.out.println("updateArray" + Arrays.toString(updateArr));
    }
}