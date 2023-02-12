class Solution {
    public int longestPalindrome(String s) {
        //주어진 문자열의 길이가 1이면 1로 리턴
        if(s.length() == 1)
            return 1;
        Map<Character,Integer> map = new HashMap<>();
        List<Character> list = new LinkedList<>();
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == null){
                map.put(s.charAt(i),1);
                list.add(s.charAt(i));
            }
            else {
                map.replace(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
            
            for(int i = 0; i < list.size(); i++){
                ans = ans + (map.get(list.get(i))/2)*2 ;
                if(map.get(list.get(i))%2 == 0){
                    list.remove(i);
                    i--;
                }
                }
        if(list.size() == 0)
            return ans;
        else return ans+1;
  
    
        }
    }
