public class FindMAjorityElement{
    public static int FindMAjorityElement(int nums[]){
        int candidate = 0 , count = 0;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        count = 0; for(int num : nums){
            if(num == candidate){
                count++;
            }
        }
        return(count > nums.length /2) ? candidate : -1;
    }

    public static void main(String args[]){
        int arr[] = {3,3,4,5,3,3,3,3,2,4,3};
        System.out.println(FindMAjorityElement(arr));
    }
}