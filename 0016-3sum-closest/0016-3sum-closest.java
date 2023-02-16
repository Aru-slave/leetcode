class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            int k = i + 1;
            int j = nums.length - 1;
            
            while(k < j){
                int sum = nums[i] + nums[k] + nums[j];
                if(Math.abs(target - ans) > Math.abs(target - sum))
                    ans = sum;
                if(target > sum) {
                    k++;
                    continue;
                }
                if(target < sum){
                    j--;
                    continue;
                }
                if(target == sum){
                    return ans;
                }
            }
        }
        return ans;
    }
}