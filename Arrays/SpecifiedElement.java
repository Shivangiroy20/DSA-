public class SpecifiedElement{
    public static int SpecifiedElement(int arr[]){
        for(int i=0; i<arr.length;i++){
            if(arr[i] == 65 || arr[i] == 77){
                System.out.println("Containing element:" + arr[i]);
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {34,23,5,65,77,89};
        SpecifiedElement(arr);
    }
}