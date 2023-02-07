import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int ans = 0;
        if(nums.length == 1)
            return nums[0];
        for(int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                map.replace(nums[i], map.get(nums[i]) + 1);
                if(max < map.get(nums[i])){
                    max = map.get(nums[i]);
                    ans = nums[i];
                }
                    
            } else {
                map.put(nums[i],1);
            }
        }

        return ans;
    }
}