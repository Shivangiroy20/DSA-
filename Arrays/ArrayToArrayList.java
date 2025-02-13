import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList{
    public static void main(String args[]){
        Integer arr[] = {20,30,40,50,60,70, null};
        ArrayList<Integer>List = new ArrayList<>(Arrays.asList(arr));

        System.out.println(List);
    }
}