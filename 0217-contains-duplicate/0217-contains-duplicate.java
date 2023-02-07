class Solution {
    public boolean containsDuplicate(int[] nums) {
      Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
            if(count != set.size())
            count = set.size();
            else return true;
        }
        return false;
    }
}