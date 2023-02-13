class Solution {
    public int[] countBits(int n) {
        int[] nums = new int[n+1];
        int count = 0;
        int num = 0;
        for(int i = 0; i <= n; i++){
            num = i;
            count = 0;
            while(num != 0){
                if(num%2 == 1)
                    count++;
                num = num/2;
            }
            nums[i] = count;
        }
         return nums;
    }
   
}