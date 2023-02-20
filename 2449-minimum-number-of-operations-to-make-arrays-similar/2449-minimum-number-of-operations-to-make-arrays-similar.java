class Solution {
private long solve(int nums[], int target[], int oddEven){
	 long res = 0L;
	 int n=nums.length;
	 for(int i=0, j=0; i<n && j<n;){
            if(nums[i]%2 == oddEven){
                i++;
                continue;
            }
            if(target[j]%2 == oddEven){
                j++;
                continue;
            }
            
            res += Math.abs(nums[i] - target[j]) / 2;
            i++; j++;
        }
		return res;
}

public long makeSimilar(int[] nums, int[] target) {
        Arrays.sort(nums);
        Arrays.sort(target);
        long res = solve(nums,target, 1)+ solve(nums, target, 0);
    
        return res / 2;
    }
}