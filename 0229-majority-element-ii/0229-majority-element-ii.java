

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count = nums.length / 3;
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        if(nums.length == 1) {
            list.add(nums[0]);
            return list;
            }
        for(int i = 0,j = nums.length - 1; i <= j; i++,j--){
            if(map.get(nums[i]) == null){
                map.put(nums[i],1);
            }
            else map.put(nums[i],map.get(nums[i])+1);
        if(i != j){
        if(map.get(nums[j]) == null){
            map.put(nums[j],1);
        }
        else map.put(nums[j],map.get(nums[j])+1);
    }
        }
        for(int i : map.keySet()){
            if(map.get(i) > count)
                list.add(i);
        }
        return list;
    }
}