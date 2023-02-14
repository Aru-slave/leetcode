class Solution {
    public boolean canJump(int[] nums) {
        int curEnd = 0;
        int maxEnd = 0;
        int n = nums.length - 1;
        if(n == 0) return true;
        for(int i = 0; i < n; i++){
            maxEnd = Math.max(maxEnd,i + nums[i]);
            if(i == curEnd){
                curEnd = maxEnd;
                if(curEnd >= n) return true;
            }
            
        }
        return false;
    }
}