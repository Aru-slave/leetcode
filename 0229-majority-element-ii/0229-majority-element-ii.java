
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count = nums.length / 3;
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) == null){
                map.put(nums[i],1);
            }
            else map.put(nums[i],map.get(nums[i])+1);
        }
        for(int i : map.keySet()){
            if(map.get(i) > count)
                list.add(i);
        }
        return list;
    }
}