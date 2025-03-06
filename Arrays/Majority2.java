public class Majority2{
    public static List<Integer> Majority2(int arr[]){
        int n = arr.length;
        List<Integer> res = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j-i; j<arr.length; j++){
                if(res.size() == 0 ||  arr[i] != res.get(0)){
                    res.add(arr[i]);
                }
            }
            
        }
    }
    public static void main(String args[]){
        int arr[] = {2,2,3,1,3,2,1,1};
    }
}