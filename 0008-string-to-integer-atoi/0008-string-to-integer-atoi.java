import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int myAtoi(String s) {
        Queue<Character> queue = new LinkedList<>();
        boolean plus = true;
        boolean check = false;
        boolean zero = false;
        Integer ans = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
            if(!queue.isEmpty() || zero|| count == 1) break;
                continue;
            }
            if(s.charAt(i) == '.'){
            if(!queue.isEmpty() || zero) break;
                check = true;
                continue;
            }

            if(queue.isEmpty() && s.charAt(i) == '0'){
                 zero = true;
                 continue;
            }
               
            if(s.charAt(i) == '-'|| s.charAt(i) == '+'){
                count++;
                 if(!queue.isEmpty()|| count > 1 || zero) break;
                 
                 if(s.charAt(i) == '-'){
                    plus = false;
                     continue;
                }
                continue;
            }
         
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')||(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')){
                check = true;
            if(!queue.isEmpty() || zero) break;
                continue;

            }
            if(!check)
            queue.add(s.charAt(i));
        }
        StringBuilder sb  = new StringBuilder();
        while(!queue.isEmpty()){
            sb.append(queue.poll());
        }
        if(sb.length() == 0) return 0;
        try { 
            if (plus) {
                 ans = Integer.parseInt(sb.toString());
            } else ans = -1 * Integer.parseInt(sb.toString());
        }
        catch (Exception o){
            if(plus) return Integer.MAX_VALUE;
            else return Integer.MIN_VALUE;
        }
        return ans;
    }
}