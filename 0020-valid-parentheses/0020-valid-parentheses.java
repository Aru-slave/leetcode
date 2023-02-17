

class Solution {
    public boolean isValid(String s) {
        if(s.charAt(0) == ')'||s.charAt(0) == '}'||s.charAt(0) == ']')
            return false;
        Stack<Character> stack = new Stack();
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('||s.charAt(i) == '{'||s.charAt(i) == '['){
                stack.add(s.charAt(i));
                continue;
            }
            if(!stack.isEmpty()){
                if(s.charAt(i) == map.get(stack.peek()))
                    stack.pop();
                else return false;
            }
            else if(s.charAt(i) == ')'||s.charAt(i) == '}'||s.charAt(i) == ']')
            return false;
        }
        return stack.isEmpty();
    }
}