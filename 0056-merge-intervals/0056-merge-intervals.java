import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        Stack<int[]> merged = new Stack<>();
        for (int[] interval : intervals) {
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if(merged.isEmpty()) {
                merged.add(interval);
                continue;
            }
            if (merged.peek()[1] < interval[0]) {
                merged.add(interval);
            }
            // otherwise, there is overlap, so we merge the current and previous
            // intervals.
            else {
                int[] arr = merged.pop();
                arr[1] = Math.max(arr[1], interval[1]);
                merged.add(arr);
            }
        }
        return merged.toArray(new int[0][merged.size()]);
    }
}