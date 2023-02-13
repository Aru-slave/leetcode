class Solution {
    public boolean isSubsequence(String s, String t) {
        Queue<Character> queue = new LinkedList<>();
        for(int i = 0; i < s.length(); i++){
            queue.add(s.charAt(i));
        }
        if(queue.size() == 0) return true;
        for(int i = 0; i < t.length(); i++){
            if(queue.size() != 0){
            if(queue.peek() == t.charAt(i))
                queue.poll();
        }
            else break;
        }
        if(queue.isEmpty()) return true;
        else return false;
    }
}