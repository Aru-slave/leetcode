import java.util.HashMap;
import java.util.Map;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        
        
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int count = 0;
        for(int i = 0; i < first.length(); i++){
            if(first.charAt(i) != last.charAt(i) || i > last.length() - 1)
                return first.substring(0,count);
            count ++;
        }
        return first.substring(0,count);
}
}
