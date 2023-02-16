class Solution {
public List<List<Integer>> threeSum(int[] nums) {
    int n=  nums.length ;
    Arrays.sort(nums); 
    
    Set<List<Integer>> ans = new HashSet<>();
    for(int i= 0 ;i<n-2 ;i++){
            // Using Two pointers method with sorted entries 
            int tar = -1*nums[i];
            int s = i+1 , e = n-1;
            while(s<e){
                int val = nums[s]+nums[e];
                if(val == tar){
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]) ; res.add(nums[s]) ; res.add(nums[e]);
                    ans.add(res);
                    s++;e--;
                }else if(val > tar) e--;
                 else s++;
            }
       }
    return new ArrayList<>(ans);
}
}