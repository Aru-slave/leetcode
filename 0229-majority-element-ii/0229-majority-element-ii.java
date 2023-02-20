
class Solution {
public List<Integer> majorityElement(int[] nums) {
    List res = new ArrayList<>();
    
    Integer first = null;
    Integer second = null;
    
    int count1 = 0;
    int count2 = 0;
    
    for(int i = 0; i < nums.length; i++){
        if(first == null || first == nums[i]) {
            first = nums[i];
            count1++;
        }else if(second == null || second == nums[i]) {
            second = nums[i];
            count2++;
        }else if(count1 == 0){
            first = nums[i];
            count1++;
        }else if(count2 == 0){
            second = nums[i];
            count2++;
        }else{
            count1--;
            count2--;
        }
    }
    
    count1 = 0;
    count2 = 0;
    
    for(int i = 0; i < nums.length; i++){
        if(first != null && nums[i] == first ) count1++;
        if(second != null && nums[i] == second) count2++;
    }
    
    int n = nums.length;
    if(count1 > n/3) res.add(first);
    if(count2 > n/3) res.add(second);
    
    return res;
}
}