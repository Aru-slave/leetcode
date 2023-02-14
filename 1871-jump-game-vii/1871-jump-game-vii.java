class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        if(s.charAt(n-1)=='1')return false;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        int maxRange = 0;
    
        while(!q.isEmpty()){
          int i = q.poll();
          int l = Math.max(i+minJump, maxRange);
          int r = Math.min(i + maxJump, n-1);
          for(int x=l;x<=r;x++){
            if(x==n-1)return true;
            if(s.charAt(x)=='0'){
              q.add(x);
            }
          }
          maxRange = r+1;
        }
      return false;
    }
}