import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count = nums.length / 3;
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        if(nums.length == 1) {
            list.add(nums[0]);
            return list;
        }
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i : map.keySet()){
            if(map.get(i) > count)
                list.add(i);
        }
        return list;
    }
}