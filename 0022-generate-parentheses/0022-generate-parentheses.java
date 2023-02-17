import java.util.LinkedList;
import java.util.List;

class Solution {
    List<String> ans = new LinkedList<>();
    public List<String> generateParenthesis(int n) {
        if ( n == 0) return ans;
        dfs(n,"(",1,0);
        return ans;
    }
    public void dfs(int n, String str,int left,int right){
        if(left > n || right > n || right > left) return;
        if(n * 2 == str.length()) {
            ans.add(str);
            return;
        }
            dfs(n,str + '(',left+1,right);
            dfs(n,str + ')',left,right+1);
        }
    }
