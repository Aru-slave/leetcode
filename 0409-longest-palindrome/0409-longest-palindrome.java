class Solution {
    public int longestPalindrome(String s) {
        //주어진 문자열의 길이가 1이면 1로 리턴
        if(s.length() == 1)
            return 1;
        Map<Character,Integer> map = new HashMap<>();
        int count = 0;
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
       map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i : map.values()){
            if(i % 2 == 0){
                ans = ans + i;
            }
            else {
                ans = ans + i - 1;
                count = 1;
            }
        }
        return ans + count;
            

  
    
        }
    }
