import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] countFrequency(int n, int x, int []nums){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(arr[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
      //***
        for(Map.Entry<Integer, Integer> entry:  map.entrySet()){
            System.out.println(entry.getKey(), " ", entry.getValue());
        }
    }
}
