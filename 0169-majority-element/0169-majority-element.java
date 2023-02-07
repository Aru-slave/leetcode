import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int max = 0;
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                map.replace(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i],1);
                list.add(nums[i]);
            }
        }
        for(int i = 0; i < list.size(); i++){
            if(map.get(list.get(i)) > max){
             max = map.get(list.get(i));
                 ans = list.get(i);
                }
        }
        return ans;
    }
}