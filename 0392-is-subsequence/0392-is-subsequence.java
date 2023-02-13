class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        char[] chars = s.toCharArray();
        int index = 0;
        for(int i = 0; i < t.length(); i++){
            if(chars[index] == t.charAt(i))
                index++;
            if(index == chars.length) return true;
        }
        return false;
    }
}