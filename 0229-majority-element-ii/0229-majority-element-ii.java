import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i : map.keySet()){
            if(map.get(i) > nums.length / 3)
                list.add(i);
        }
        return list;
    }
}