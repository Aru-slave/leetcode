import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String largestNumber(int[] nums) {
        List<String> list = new ArrayList<>(nums.length);

        for(int i = 0; i < nums.length; i++){
            list.add(String.valueOf(nums[i]));
        }
        list.sort((a, b) -> {
            String exam1 = a + b;
            String exam2 = b + a;
            if (Long.parseLong(exam2) > Long.parseLong(exam1)) return 1;
            else return -1;
        });
    if (list.get(0).charAt(0) == '0') {
        return "0";
    }
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < list.size(); i++){
                sb.append(list.get(i));
            }
            return sb.toString();
        }
    }