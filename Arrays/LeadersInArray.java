public class LeadersInArray{
    public static void main(String args[]){
        int arr[] = {10,20,40,60,600,90,50,80};
        for(int i=0; i<arr.length; i++){
            int j;
            for( j= i+1; j<arr.length; j++){
                if(arr[i] <= arr[j])
                    break;
                }
                if( j == arr.length){
                    System.out.println(arr[i] + " ");
        
    }
}
}
}