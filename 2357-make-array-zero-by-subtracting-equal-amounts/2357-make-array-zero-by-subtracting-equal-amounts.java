import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int minimumOperations(int[] nums) {
    Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(i != 0)
            set.add(i);
        }
        return set.size();
}
}