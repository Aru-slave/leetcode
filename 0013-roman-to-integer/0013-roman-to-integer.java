import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        int ans = 0, num = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (int i = 0; i < s.length(); i++) {
            if (i != s.length() - 1) { // 마지막인 문자열이 아닌 경우
                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                    ans = ans - map.get('I') + map.get('V');
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                    ans = ans - map.get('I') + map.get('X');
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                    ans = ans - map.get('X') + map.get('L');
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                    ans = ans - map.get('X') + map.get('C');
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                    ans = ans - map.get('C') + map.get('D');
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                    ans = ans - map.get('C') + map.get('M');
                    i++;
                    continue;
                }
                ans = ans + map.get(s.charAt(i));
            } else ans = ans + map.get(s.charAt(i));//마지막 문자열인 경우
        }

        return ans;
    }
}