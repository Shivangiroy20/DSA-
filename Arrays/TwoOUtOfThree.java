import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class TwoOUtOfThree{
    public static List<Integer> TwoOUtOfThree(int nums1[] , int nums2[] , int nums3[]){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        
        for(int num : nums1) set1.add(num);
        for(int num : nums2) set2.add(num);
        for(int num : nums3) set3.add(num);
        
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for(int num : set1) countMap.put(num, countMap.getOrDefault(num,0)+1);
        for(int num : set2) countMap.put(num, countMap.getOrDefault(num,0)+1);
        for(int num : set3) countMap.put(num, countMap.getOrDefault(num,0)+1);
        
        List<Integer> result = new ArrayList<>();
        for(int key : countMap.keySet()){
          if(countMap.get(key) >= 2){
            result.add(key);
          }
        }
        return result;
      }
      public static void main(String args[]){
        int nums1[] = {1,1,3,2};
        int nums2[] = {2,3};
        int nums3[] = {3};
        
        System.out.println(TwoOUtOfThree(nums1, nums2, nums3));
      }
    }